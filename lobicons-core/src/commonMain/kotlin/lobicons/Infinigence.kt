package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _infinigence: ImageVector? = null

val Lobicons.Infinigence: ImageVector
    get() {
        if (_infinigence != null) return _infinigence!!
        _infinigence = ImageVector.Builder(
            name = "Infinigence",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M14.186 19.885V4.226H5v4.137h4.226v11.522H5V24h13.412v-4.115h-4.226z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M18.412 0h-4.226v4.226h4.226V0z")
            }
        }.build()
        return _infinigence!!
    }
