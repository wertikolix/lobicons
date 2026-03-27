package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _openwebui: ImageVector? = null

val Lobicons.Openwebui: ImageVector
    get() {
        if (_openwebui != null) return _openwebui!!
        _openwebui = ImageVector.Builder(
            name = "Openwebui",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M17.697 12c0 4.97-3.962 9-8.849 9C3.962 21 0 16.97 0 12s3.962-9 8.848-9c4.887 0 8.849 4.03 8.849 9zm-3.636 0c0 2.928-2.334 5.301-5.213 5.301-2.878 0-5.212-2.373-5.212-5.301S5.97 6.699 8.848 6.699c2.88 0 5.213 2.373 5.213 5.301z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M24 3h-3.394v18H24V3z")
            }
        }.build()
        return _openwebui!!
    }
