package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _vercel: ImageVector? = null

val Lobicons.Vercel: ImageVector
    get() {
        if (_vercel != null) return _vercel!!
        _vercel = ImageVector.Builder(
            name = "Vercel",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 0l12 20.785H0L12 0z")
            }
        }.build()
        return _vercel!!
    }
