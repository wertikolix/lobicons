package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _togethercolor: ImageVector? = null

val Lobicons.TogetherColor: ImageVector
    get() {
        if (_togethercolor != null) return _togethercolor!!
        _togethercolor = ImageVector.Builder(
            name = "TogetherColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M17.385 11.23a4.615 4.615 0 100-9.23 4.615 4.615 0 000 9.23zm0 10.77a4.615 4.615 0 100-9.23 4.615 4.615 0 000 9.23zm-10.77 0a4.615 4.615 0 100-9.23 4.615 4.615 0 000 9.23z")
            }
            path(fill = SolidColor(Color(0xFF0F6FFF))) {
                pathData("M2.0,6.615 A4.615,4.615,0,1,1,11.23,6.615 A4.615,4.615,0,1,1,2.0,6.615Z")
            }
        }.build()
        return _togethercolor!!
    }
