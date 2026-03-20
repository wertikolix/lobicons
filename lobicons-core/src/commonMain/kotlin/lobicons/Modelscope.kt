package lobicons

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _modelscope: ImageVector? = null

val Lobicons.Modelscope: ImageVector
    get() {
        if (_modelscope != null) return _modelscope!!
        _modelscope = ImageVector.Builder(
            name = "Modelscope",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M2.667 5.3H8v2.667H5.333v2.666H2.667V8.467H.5v2.166h2.167V13.3H0V7.967h2.667V5.3zM2.667 13.3h2.666v2.667H8v2.666H2.667V13.3zM8 10.633h2.667V13.3H8v-2.667zM13.333 13.3v2.667h-2.666V13.3h2.666zM13.333 13.3v-2.667H16V13.3h-2.667z")
            }
            path(pathFillType = PathFillType.EvenOdd) {
                pathData("M21.333 13.3v-2.667h-2.666V7.967H16V5.3h5.333v2.667H24V13.3h-2.667zm0-2.667H23.5V8.467h-2.167v2.166z")
            }
            path {
                pathData("M21.333 13.3v5.333H16v-2.666h2.667V13.3h2.666z")
            }
        }.build()
        return _modelscope!!
    }
