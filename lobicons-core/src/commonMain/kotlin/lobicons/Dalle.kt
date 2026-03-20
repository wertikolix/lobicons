package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _dalle: ImageVector? = null

val Lobicons.Dalle: ImageVector
    get() {
        if (_dalle != null) return _dalle!!
        _dalle = ImageVector.Builder(
            name = "Dalle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M0 10h4.8v5H0z")
            }
            path {
                pathData("M4.8 10h4.8v5H4.8z")
            }
            path {
                pathData("M9.6 10h4.8v5H9.6z")
            }
            path {
                pathData("M14.4 10h4.8v5h-4.8z")
            }
            path {
                pathData("M19.2 10H24v5h-4.8z")
            }
        }.build()
        return _dalle!!
    }
