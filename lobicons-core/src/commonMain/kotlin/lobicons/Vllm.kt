package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _vllm: ImageVector? = null

val Lobicons.Vllm: ImageVector
    get() {
        if (_vllm != null) return _vllm!!
        _vllm = ImageVector.Builder(
            name = "Vllm",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M0 4.973h9.324V23L0 4.973z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M13.986 4.351L22.378 0l-6.216 23H9.324l4.662-18.649z")
            }
        }.build()
        return _vllm!!
    }
