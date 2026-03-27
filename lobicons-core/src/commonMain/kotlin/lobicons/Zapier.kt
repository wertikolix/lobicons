package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _zapier: ImageVector? = null

val Lobicons.Zapier: ImageVector
    get() {
        if (_zapier != null) return _zapier!!
        _zapier = ImageVector.Builder(
            name = "Zapier",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M18.5 16h-13v3h13v-3z")
            }
        }.build()
        return _zapier!!
    }
