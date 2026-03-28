# Lobicons

Kotlin Multiplatform AI provider icons for Compose. 490+ icons from [lobe-icons](https://github.com/lobehub/lobe-icons).

[![Maven Central](https://img.shields.io/maven-central/v/ru.wertik.lobicons/lobicons-core)](https://central.sonatype.com/artifact/ru.wertik.lobicons/lobicons-core)

## Setup

```kotlin
// build.gradle.kts
dependencies {
    implementation("ru.wertik.lobicons:lobicons-core:0.2.0")
}
```

## Usage

```kotlin
import lobicons.Lobicons
import lobicons.*
import org.jetbrains.compose.resources.painterResource

// mono icon — tint with any color
Image(
    painter = painterResource(Lobicons.Openai),
    contentDescription = "OpenAI",
    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
)

// color icon — as is
Image(
    painter = painterResource(Lobicons.ClaudeColor),
    contentDescription = "Claude",
)
```

## Variants

- `Lobicons.Openai` — mono (use `ColorFilter.tint()` to set color)
- `Lobicons.OpenaiColor` — full color

Each icon returns a `DrawableResource` — render with `painterResource()`.

## Targets

- Android
- iOS (x64, arm64, simulator)
- Desktop (JVM)
- Wasm/JS

## Regenerating icons

```sh
git clone https://github.com/lobehub/lobe-icons /tmp/lobe-icons
python3 generator/generate.py /tmp/lobe-icons
```

## Migration from 0.1.x

0.2.0 switched from `ImageVector` to native SVG resources.

```diff
- Icon(imageVector = Lobicons.Openai, ...)
+ Image(painter = painterResource(Lobicons.Openai), ...)
```

`compose.components.resources` is now a transitive dependency.

## License

Apache 2.0. Icons from [lobehub/lobe-icons](https://github.com/lobehub/lobe-icons).
