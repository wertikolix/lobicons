package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _replit: ImageVector? = null

val Lobicons.Replit: ImageVector
    get() {
        if (_replit != null) return _replit!!
        _replit = ImageVector.Builder(
            name = "Replit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M11.878 7.761H3.482A1.469 1.469 0 012 6.304V1.457C2 .644 2.67 0 3.482 0h6.913c.827 0 1.483.658 1.483 1.457v6.304zM20.882 16.215h-8.995V7.75h8.995c.87 0 1.588.717 1.588 1.586v5.294c0 .885-.717 1.586-1.588 1.586zM10.395 24H3.482C2.67 24 2 23.343 2 22.546v-4.853c0-.797.67-1.454 1.482-1.454h8.396v6.307c0 .797-.67 1.454-1.483 1.454z")
            }
        }.build()
        return _replit!!
    }
