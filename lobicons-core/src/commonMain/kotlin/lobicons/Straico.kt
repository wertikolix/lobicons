package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _straico: ImageVector? = null

val Lobicons.Straico: ImageVector
    get() {
        if (_straico != null) return _straico!!
        _straico = ImageVector.Builder(
            name = "Straico",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M22 6h-5.278l3.166-6h-8.443L3 16h6.333v8L22 6z")
            }
        }.build()
        return _straico!!
    }
