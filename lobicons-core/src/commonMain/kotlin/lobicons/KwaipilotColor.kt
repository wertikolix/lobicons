package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _kwaipilotcolor: ImageVector? = null

val Lobicons.KwaipilotColor: ImageVector
    get() {
        if (_kwaipilotcolor != null) return _kwaipilotcolor!!
        _kwaipilotcolor = ImageVector.Builder(
            name = "KwaipilotColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF9EC0E0))) {
                pathData("M11.765.03C5.327.03.108 5.25.108 11.686c0 3.514 1.556 6.665 4.015 8.804L9.89 8.665h6.451L9.31 23.083c.807.173 1.63.26 2.455.26 6.438 0 11.657-5.22 11.657-11.658S18.202.028 11.765.028V.03z")
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                pathData("M4.123 20.489l6.362-13.046c.017-.036.035-.073.055-.11l.086-.18h.005a6.697 6.697 0 015.913-3.551c2.784 0 5.171 1.7 6.184 4.116-1.622-4.485-5.92-7.69-10.963-7.69C5.327.028.108 5.247.108 11.685c0 3.514 1.556 6.666 4.015 8.804z")
            }
        }.build()
        return _kwaipilotcolor!!
    }
