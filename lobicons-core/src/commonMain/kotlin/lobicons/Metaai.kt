package lobicons

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _metaai: ImageVector? = null

val Lobicons.Metaai: ImageVector
    get() {
        if (_metaai != null) return _metaai!!
        _metaai = ImageVector.Builder(
            name = "Metaai",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(pathFillType = PathFillType.EvenOdd) {
                pathData("M12 0c6.627 0 12 5.373 12 12s-5.373 12-12 12S0 18.627 0 12 5.373 0 12 0zm0 3.627a8.373 8.373 0 100 16.746 8.373 8.373 0 000-16.746z")
            }
        }.build()
        return _metaai!!
    }
