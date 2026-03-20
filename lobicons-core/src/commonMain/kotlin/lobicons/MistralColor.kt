package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _mistralcolor: ImageVector? = null

val Lobicons.MistralColor: ImageVector
    get() {
        if (_mistralcolor != null) return _mistralcolor!!
        _mistralcolor = ImageVector.Builder(
            name = "MistralColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFFFD700))) {
                pathData("M3.428 3.4h3.429v3.428H3.428V3.4zm13.714 0h3.43v3.428h-3.43V3.4z")
            }
            path(fill = SolidColor(Color(0xFFFFAF00))) {
                pathData("M3.428 6.828h6.857v3.429H3.429V6.828zm10.286 0h6.857v3.429h-6.857V6.828z")
            }
            path(fill = SolidColor(Color(0xFFFF8205))) {
                pathData("M3.428 10.258h17.144v3.428H3.428v-3.428z")
            }
            path(fill = SolidColor(Color(0xFFFA500F))) {
                pathData("M3.428 13.686h3.429v3.428H3.428v-3.428zm6.858 0h3.429v3.428h-3.429v-3.428zm6.856 0h3.43v3.428h-3.43v-3.428z")
            }
            path(fill = SolidColor(Color(0xFFE10500))) {
                pathData("M0 17.114h10.286v3.429H0v-3.429zm13.714 0H24v3.429H13.714v-3.429z")
            }
        }.build()
        return _mistralcolor!!
    }
