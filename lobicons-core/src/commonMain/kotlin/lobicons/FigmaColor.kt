package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _figmacolor: ImageVector? = null

val Lobicons.FigmaColor: ImageVector
    get() {
        if (_figmacolor != null) return _figmacolor!!
        _figmacolor = ImageVector.Builder(
            name = "FigmaColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF24CB71))) {
                pathData("M4 20a4 4 0 014-4h4v4a4 4 0 01-8 0z")
            }
            path(fill = SolidColor(Color(0xFFFF7237))) {
                pathData("M12 0v8h4a4 4 0 000-8h-4z")
            }
            path(fill = SolidColor(Color(0xFF00B6FF))) {
                pathData("M15.967 16a4 4 0 100-8 4 4 0 000 8z")
            }
            path(fill = SolidColor(Color(0xFFFF3737))) {
                pathData("M4 4a4 4 0 004 4h4V0H8a4 4 0 00-4 4z")
            }
            path(fill = SolidColor(Color(0xFF874FFF))) {
                pathData("M4 12a4 4 0 004 4h4V8H8a4 4 0 00-4 4z")
            }
        }.build()
        return _figmacolor!!
    }
