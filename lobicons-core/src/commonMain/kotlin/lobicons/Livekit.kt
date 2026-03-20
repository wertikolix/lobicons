package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _livekit: ImageVector? = null

val Lobicons.Livekit: ImageVector
    get() {
        if (_livekit != null) return _livekit!!
        _livekit = ImageVector.Builder(
            name = "Livekit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M14 10h-4v4h4v-4zM18 6h-4v4.001h4v-4zM18 14h-4v4h4v-4zM22 2h-4v4h4V2zM22 18h-4v4h4v-4z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M6 18V2H2v20h12v-4H6z")
            }
        }.build()
        return _livekit!!
    }
