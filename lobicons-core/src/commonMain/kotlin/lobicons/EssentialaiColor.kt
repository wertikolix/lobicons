package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _essentialaicolor: ImageVector? = null

val Lobicons.EssentialaiColor: ImageVector
    get() {
        if (_essentialaicolor != null) return _essentialaicolor!!
        _essentialaicolor = ImageVector.Builder(
            name = "EssentialaiColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M3.429 10.75c0 2.32.903 4.546 2.51 6.187A8.484 8.484 0 0012 19.5a8.484 8.484 0 006.06-2.563 8.843 8.843 0 002.511-6.187H24c0 3.249-1.264 6.365-3.515 8.662A11.877 11.877 0 0112 23c-3.183 0-6.235-1.29-8.485-3.588A12.38 12.38 0 010 10.75h3.429zm13.714 0a5.306 5.306 0 01-1.507 3.712A5.09 5.09 0 0112 16a5.09 5.09 0 01-3.637-1.538 5.306 5.306 0 01-1.506-3.712h10.286zM12 2c2.273 0 4.453.922 6.06 2.563a8.843 8.843 0 012.511 6.187h-3.428a5.306 5.306 0 00-1.507-3.712A5.09 5.09 0 0012 5.5a5.09 5.09 0 00-3.637 1.538 5.306 5.306 0 00-1.506 3.712H3.43c0-2.32.903-4.546 2.51-6.187A8.484 8.484 0 0112 2z")
            }
        }.build()
        return _essentialaicolor!!
    }
