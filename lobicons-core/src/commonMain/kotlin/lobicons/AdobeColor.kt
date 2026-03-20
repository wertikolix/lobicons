package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _adobecolor: ImageVector? = null

val Lobicons.AdobeColor: ImageVector
    get() {
        if (_adobecolor != null) return _adobecolor!!
        _adobecolor = ImageVector.Builder(
            name = "AdobeColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFEB1000))) {
                pathData("M14.86 3H23v19zM9.14 3H1v19zM11.992 9.998L17.182 22h-3.394l-1.549-3.813h-3.79z")
            }
        }.build()
        return _adobecolor!!
    }
