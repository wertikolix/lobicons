#!/usr/bin/env python3

import re
import shutil
import sys
from pathlib import Path

PACKAGE = "lobicons"
OUTPUT_KT = "lobicons-core/src/commonMain/kotlin/lobicons"
OUTPUT_RES = "lobicons-core/src/commonMain/composeResources/drawable"


def svg_name_to_kotlin(filename: str) -> tuple[str, str | None]:
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


def resource_name(filename: str) -> str:
    # compose resources need lowercase snake_case, no hyphens
    name = filename.removesuffix(".svg")
    name = name.replace("-", "_")
    # prefix with ic_ to avoid conflicts
    return f"ic_{name}"


def generate_accessor(prop_name: str, res_name: str) -> str:
    return (
        f"val Lobicons.{prop_name}: DrawableResource\n"
        f"    get() = Res.drawable.{res_name}\n"
    )


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

    # clean old files
    for f in kt_dir.glob("*.kt"):
        if f.name not in ("Lobicons.kt",):
            f.unlink()
    for f in res_dir.glob("ic_*.svg"):
        f.unlink()

    # write Lobicons object
    (kt_dir / "Lobicons.kt").write_text(f"package {PACKAGE}\n\nobject Lobicons\n")

    # can also delete PathData.kt since we no longer need it
    pathdata = kt_dir / "PathData.kt"
    if pathdata.exists():
        pathdata.unlink()

    svg_files = sorted(svg_dir.glob("*.svg"))
    print(f"found {len(svg_files)} svg files")

    accessors = []
    generated = 0
    skipped = 0

    for svg_file in svg_files:
        name = svg_file.name
        if "-text" in name or "-brand" in name:
            skipped += 1
            continue

        prop_name, variant = svg_name_to_kotlin(name)
        actual_prop = prop_name if not variant else f"{prop_name}{variant}"
        res = resource_name(name)

        # copy svg to resources
        shutil.copy2(svg_file, res_dir / f"{res}.svg")

        # collect accessor
        accessors.append(generate_accessor(actual_prop, res))
        generated += 1

    # write single accessors file
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

    print(f"generated {generated} icons, skipped {skipped}")


if __name__ == "__main__":
    main()
