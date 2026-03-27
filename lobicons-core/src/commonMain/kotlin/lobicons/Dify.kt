package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _dify: ImageVector? = null

val Lobicons.Dify: ImageVector
    get() {
        if (_dify != null) return _dify!!
        _dify = ImageVector.Builder(
            name = "Dify",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M7.043 6.487c1.635 0 2.241-1.003 2.241-2.243S8.681 2 7.044 2C5.405 2 4.801 3.003 4.801 4.244c0 1.24.604 2.243 2.241 2.243z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M14.883 6.97v1.443h-3.679v3.203h3.68v8.012H8.801V8.41h-8v3.203h4.48v8.012H0v3.203h24v-3.203h-5.6v-8.012H24V8.41h-5.6V5.206H24V2.003h-4.161a4.97 4.97 0 00-4.961 4.967h.005z")
            }
        }.build()
        return _dify!!
    }
