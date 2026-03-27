package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _rsshub: ImageVector? = null

val Lobicons.Rsshub: ImageVector
    get() {
        if (_rsshub != null) return _rsshub!!
        _rsshub = ImageVector.Builder(
            name = "Rsshub",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M8.0,1.0 L16.0,1.0 A7.0,7.0,0,0,1,23.0,8.0 L23.0,16.0 A7.0,7.0,0,0,1,16.0,23.0 L8.0,23.0 A7.0,7.0,0,0,1,1.0,16.0 L1.0,8.0 A7.0,7.0,0,0,1,8.0,1.0Z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M1.13 6.646C1.046 7.084 1 7.536 1 8v8a7 7 0 007 7h8a7.04 7.04 0 001.354-.13A12.154 12.154 0 0018.5 17.7c0-6.738-5.462-12.2-12.2-12.2-1.848 0-3.6.41-5.17 1.146z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M1.7000000000000002,17.75 A4.55,4.55,0,1,1,10.8,17.75 A4.55,4.55,0,1,1,1.7000000000000002,17.75Z")
            }
        }.build()
        return _rsshub!!
    }
