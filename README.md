# Lobicons

Kotlin Multiplatform AI provider icons for Compose. 490+ icons from [lobe-icons](https://github.com/lobehub/lobe-icons).

[![Maven Central](https://img.shields.io/maven-central/v/ru.wertik.lobicons/lobicons-core)](https://central.sonatype.com/artifact/ru.wertik.lobicons/lobicons-core)

## Setup

```kotlin
dependencies {
    implementation("ru.wertik.lobicons:lobicons-core:0.2.1")
}
```

Works with Compose Multiplatform (KMP) and pure Android (Jetpack Compose).

## Usage

```kotlin
import lobicons.Lobicons
import lobicons.*
import org.jetbrains.compose.resources.painterResource

// color icon
Image(
    painter = painterResource(Lobicons.ClaudeColor),
    contentDescription = "Claude",
)

// mono icon — tint with any color
Image(
    painter = painterResource(Lobicons.Openai),
    contentDescription = "OpenAI",
    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
)
```

## Variants

- `Lobicons.Openai` — mono (use `ColorFilter.tint()` to color)
- `Lobicons.OpenaiColor` — full color

Each accessor returns `DrawableResource`, render with `painterResource()`.

## Targets

Android, iOS (x64, arm64, simulator), Desktop (JVM), Wasm/JS.

## How it works

Icons are pre-rendered from SVG to 256x256 lossless WebP at generation time. This preserves all SVG features (radial gradients, masks, filters, blur) and works on all platforms including Android which doesn't support SVG in compose-resources.

## Regenerating icons

Requires Python 3 with `cairosvg` and `pillow`:

```sh
pip install cairosvg pillow
git clone https://github.com/lobehub/lobe-icons /tmp/lobe-icons
python3 generator/generate.py /tmp/lobe-icons
```

## Migration from 0.1.x

API changed from `ImageVector` to `DrawableResource`:

```diff
- Icon(imageVector = Lobicons.Openai, ...)
+ Image(painter = painterResource(Lobicons.Openai), ...)
```

## License

Apache 2.0. Icons from [lobehub/lobe-icons](https://github.com/lobehub/lobe-icons).
