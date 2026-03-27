package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _azure: ImageVector? = null

val Lobicons.Azure: ImageVector
    get() {
        if (_azure != null) return _azure!!
        _azure = ImageVector.Builder(
            name = "Azure",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M18.397 15.296H7.4a.51.51 0 00-.347.882l7.066 6.595c.206.192.477.298.758.298h6.226l-2.706-7.775z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M8.295.857c-.477 0-.9.304-1.053.756L.495 21.605a1.11 1.11 0 001.052 1.466h5.43c.477 0 .9-.304 1.053-.755l1.341-3.975-2.318-2.163a.51.51 0 01.347-.882h3L15.271.857H8.295z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M17.193 1.613a1.11 1.11 0 00-1.052-.756h-7.81.035c.477 0 .9.304 1.052.756l6.748 19.992a1.11 1.11 0 01-1.052 1.466h-.12 7.895a1.11 1.11 0 001.052-1.466L17.193 1.613z")
            }
        }.build()
        return _azure!!
    }
