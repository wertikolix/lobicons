package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _elevenlabs: ImageVector? = null

val Lobicons.Elevenlabs: ImageVector
    get() {
        if (_elevenlabs != null) return _elevenlabs!!
        _elevenlabs = ImageVector.Builder(
            name = "Elevenlabs",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M5 0h5v24H5V0zM14 0h5v24h-5V0z")
            }
        }.build()
        return _elevenlabs!!
    }
