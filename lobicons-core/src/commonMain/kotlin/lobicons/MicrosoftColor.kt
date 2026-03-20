package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _microsoftcolor: ImageVector? = null

val Lobicons.MicrosoftColor: ImageVector
    get() {
        if (_microsoftcolor != null) return _microsoftcolor!!
        _microsoftcolor = ImageVector.Builder(
            name = "MicrosoftColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFF25022))) {
                pathData("M11.49 2H2v9.492h9.492V2h-.002z")
            }
            path(fill = SolidColor(Color(0xFF7FBA00))) {
                pathData("M22 2h-9.492v9.492H22V2z")
            }
            path(fill = SolidColor(Color(0xFF00A4EF))) {
                pathData("M11.49 12.508H2V22h9.492v-9.492h-.002z")
            }
            path(fill = SolidColor(Color(0xFFFFB900))) {
                pathData("M22 12.508h-9.492V22H22v-9.492z")
            }
        }.build()
        return _microsoftcolor!!
    }
