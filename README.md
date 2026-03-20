# Lobicons

Kotlin Multiplatform AI provider icons for Compose. 470+ icons from [lobe-icons](https://github.com/lobehub/lobe-icons).

## Setup

```kotlin
// build.gradle.kts
dependencies {
    implementation("io.github.anthropics.lobicons:lobicons-core:0.1.0")
}
```

## Usage

```kotlin
import lobicons.Lobicons
import lobicons.Openai
import lobicons.ClaudeColor

Icon(
    imageVector = Lobicons.Openai,
    contentDescription = "OpenAI",
)

// color variant
Icon(
    imageVector = Lobicons.ClaudeColor,
    contentDescription = "Claude",
    tint = Color.Unspecified,
)
```

## Variants

- `Lobicons.Openai` — mono (tintable)
- `Lobicons.OpenaiColor` — color (use `tint = Color.Unspecified`)

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

## License

Apache 2.0. Icons from [lobehub/lobe-icons](https://github.com/lobehub/lobe-icons).
