package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _ampcolor: ImageVector? = null

val Lobicons.AmpColor: ImageVector
    get() {
        if (_ampcolor != null) return _ampcolor!!
        _ampcolor = ImageVector.Builder(
            name = "AmpColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFF34E3F))) {
                pathData("M15.087 23.18L12.03 24l-2.097-7.823-5.738 5.738-2.251-2.251 5.718-5.719-7.769-2.082.82-3.057 11.294 3.08 3.08 11.295z")
            }
            path(fill = SolidColor(Color(0xFFF34E3F))) {
                pathData("M19.505 18.762l-3.057.82-2.564-9.573-9.572-2.564.819-3.057 11.295 3.079 3.08 11.295z")
            }
            path(fill = SolidColor(Color(0xFFF34E3F))) {
                pathData("M23.893 14.374l-3.057.82-2.565-9.572L8.7 3.057 9.52 0l11.295 3.08 3.079 11.294z")
            }
        }.build()
        return _ampcolor!!
    }
