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
    if not fill or fill == "none":
        return None
    if fill == "currentColor":
        return "Color.Black"
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
            gradient_units = lg.get("gradientUnits", "objectBoundingBox")
            coords = {
                "x1": lg.get("x1", "0"), "y1": lg.get("y1", "0"),
                "x2": lg.get("x2", "0"), "y2": lg.get("y2", "0"),
            }
            gradients[gid] = {"type": "linear", "stops": stops, "coords": coords, "units": gradient_units}

    root_fill = root.get("fill")

    # collect paths
    paths = []
    for elem in root.iter():
        etag = elem.tag.split("}")[-1] if "}" in elem.tag else elem.tag
        if etag == "path":
            d = elem.get("d", "")
            if not d:
                continue
            fill = elem.get("fill") or root_fill
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

    return {
        "title": title,
        "vb_w": vb_w,
        "vb_h": vb_h,
        "paths": paths,
        "gradients": gradients,
    }


def gradient_first_color(gradients: dict, ref: str) -> str:
    g = gradients.get(ref)
    if not g or not g["stops"]:
        return "Color.Black"
    color = g["stops"][0][1]
    return parse_color(color) or "Color.Black"


def parse_stop_color_with_opacity(color_str: str, opacity_str: str) -> str:
    """Returns a Kotlin Color expression with alpha applied."""
    opacity = float(opacity_str)
    color = parse_color(color_str) or "Color.Black"

    if opacity >= 1.0:
        return color

    if opacity <= 0.0:
        # fully transparent version of the color
        # e.g. Color(0xFF3186FF) -> Color(0x003186FF)
        if "0xFF" in color:
            return color.replace("0xFF", "0x00")
        # for named colors, use .copy(alpha = 0f)
        return f"{color}.copy(alpha = 0f)"

    # partial opacity
    alpha_hex = format(int(opacity * 255), "02X")
    if "0xFF" in color:
        return color.replace("0xFF", f"0x{alpha_hex}")
    return f"{color}.copy(alpha = {opacity}f)"


def parse_gradient_coord(val: str, viewport_size: float, is_percentage_mode: bool) -> float:
    """Parse a gradient coordinate value, handling percentages."""
    val = val.strip()
    if val.endswith("%"):
        pct = float(val[:-1]) / 100.0
        if is_percentage_mode:
            # objectBoundingBox: percentages map to viewport coords
            return pct * viewport_size
        return pct * viewport_size
    return float(val)


def emit_gradient_brush(gradients: dict, ref: str, vb_w: float, vb_h: float) -> str:
    """Returns a Kotlin Brush.linearGradient expression."""
    g = gradients[ref]
    stops = g["stops"]
    coords = g["coords"]
    is_pct = g.get("units", "objectBoundingBox") == "objectBoundingBox"

    x1 = parse_gradient_coord(coords["x1"], vb_w, is_pct)
    y1 = parse_gradient_coord(coords["y1"], vb_h, is_pct)
    x2 = parse_gradient_coord(coords["x2"], vb_w, is_pct)
    y2 = parse_gradient_coord(coords["y2"], vb_h, is_pct)

    # Build color stops
    stop_parts = []
    for offset_str, color_str, opacity_str in stops:
        offset_str = offset_str.strip()
        if offset_str.endswith("%"):
            offset = float(offset_str[:-1]) / 100.0
        else:
            offset = float(offset_str)
        color_expr = parse_stop_color_with_opacity(color_str, opacity_str)
        stop_parts.append(f"{offset}f to {color_expr}")

    stops_str = ", ".join(stop_parts)

    return (
        f"Brush.linearGradient(\n"
        f"                    {stops_str},\n"
        f"                    start = Offset({x1}f, {y1}f),\n"
        f"                    end = Offset({x2}f, {y2}f),\n"
        f"                )"
    )


def emit_path(p: dict, gradients: dict, vb_w: float = 24.0, vb_h: float = 24.0) -> list[str]:
    lines = []

    fill_expr = None
    is_gradient = False
    if p["gradient_ref"] and p["gradient_ref"] in gradients:
        fill_expr = emit_gradient_brush(gradients, p["gradient_ref"], vb_w, vb_h)
        is_gradient = True
    elif p["fill"]:
        fill_color = parse_color(p["fill"])
        if fill_color:
            fill_expr = f"SolidColor({fill_color})"

    fill_rule = parse_fill_rule(p["fill_rule"])

    has_builder_params = fill_expr or fill_rule
    if has_builder_params:
        params = []
        if fill_expr:
            params.append(f"fill = {fill_expr}")
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
        for pl in emit_path(p, parsed["gradients"], parsed["vb_w"], parsed["vb_h"]):
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

    has_solid = any(
        p["fill"] and parse_color(p["fill"]) and not p["gradient_ref"]
        for p in parsed["paths"]
    )
    has_gradient = any(
        p["gradient_ref"] and p["gradient_ref"] in parsed.get("gradients", {})
        for p in parsed["paths"]
    )

    imports = [
        "androidx.compose.ui.graphics.vector.ImageVector",
        "androidx.compose.ui.graphics.vector.path",
        "androidx.compose.ui.unit.dp",
    ]
    if has_solid or has_gradient:
        imports.append("androidx.compose.ui.graphics.Color")
    if has_solid:
        imports.append("androidx.compose.ui.graphics.SolidColor")
    if has_gradient:
        imports.append("androidx.compose.ui.graphics.Brush")
        imports.append("androidx.compose.ui.geometry.Offset")

    if any(parse_fill_rule(p["fill_rule"]) for p in parsed["paths"]):
        imports.append("androidx.compose.ui.graphics.PathFillType")

    imports = sorted(set(imports))

    code = generate_icon_code(actual_prop, parsed)
    # replace var name to be unique per file
    code = code.replace("_icon", f"_{actual_prop.lower()}")

    content = f"package {PACKAGE}\n\n"
    for imp in imports:
        content += f"import {imp}\n"
    content += f"\n{code}\n"

    filepath.write_text(content)


def write_pathdata_util(output_dir: Path):
    # PathData.kt is maintained manually, don't overwrite
    filepath = output_dir / "PathData.kt"
    if filepath.exists():
        return


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
