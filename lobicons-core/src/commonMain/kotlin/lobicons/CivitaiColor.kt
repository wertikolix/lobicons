package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _civitaicolor: ImageVector? = null

val Lobicons.CivitaiColor: ImageVector
    get() {
        if (_civitaicolor != null) return _civitaicolor!!
        _civitaicolor = ImageVector.Builder(
            name = "CivitaiColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF1281F4), 1.0f to Color(0xFF0821C6),
                    start = Offset(12.0f, 0.0f),
                    end = Offset(12.0f, 24.0f),
                )) {
                pathData("M12 0l10.392 6v12L12 24 1.608 18V6L12 0z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF09138A), 1.0f to Color(0xFF150740),
                    start = Offset(12.0f, 3.934f),
                    end = Offset(12.0f, 20.066f),
                )) {
                pathData("M12 3.934l6.985 4.033v8.066L12 20.065l-6.985-4.032V7.967L12 3.934z")
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 6.885l4.43 2.558v1.377h-2.386L12 9.64l-2.044 1.18v2.36L12 14.36l2.044-1.18h2.386v1.377L12 17.115l-4.43-2.558V9.443L12 6.885z")
            }
        }.build()
        return _civitaicolor!!
    }
