package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _zapiercolor: ImageVector? = null

val Lobicons.ZapierColor: ImageVector
    get() {
        if (_zapiercolor != null) return _zapiercolor!!
        _zapiercolor = ImageVector.Builder(
            name = "ZapierColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFFF4F00))) {
                pathData("M18.5 16h-13v3h13v-3z")
            }
        }.build()
        return _zapiercolor!!
    }
