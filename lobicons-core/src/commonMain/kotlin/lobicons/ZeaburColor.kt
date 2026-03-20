package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _zeaburcolor: ImageVector? = null

val Lobicons.ZeaburColor: ImageVector
    get() {
        if (_zeaburcolor != null) return _zeaburcolor!!
        _zeaburcolor = ImageVector.Builder(
            name = "ZeaburColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M9.325 15.022h14.672V22H0v-6.978h6.746l9.29-5.044H0V3h23.997v6.978z")
            }
            path(fill = SolidColor(Color(0xFF6300FF))) {
                pathData("M.001 3h15.954v6.978H.001z")
            }
            path(fill = SolidColor(Color(0xFFFF4400))) {
                pathData("M9.4 15.022H24V22H9.4z")
            }
        }.build()
        return _zeaburcolor!!
    }
