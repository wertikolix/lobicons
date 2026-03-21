package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF0000AA), 1.0f to Color(0xFFA78DFF),
                    start = Offset(2.0f, 18.0f),
                    end = Offset(22.785f, 18.0f),
                )) {
                pathData("M12.392 24L2 18l10.392-6 10.393 6-10.393 6z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF0000AA), 1.0f to Color(0xFFA78DFF),
                    start = Offset(2.0f, 18.0f),
                    end = Offset(22.785f, 18.0f),
                )) {
                pathData("M12.392 24L2 18l10.392-6 10.393 6-10.393 6z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF004EFF), 1.0f to Color(0xFF00FFFF),
                    start = Offset(13.748f, 22.642f),
                    end = Offset(4.672f, 3.745f),
                )) {
                pathData("M2 5.999L12.392 0v24L2 18V5.999z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF0000AA), 1.0f to Color(0xFFA78DFF),
                    start = Offset(2.0f, 18.0f),
                    end = Offset(22.785f, 18.0f),
                )) {
                pathData("M12.392 24L2 18l10.392-6 10.393 6-10.393 6z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF004EFF), 1.0f to Color(0xFF00FFFF),
                    start = Offset(13.748f, 22.642f),
                    end = Offset(4.672f, 3.745f),
                )) {
                pathData("M2 5.999L12.392 0v24L2 18V5.999z")
            }
        }.build()
        return _lumacolor!!
    }
