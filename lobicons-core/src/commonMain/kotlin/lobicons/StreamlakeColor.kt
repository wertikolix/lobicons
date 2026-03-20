package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _streamlakecolor: ImageVector? = null

val Lobicons.StreamlakeColor: ImageVector
    get() {
        if (_streamlakecolor != null) return _streamlakecolor!!
        _streamlakecolor = ImageVector.Builder(
            name = "StreamlakeColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF1D70FF))) {
                pathData("M12 3.9c-2.54 0-4.88-.92-6.76-2.44-.18-.14-.44-.12-.56.08L.98 6.42c-.12.16-.1.4.06.54C4.04 9.6 7.86 11.2 12 11.2c4.14 0 7.96-1.58 10.96-4.24.16-.14.18-.38.06-.54l-3.68-4.9c-.14-.18-.4-.22-.56-.08-1.88 1.54-4.22 2.44-6.76 2.44L12 3.9zM12 20.1c-2.54 0-4.88.92-6.76 2.44-.18.14-.44.12-.56-.08L1 17.56c-.12-.16-.1-.4.06-.54 3-2.64 6.82-4.24 10.96-4.24 4.14 0 7.96 1.58 10.96 4.24.16.14.18.38.06.54l-3.68 4.9c-.14.18-.4.22-.56.08-1.88-1.54-4.22-2.44-6.76-2.44H12z")
            }
        }.build()
        return _streamlakecolor!!
    }
