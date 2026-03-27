package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _opencode: ImageVector? = null

val Lobicons.Opencode: ImageVector
    get() {
        if (_opencode != null) return _opencode!!
        _opencode = ImageVector.Builder(
            name = "Opencode",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M16 6H8v12h8V6zm4 16H4V2h16v20z")
            }
        }.build()
        return _opencode!!
    }
