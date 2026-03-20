package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _crusoecolor: ImageVector? = null

val Lobicons.CrusoeColor: ImageVector
    get() {
        if (_crusoecolor != null) return _crusoecolor!!
        _crusoecolor = ImageVector.Builder(
            name = "CrusoeColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFF4BF45))) {
                pathData("M12 0L4.583 6.583c-3.23 2.869-3.23 7.965 0 10.834L12 24l7.417-6.583c3.23-2.869 3.23-7.965 0-10.834L12 0z")
            }
        }.build()
        return _crusoecolor!!
    }
