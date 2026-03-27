package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _civitai: ImageVector? = null

val Lobicons.Civitai: ImageVector
    get() {
        if (_civitai != null) return _civitai!!
        _civitai = ImageVector.Builder(
            name = "Civitai",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M22.392 6L12 0 1.608 6v12L12 24l10.392-6V6zm-3.407 1.967L12 3.934 5.015 7.967v8.066L12 20.065l6.985-4.032V7.967z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 6.885l4.43 2.558v1.377h-2.386L12 9.64l-2.044 1.18v2.36L12 14.36l2.044-1.18h2.386v1.377L12 17.115l-4.43-2.558V9.443L12 6.885z")
            }
        }.build()
        return _civitai!!
    }
