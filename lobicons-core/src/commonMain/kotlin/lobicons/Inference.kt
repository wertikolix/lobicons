package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _inference: ImageVector? = null

val Lobicons.Inference: ImageVector
    get() {
        if (_inference != null) return _inference!!
        _inference = ImageVector.Builder(
            name = "Inference",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M22 21.376h-4.89V2.62H22v18.756zM14.532 21.376h-3.469V2.62h3.469v18.756zM8.764 21.376h-2.66V2.62h2.66v18.756zM3.903 21.376H2V2.62h1.903v18.756z")
            }
        }.build()
        return _inference!!
    }
