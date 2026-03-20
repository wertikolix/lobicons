package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _zeabur: ImageVector? = null

val Lobicons.Zeabur: ImageVector
    get() {
        if (_zeabur != null) return _zeabur!!
        _zeabur = ImageVector.Builder(
            name = "Zeabur",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M23.997 3v6.978L9.325 15.022H9.4V22l14.596-.001L0 22v-6.978h6.746l9.29-5.044h-.081V3h8.042z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M.001 3h16.954v6.978H.001zM8.4 15.022H24V22H8.4z")
            }
        }.build()
        return _zeabur!!
    }
