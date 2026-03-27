package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _azureai: ImageVector? = null

val Lobicons.Azureai: ImageVector
    get() {
        if (_azureai != null) return _azureai!!
        _azureai = ImageVector.Builder(
            name = "Azureai",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M16.233 0c.713 0 1.345.551 1.572 1.329.227.778 1.555 5.59 1.555 5.59v9.562h-4.813L14.645 0h1.588z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M23.298 7.47c0-.34-.275-.6-.6-.6h-2.835a3.617 3.617 0 00-3.614 3.615v5.996h3.436a3.617 3.617 0 003.613-3.614V7.47z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M16.233 0a.982.982 0 00-.989.989l-.097 18.198A4.814 4.814 0 0110.334 24H1.6a.597.597 0 01-.567-.794l7-19.981A4.819 4.819 0 0112.57 0h3.679-.016z")
            }
        }.build()
        return _azureai!!
    }
