package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _sophnet: ImageVector? = null

val Lobicons.Sophnet: ImageVector
    get() {
        if (_sophnet != null) return _sophnet!!
        _sophnet = ImageVector.Builder(
            name = "Sophnet",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M2 3.124A3.125 3.125 0 015.126 0h15.101a3.125 3.125 0 010 6.249H5.125A3.125 3.125 0 012 3.124z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M3.293 1.035a3.125 3.125 0 014.411.257l8.51 9.562a3.125 3.125 0 01-4.669 4.155L3.036 5.447a3.125 3.125 0 01.257-4.412z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M2 13.018a3.125 3.125 0 013.125-3.124h8.853a3.124 3.124 0 110 6.248H5.125A3.125 3.125 0 012 13.018z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M8.249 20.829A3.125 3.125 0 112 20.922a3.125 3.125 0 016.249-.093z")
            }
        }.build()
        return _sophnet!!
    }
