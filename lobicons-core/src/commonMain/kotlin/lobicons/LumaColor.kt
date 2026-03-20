package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _lumacolor: ImageVector? = null

val Lobicons.LumaColor: ImageVector
    get() {
        if (_lumacolor != null) return _lumacolor!!
        _lumacolor = ImageVector.Builder(
            name = "LumaColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                pathData("M2 5.999L12.392 0v24L2 18V5.999z")
            }
            path(fill = SolidColor(Color(0xFF0000AA))) {
                pathData("M12.392 24L2 18l10.392-6 10.393 6-10.393 6z")
            }
            path(fill = SolidColor(Color(0xFF0000AA))) {
                pathData("M12.392 24L2 18l10.392-6 10.393 6-10.393 6z")
            }
            path(fill = SolidColor(Color(0xFF004EFF))) {
                pathData("M2 5.999L12.392 0v24L2 18V5.999z")
            }
            path(fill = SolidColor(Color(0xFF0000AA))) {
                pathData("M12.392 24L2 18l10.392-6 10.393 6-10.393 6z")
            }
            path(fill = SolidColor(Color(0xFF004EFF))) {
                pathData("M2 5.999L12.392 0v24L2 18V5.999z")
            }
        }.build()
        return _lumacolor!!
    }
