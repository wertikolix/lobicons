package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _modelscopecolor: ImageVector? = null

val Lobicons.ModelscopeColor: ImageVector
    get() {
        if (_modelscopecolor != null) return _modelscopecolor!!
        _modelscopecolor = ImageVector.Builder(
            name = "ModelscopeColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF36CED0))) {
                pathData("M0 7.967h2.667v2.667H0zM8 10.633h2.667V13.3H8z")
            }
            path(fill = SolidColor(Color(0xFF624AFF))) {
                pathData("M0 10.633h2.667V13.3H0zM2.667 13.3h2.666v2.667H8v2.666H2.667V13.3zM2.667 5.3H8v2.667H5.333v2.666H2.667V5.3zM10.667 13.3h2.667v2.667h-2.667z")
            }
            path(fill = SolidColor(Color(0xFF36CED0))) {
                pathData("M24 7.967h-2.667v2.667H24zM16 10.633h-2.667V13.3H16z")
            }
            path(fill = SolidColor(Color(0xFF624AFF))) {
                pathData("M24 10.633h-2.667V13.3H24zM21.333 13.3h-2.666v2.667H16v2.666h5.333V13.3zM21.333 5.3H16v2.667h2.667v2.666h2.666V5.3z")
            }
        }.build()
        return _modelscopecolor!!
    }
