package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _luma: ImageVector? = null

val Lobicons.Luma: ImageVector
    get() {
        if (_luma != null) return _luma!!
        _luma = ImageVector.Builder(
            name = "Luma",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M12.393 24L2 17.998l10.393-6 10.392 6-10.393 6z")
            }
            path {
                pathData("M2 5.999L12.393 0v24L2 18V5.999z")
            }
        }.build()
        return _luma!!
    }
