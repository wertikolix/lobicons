package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _skyworkcolor: ImageVector? = null

val Lobicons.SkyworkColor: ImageVector
    get() {
        if (_skyworkcolor != null) return _skyworkcolor!!
        _skyworkcolor = ImageVector.Builder(
            name = "SkyworkColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF4D5EFF))) {
                pathData("M13.433 1.756a8.316 8.316 0 00-10.69.392 8.335 8.335 0 00-.598 11.765 8.317 8.317 0 0010.596 1.476L6.278 8.226l7.155-6.47z")
            }
            path(fill = SolidColor(Color(0xFF00FFCE))) {
                pathData("M10.568 21.742a8.316 8.316 0 0010.688-.392 8.336 8.336 0 00.598-11.765 8.317 8.317 0 00-10.596-1.476l6.463 7.163-7.155 6.47h.002z")
            }
        }.build()
        return _skyworkcolor!!
    }
