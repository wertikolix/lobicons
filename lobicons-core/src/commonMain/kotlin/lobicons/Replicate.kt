package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _replicate: ImageVector? = null

val Lobicons.Replicate: ImageVector
    get() {
        if (_replicate != null) return _replicate!!
        _replicate = ImageVector.Builder(
            name = "Replicate",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M22 10.552v2.26h-7.932V22H11.54V10.552H22zM22 2v2.264H4.528V22H2V2h20zm0 4.276V8.54H9.296V22H6.768V6.276H22z")
            }
        }.build()
        return _replicate!!
    }
