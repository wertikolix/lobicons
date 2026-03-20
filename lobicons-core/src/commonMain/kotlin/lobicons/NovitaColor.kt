package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _novitacolor: ImageVector? = null

val Lobicons.NovitaColor: ImageVector
    get() {
        if (_novitacolor != null) return _novitacolor!!
        _novitacolor = ImageVector.Builder(
            name = "NovitaColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF23D57C)), pathFillType = PathFillType.EvenOdd) {
                pathData("M9.167 4.17v5.665L0 19.003h9.167v-5.666l5.666 5.666H24L9.167 4.17z")
            }
        }.build()
        return _novitacolor!!
    }
