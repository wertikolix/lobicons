package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _doc2x: ImageVector? = null

val Lobicons.Doc2x: ImageVector
    get() {
        if (_doc2x != null) return _doc2x!!
        _doc2x = ImageVector.Builder(
            name = "Doc2x",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M21.66 7.017a3.308 3.308 0 10-4.677-4.678l-3.458 3.458a3.308 3.308 0 104.678 4.677l3.458-3.457zM10.475 18.203a3.308 3.308 0 10-4.678-4.678l-3.458 3.458a3.308 3.308 0 104.678 4.677l3.458-3.457z")
            }
            path {
                pathData("M18.203 13.525a3.308 3.308 0 10-4.678 4.678l3.458 3.458a3.308 3.308 0 004.678-4.678l-3.458-3.458zM7.017 2.339a3.308 3.308 0 10-4.678 4.678l3.458 3.457a3.308 3.308 0 004.677-4.678L7.017 2.34z")
            }
        }.build()
        return _doc2x!!
    }
