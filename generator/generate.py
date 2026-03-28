#!/usr/bin/env python3

import io
import re
import sys
from pathlib import Path

import cairosvg
from PIL import Image

PACKAGE = "lobicons"
OUTPUT_KT = "lobicons-core/src/commonMain/kotlin/lobicons"
OUTPUT_RES = "lobicons-core/src/commonMain/composeResources/drawable"
RENDER_SIZE = 128


def svg_name_to_kotlin(filename):
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
    return prop, variant


def resource_name(filename):
    name = filename.removesuffix(".svg")
    return f"ic_{name.replace('-', '_')}"


def svg_to_webp(svg_path, out_path, size=RENDER_SIZE):
    svg_data = svg_path.read_bytes()
    png_data = cairosvg.svg2png(bytestring=svg_data, output_width=size, output_height=size)
    img = Image.open(io.BytesIO(png_data))
    img.save(out_path, "WEBP", lossless=True)


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

    kt_dir = output_root / OUTPUT_KT
    res_dir = output_root / OUTPUT_RES
    kt_dir.mkdir(parents=True, exist_ok=True)
    res_dir.mkdir(parents=True, exist_ok=True)

    for f in kt_dir.glob("*.kt"):
        if f.name != "Lobicons.kt":
            f.unlink()
    for f in res_dir.glob("ic_*"):
        f.unlink()

    (kt_dir / "Lobicons.kt").write_text(f"package {PACKAGE}\n\nobject Lobicons\n")

    svg_files = sorted(svg_dir.glob("*.svg"))
    print(f"found {len(svg_files)} svg files")

    accessors = []
    generated = 0
    skipped = 0
    errors = 0

    for svg_file in svg_files:
        name = svg_file.name
        if "-text" in name or "-brand" in name:
            skipped += 1
            continue

        prop_name, variant = svg_name_to_kotlin(name)
        actual_prop = prop_name if not variant else f"{prop_name}{variant}"
        res = resource_name(name)

        try:
            svg_to_webp(svg_file, res_dir / f"{res}.webp")
        except Exception as e:
            print(f"  error ({name}): {e}", file=sys.stderr)
            errors += 1
            continue

        accessors.append(
            f"val Lobicons.{actual_prop}: DrawableResource\n"
            f"    get() = Res.drawable.{res}\n"
        )
        generated += 1

    lines = [
        f"package {PACKAGE}",
        "",
        "import lobicons.lobicons_core.generated.resources.Res",
        "import lobicons.lobicons_core.generated.resources.*",
        "import org.jetbrains.compose.resources.DrawableResource",
        "",
    ]
    lines.extend(accessors)
    (kt_dir / "LobiconsAccessors.kt").write_text("\n".join(lines))

    print(f"generated {generated}, skipped {skipped}, errors {errors}")


if __name__ == "__main__":
    main()
