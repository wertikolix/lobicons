package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _adobe: ImageVector? = null

val Lobicons.Adobe: ImageVector
    get() {
        if (_adobe != null) return _adobe!!
        _adobe = ImageVector.Builder(
            name = "Adobe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M14.86 3H23v19zM9.14 3H1v19zM11.992 9.998L17.182 22h-3.394l-1.549-3.813h-3.79z")
            }
        }.build()
        return _adobe!!
    }
