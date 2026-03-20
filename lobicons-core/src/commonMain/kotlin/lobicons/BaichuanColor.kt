package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _baichuancolor: ImageVector? = null

val Lobicons.BaichuanColor: ImageVector
    get() {
        if (_baichuancolor != null) return _baichuancolor!!
        _baichuancolor = ImageVector.Builder(
            name = "BaichuanColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFFEC13E))) {
                pathData("M7.333 2h-3.2l-2 4.333V17.8L0 22h5.2l2.028-4.2L7.333 2zm7.334 0h-5.2v20h5.2V2zM16.8 7.733H22V22h-5.2V7.733zM22 2h-5.2v4.133H22V2z")
            }
        }.build()
        return _baichuancolor!!
    }
