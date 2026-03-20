package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _nebius: ImageVector? = null

val Lobicons.Nebius: ImageVector
    get() {
        if (_nebius != null) return _nebius!!
        _nebius = ImageVector.Builder(
            name = "Nebius",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M20 2.306v16.797s4-.242 4-4.815V2.306h-4zM4 22.001V5.204s-4 .242-4 4.816V22h4z")
            }
            path {
                pathData("M16.318 16.51L11.286 4.94c-.824-1.872-2.168-2.926-4.077-2.926-1.908 0-3.211 1.54-3.211 3.19 0 0 2.405-.333 3.68 2.593l5.036 11.57c.821 1.87 2.168 2.926 4.075 2.926 1.905 0 3.211-1.541 3.211-3.19 0 0-2.406.333-3.682-2.594z")
            }
        }.build()
        return _nebius!!
    }
