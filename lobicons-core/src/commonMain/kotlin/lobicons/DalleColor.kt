package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _dallecolor: ImageVector? = null

val Lobicons.DalleColor: ImageVector
    get() {
        if (_dallecolor != null) return _dallecolor!!
        _dallecolor = ImageVector.Builder(
            name = "DalleColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFFFFF67))) {
                pathData("M0 10h4.8v5H0z")
            }
            path(fill = SolidColor(Color(0xFF43FFFF))) {
                pathData("M4.8 10h4.8v5H4.8z")
            }
            path(fill = SolidColor(Color(0xFF51DA4B))) {
                pathData("M9.6 10h4.8v5H9.6z")
            }
            path(fill = SolidColor(Color(0xFFFF6E3D))) {
                pathData("M14.4 10h4.8v5h-4.8z")
            }
            path(fill = SolidColor(Color(0xFF3C46FF))) {
                pathData("M19.2 10H24v5h-4.8z")
            }
        }.build()
        return _dallecolor!!
    }
