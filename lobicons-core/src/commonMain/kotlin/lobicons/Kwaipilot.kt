package lobicons

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _kwaipilot: ImageVector? = null

val Lobicons.Kwaipilot: ImageVector
    get() {
        if (_kwaipilot != null) return _kwaipilot!!
        _kwaipilot = ImageVector.Builder(
            name = "Kwaipilot",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(pathFillType = PathFillType.EvenOdd) {
                pathData("M11.765.03C5.327.03.108 5.25.108 11.686c0 3.514 1.556 6.665 4.015 8.804L9.89 8.665h6.451L9.31 23.083c.807.173 1.63.26 2.455.26 6.438 0 11.657-5.22 11.657-11.658S18.202.028 11.765.028V.03z")
            }
        }.build()
        return _kwaipilot!!
    }
