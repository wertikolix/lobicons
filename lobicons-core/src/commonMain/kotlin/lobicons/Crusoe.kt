package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _crusoe: ImageVector? = null

val Lobicons.Crusoe: ImageVector
    get() {
        if (_crusoe != null) return _crusoe!!
        _crusoe = ImageVector.Builder(
            name = "Crusoe",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M12 0L4.583 6.583c-3.23 2.869-3.23 7.965 0 10.834L12 24l7.417-6.583c3.23-2.869 3.23-7.965 0-10.834L12 0z")
            }
        }.build()
        return _crusoe!!
    }
