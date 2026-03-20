#!/usr/bin/env python3
"""
Converts SVG icons from lobehub/lobe-icons into Kotlin ImageVector files.
Reads from packages/static-svg/icons/ and writes to lobicons-core/src/commonMain/kotlin/lobicons/.
"""

import os
import re
import sys
import xml.etree.ElementTree as ET
from pathlib import Path

NS = {"svg": "http://www.w3.org/2000/svg"}

PACKAGE = "lobicons"
OUTPUT_REL = "lobicons-core/src/commonMain/kotlin/lobicons"


def svg_name_to_kotlin(filename: str) -> tuple[str, str | None]:
    """Returns (property_name, variant) from svg filename.
    e.g. 'openai.svg' -> ('OpenAi', None)
         'openai-color.svg' -> ('OpenAi', 'Color')
         'claude-text.svg' -> ('Claude', 'Text')
         'ai21-brand-color.svg' -> ('Ai21Brand', 'Color')
    """
    name = filename.removesuffix(".svg")

    variant = None
    if name.endswith("-color"):
        variant = "Color"
        name = name.removesuffix("-color")
    elif name.endswith("-text"):
        variant = "Text"
        name = name.removesuffix("-text")

    parts = name.split("-")
    prop = "".join(p.capitalize() for p in parts)
    # fix numbers: "ai21" -> "Ai21", not "Ai21"
    # already fine since capitalize only uppercases first char
    return prop, variant


def parse_color(fill: str | None) -> str | None:
    if not fill or fill == "none" or fill == "currentColor":
        return None
    if fill.startswith("#"):
        hex_val = fill[1:]
        if len(hex_val) == 3:
            hex_val = "".join(c * 2 for c in hex_val)
        return f"Color(0xFF{hex_val.upper()})"
    # named colors
    named = {
        "white": "Color.White", "black": "Color.Black",
        "red": "Color.Red", "blue": "Color.Blue",
        "green": "Color.Green", "gold": "Color(0xFFFFD700)",
        "yellow": "Color.Yellow", "orange": "Color(0xFFFFA500)",
    }
    return named.get(fill.lower(), f"Color.Black")


def parse_fill_rule(rule: str | None) -> str | None:
    if rule == "evenodd" or rule == "evenOdd":
        return "PathFillType.EvenOdd"
    return None


def parse_svg(svg_path: Path) -> dict | None:
    try:
        tree = ET.parse(svg_path)
    except ET.ParseError:
        print(f"  skip (parse error): {svg_path.name}", file=sys.stderr)
        return None

    root = tree.getroot()
    tag = root.tag.split("}")[-1] if "}" in root.tag else root.tag
    if tag != "svg":
        return None

    vb = root.get("viewBox", "0 0 24 24")
    parts = vb.split()
    vb_w, vb_h = float(parts[2]), float(parts[3])

    title_el = root.find("{http://www.w3.org/2000/svg}title")
    if title_el is None:
        title_el = root.find("title")
    title = title_el.text if title_el is not None else svg_path.stem

    # collect gradients
    gradients = {}
    for defs in list(root.iter("{http://www.w3.org/2000/svg}defs")) + list(root.iter("defs")):
        for lg in list(defs.iter("{http://www.w3.org/2000/svg}linearGradient")) + list(defs.iter("linearGradient")):
            gid = lg.get("id", "")
            stops = []
            for stop in list(lg.iter("{http://www.w3.org/2000/svg}stop")) + list(lg.iter("stop")):
                offset = stop.get("offset", "0")
                color = stop.get("stop-color", "#000000")
                opacity = stop.get("stop-opacity", "1")
                stops.append((offset, color, opacity))
            coords = {
                "x1": lg.get("x1", "0"), "y1": lg.get("y1", "0"),
                "x2": lg.get("x2", "0"), "y2": lg.get("y2", "0"),
            }
            gradients[gid] = {"type": "linear", "stops": stops, "coords": coords}

    # collect paths
    paths = []
    for elem in root.iter():
        etag = elem.tag.split("}")[-1] if "}" in elem.tag else elem.tag
        if etag == "path":
            d = elem.get("d", "")
            if not d:
                continue
            fill = elem.get("fill")
            fill_rule = elem.get("fill-rule") or elem.get("clip-rule")

            # check if fill references a gradient
            gradient_ref = None
            if fill and fill.startswith("url(#"):
                gid = fill[5:-1]
                if gid in gradients:
                    gradient_ref = gid
                    fill = None

            paths.append({
                "d": d,
                "fill": fill,
                "fill_rule": fill_rule,
                "gradient_ref": gradient_ref,
            })
        elif etag == "circle":
            cx = float(elem.get("cx", "0"))
            cy = float(elem.get("cy", "0"))
            r = float(elem.get("r", "0"))
            fill = elem.get("fill")
            gradient_ref = None
            if fill and fill.startswith("url(#"):
                gid = fill[5:-1]
                if gid in gradients:
                    gradient_ref = gid
                    fill = None
            # approximate circle as path
            d = (f"M{cx-r},{cy} "
                 f"A{r},{r},0,1,1,{cx+r},{cy} "
                 f"A{r},{r},0,1,1,{cx-r},{cy}Z")
            paths.append({"d": d, "fill": fill, "fill_rule": None, "gradient_ref": gradient_ref})
        elif etag == "rect":
            x = float(elem.get("x", "0"))
            y = float(elem.get("y", "0"))
            w = float(elem.get("width", "0"))
            h = float(elem.get("height", "0"))
            rx = float(elem.get("rx", "0"))
            ry = float(elem.get("ry", "0"))
            fill = elem.get("fill")
            gradient_ref = None
            if fill and fill.startswith("url(#"):
                gid = fill[5:-1]
                if gid in gradients:
                    gradient_ref = gid
                    fill = None
            if rx > 0 or ry > 0:
                # rounded rect
                r = max(rx, ry)
                d = (f"M{x+r},{y} L{x+w-r},{y} "
                     f"A{r},{r},0,0,1,{x+w},{y+r} L{x+w},{y+h-r} "
                     f"A{r},{r},0,0,1,{x+w-r},{y+h} L{x+r},{y+h} "
                     f"A{r},{r},0,0,1,{x},{y+h-r} L{x},{y+r} "
                     f"A{r},{r},0,0,1,{x+r},{y}Z")
            else:
                d = f"M{x},{y} L{x+w},{y} L{x+w},{y+h} L{x},{y+h}Z"
            paths.append({"d": d, "fill": fill, "fill_rule": None, "gradient_ref": gradient_ref})

    if not paths:
        return None

    # for color icons with gradients, we skip gradient fills and just use the first
    # non-gradient path's approach. gradient support in ImageVector is limited,
    # so for gradient paths we use the first stop color as a flat fill.
    has_gradient = any(p["gradient_ref"] for p in paths)

    return {
        "title": title,
        "vb_w": vb_w,
        "vb_h": vb_h,
        "paths": paths,
        "gradients": gradients,
        "has_gradient": has_gradient,
    }


def gradient_first_color(gradients: dict, ref: str) -> str:
    g = gradients.get(ref)
    if not g or not g["stops"]:
        return "Color.Black"
    color = g["stops"][0][1]
    return parse_color(color) or "Color.Black"


def emit_path(p: dict, gradients: dict) -> list[str]:
    lines = []

    fill_color = None
    if p["gradient_ref"]:
        fill_color = gradient_first_color(gradients, p["gradient_ref"])
    elif p["fill"]:
        fill_color = parse_color(p["fill"])

    fill_rule = parse_fill_rule(p["fill_rule"])

    has_builder_params = fill_color or fill_rule
    if has_builder_params:
        params = []
        if fill_color:
            params.append(f"fill = SolidColor({fill_color})")
        if fill_rule:
            params.append(f"pathFillType = {fill_rule}")
        lines.append(f"path({', '.join(params)}) {{")
    else:
        lines.append("path {")

    d = p["d"]
    lines.append(f'    pathData("{escape_kotlin(d)}")')
    lines.append("}")
    return lines


def escape_kotlin(s: str) -> str:
    return s.replace("\\", "\\\\").replace('"', '\\"').replace("$", "\\$")


def generate_icon_code(prop_name: str, parsed: dict) -> str:
    lines = []
    lines.append(f'private var _icon: ImageVector? = null')
    lines.append("")
    lines.append(f"val Lobicons.{prop_name}: ImageVector")
    lines.append(f"    get() {{")
    lines.append(f"        if (_icon != null) return _icon!!")
    lines.append(f"        _icon = ImageVector.Builder(")
    lines.append(f'            name = "{prop_name}",')
    lines.append(f"            defaultWidth = {parsed['vb_w']:.1f}.dp,")
    lines.append(f"            defaultHeight = {parsed['vb_h']:.1f}.dp,")
    lines.append(f"            viewportWidth = {parsed['vb_w']:.1f}f,")
    lines.append(f"            viewportHeight = {parsed['vb_h']:.1f}f,")
    lines.append(f"        ).apply {{")

    for p in parsed["paths"]:
        for pl in emit_path(p, parsed["gradients"]):
            lines.append(f"            {pl}")

    lines.append(f"        }}.build()")
    lines.append(f"        return _icon!!")
    lines.append(f"    }}")

    return "\n".join(lines)


def write_icon_file(output_dir: Path, prop_name: str, variant: str | None, parsed: dict):
    filename = prop_name
    if variant:
        filename += variant
    filepath = output_dir / f"{filename}.kt"

    actual_prop = prop_name if not variant else f"{prop_name}{variant}"

    has_color = any(
        (p["fill"] and parse_color(p["fill"])) or p["gradient_ref"]
        for p in parsed["paths"]
    )

    imports = [
        "androidx.compose.ui.graphics.vector.ImageVector",
        "androidx.compose.ui.graphics.vector.path",
        "androidx.compose.ui.unit.dp",
    ]
    if has_color:
        imports.append("androidx.compose.ui.graphics.Color")
        imports.append("androidx.compose.ui.graphics.SolidColor")

    if any(parse_fill_rule(p["fill_rule"]) for p in parsed["paths"]):
        imports.append("androidx.compose.ui.graphics.PathFillType")

    imports.sort()

    code = generate_icon_code(actual_prop, parsed)
    # replace var name to be unique per file
    code = code.replace("_icon", f"_{actual_prop.lower()}")

    content = f"package {PACKAGE}\n\n"
    for imp in imports:
        content += f"import {imp}\n"
    content += f"\n{code}\n"

    filepath.write_text(content)


def write_pathdata_util(output_dir: Path):
    filepath = output_dir / "PathData.kt"
    filepath.write_text(f'''package {PACKAGE}

import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.PathParser

internal fun PathBuilder.pathData(data: String) {{
    PathParser().parsePathString(data).toNodes().forEach {{ node ->
        when (node) {{
            is androidx.compose.ui.graphics.vector.PathNode.MoveTo -> moveTo(node.x, node.y)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo -> moveToRelative(node.dx, node.dy)
            is androidx.compose.ui.graphics.vector.PathNode.LineTo -> lineTo(node.x, node.y)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo -> lineToRelative(node.dx, node.dy)
            is androidx.compose.ui.graphics.vector.PathNode.HorizontalTo -> horizontalLineTo(node.x)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo -> horizontalLineToRelative(node.dx)
            is androidx.compose.ui.graphics.vector.PathNode.VerticalTo -> verticalLineTo(node.y)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo -> verticalLineToRelative(node.dy)
            is androidx.compose.ui.graphics.vector.PathNode.CurveTo -> curveTo(node.x1, node.y1, node.x2, node.y2, node.x3, node.y3)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo -> curveToRelative(node.dx1, node.dy1, node.dx2, node.dy2, node.dx3, node.dy3)
            is androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo -> reflectiveCurveTo(node.x1, node.y1, node.x2, node.y2)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo -> reflectiveCurveToRelative(node.dx1, node.dy1, node.dx2, node.dy2)
            is androidx.compose.ui.graphics.vector.PathNode.QuadTo -> quadTo(node.x1, node.y1, node.x2, node.y2)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo -> quadToRelative(node.dx1, node.dy1, node.dx2, node.dy2)
            is androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo -> reflectiveQuadTo(node.x1, node.y1)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo -> reflectiveQuadToRelative(node.dx1, node.dy1)
            is androidx.compose.ui.graphics.vector.PathNode.ArcTo -> arcTo(node.horizontalEllipseRadius, node.verticalEllipseRadius, node.theta, node.isMoreThanHalf, node.isPositiveArc, node.arcStartX, node.arcStartY)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo -> arcToRelative(node.horizontalEllipseRadius, node.verticalEllipseRadius, node.theta, node.isMoreThanHalf, node.isPositiveArc, node.arcStartDx, node.arcStartDy)
            is androidx.compose.ui.graphics.vector.PathNode.Close -> close()
        }}
    }}
}}
''')


def write_lobicons_object(output_dir: Path):
    filepath = output_dir / "Lobicons.kt"
    filepath.write_text(f"""package {PACKAGE}

object Lobicons
""")


def main():
    if len(sys.argv) < 2:
        print("usage: generate.py <lobe-icons-dir> [output-root]", file=sys.stderr)
        sys.exit(1)

    lobe_dir = Path(sys.argv[1])
    output_root = Path(sys.argv[2]) if len(sys.argv) > 2 else Path(__file__).parent.parent

    svg_dir = lobe_dir / "packages" / "static-svg" / "icons"
    if not svg_dir.is_dir():
        print(f"svg dir not found: {svg_dir}", file=sys.stderr)
        sys.exit(1)

    output_dir = output_root / OUTPUT_REL
    output_dir.mkdir(parents=True, exist_ok=True)

    # clean old generated files (except Lobicons.kt and PathData.kt)
    for f in output_dir.glob("*.kt"):
        if f.name not in ("Lobicons.kt", "PathData.kt"):
            f.unlink()

    write_lobicons_object(output_dir)
    write_pathdata_util(output_dir)

    svg_files = sorted(svg_dir.glob("*.svg"))
    print(f"found {len(svg_files)} svg files")

    generated = 0
    skipped = 0

    # skip -text variants for now (they're usually wordmarks, too complex)
    # and -brand variants
    for svg_file in svg_files:
        name = svg_file.name
        if "-text" in name or "-brand" in name:
            skipped += 1
            continue

        prop_name, variant = svg_name_to_kotlin(name)
        parsed = parse_svg(svg_file)
        if not parsed:
            skipped += 1
            continue

        write_icon_file(output_dir, prop_name, variant, parsed)
        generated += 1

    print(f"generated {generated} icon files, skipped {skipped}")


if __name__ == "__main__":
    main()
