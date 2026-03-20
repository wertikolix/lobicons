package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _metaaicolor: ImageVector? = null

val Lobicons.MetaaiColor: ImageVector
    get() {
        if (_metaaicolor != null) return _metaaicolor!!
        _metaaicolor = ImageVector.Builder(
            name = "MetaaiColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFFF97E3)), pathFillType = PathFillType.EvenOdd) {
                pathData("M12 0c6.627 0 12 5.373 12 12s-5.373 12-12 12S0 18.627 0 12 5.373 0 12 0zm0 3.627a8.373 8.373 0 100 16.746 8.373 8.373 0 000-16.746z")
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                pathData("M0 0h24v24H0z")
            }
        }.build()
        return _metaaicolor!!
    }
