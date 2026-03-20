package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _parasail: ImageVector? = null

val Lobicons.Parasail: ImageVector
    get() {
        if (_parasail != null) return _parasail!!
        _parasail = ImageVector.Builder(
            name = "Parasail",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M0 15.852c4.5 0 8.147 3.648 8.147 8.148H0v-8.148z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M0 7.688v.018C9 7.706 16.294 15 16.294 24h.019l-.018-.036c3.33-.2 8.864-2.447 7.49-9.58A19.95 19.95 0 009.61.213C2.482-1.155.235 4.374.036 7.704L0 7.688z")
            }
        }.build()
        return _parasail!!
    }
