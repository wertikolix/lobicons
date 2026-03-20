package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _microsoft: ImageVector? = null

val Lobicons.Microsoft: ImageVector
    get() {
        if (_microsoft != null) return _microsoft!!
        _microsoft = ImageVector.Builder(
            name = "Microsoft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M11.49 2H2v9.492h9.492V2h-.002z")
            }
            path {
                pathData("M22 2h-9.492v9.492H22V2z")
            }
            path {
                pathData("M11.49 12.508H2V22h9.492v-9.492h-.002z")
            }
            path {
                pathData("M22 12.508h-9.492V22H22v-9.492z")
            }
        }.build()
        return _microsoft!!
    }
