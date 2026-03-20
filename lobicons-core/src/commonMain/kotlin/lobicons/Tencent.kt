package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _tencent: ImageVector? = null

val Lobicons.Tencent: ImageVector
    get() {
        if (_tencent != null) return _tencent!!
        _tencent = ImageVector.Builder(
            name = "Tencent",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M9.976 1L24 9.8l-10.587.015L10.723 23H5.489L8.18 9.8H3.244L1 5.4h8.077L9.976 1z")
            }
        }.build()
        return _tencent!!
    }
