package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _askverdict: ImageVector? = null

val Lobicons.Askverdict: ImageVector
    get() {
        if (_askverdict != null) return _askverdict!!
        _askverdict = ImageVector.Builder(
            name = "Askverdict",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 3.42L4.5 7.97 12 12.47Z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 3.42L19.5 7.97 12 12.47Z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 6.56L14.48 8.95 13.08 8.95 12 7.73 10.83 8.95 9.42 8.95Z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M4.5 13.88L12 16.83 19.5 13.88 19.5 15.61 12 18.56 4.5 15.61Z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M5.3 16.83L12 19.55 18.7 16.83 18.7 18.38 12 20.77 5.3 18.38Z")
            }
        }.build()
        return _askverdict!!
    }
