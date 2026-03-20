package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _automatic: ImageVector? = null

val Lobicons.Automatic: ImageVector
    get() {
        if (_automatic != null) return _automatic!!
        _automatic = ImageVector.Builder(
            name = "Automatic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M8.462 3.5h2.924l8.33 17h-1.46L10.617 4.942l-1.442.001z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M5.474 20.5l2.817-5.366 2.873 5.366h5.541l-8.362-17L0 20.5z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M12.768 3.501L21.113 20.5h1.46L14.238 3.504z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M14.195 3.501L22.54 20.5H24L15.666 3.504z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M11.34 3.501L19.683 20.5h1.464L12.81 3.504z")
            }
        }.build()
        return _automatic!!
    }
