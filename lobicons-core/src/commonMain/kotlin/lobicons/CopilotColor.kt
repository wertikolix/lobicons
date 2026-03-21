package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _copilotcolor: ImageVector? = null

val Lobicons.CopilotColor: ImageVector
    get() {
        if (_copilotcolor != null) return _copilotcolor!!
        _copilotcolor = ImageVector.Builder(
            name = "CopilotColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M17.533 1.829A2.528 2.528 0 0015.11 0h-.737a2.531 2.531 0 00-2.484 2.087l-1.263 6.937.314-1.08a2.528 2.528 0 012.424-1.833h4.284l1.797.706 1.731-.706h-.505a2.528 2.528 0 01-2.423-1.829l-.715-2.453z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M6.726 20.16A2.528 2.528 0 009.152 22h1.566c1.37 0 2.49-1.1 2.525-2.48l.17-6.69-.357 1.228a2.528 2.528 0 01-2.423 1.83h-4.32l-1.54-.842-1.667.843h.497c1.124 0 2.113.75 2.426 1.84l.697 2.432z")
            }
            path(fill = Brush.linearGradient(
                    0.156f to Color(0xFF0D91E1), 0.48700000000000004f to Color(0xFF52B471), 0.652f to Color(0xFF98BD42), 0.937f to Color(0xFFFFC800),
                    start = Offset(9.471600000000002f, 2.9080800000000004f),
                    end = Offset(11.25216f, 24.90576f),
                )) {
                pathData("M15 0H6.252c-2.5 0-4 3.331-5 6.662-1.184 3.947-2.734 9.225 1.75 9.225H6.78c1.13 0 2.12-.753 2.43-1.847.657-2.317 1.809-6.359 2.713-9.436.46-1.563.842-2.906 1.43-3.742A1.97 1.97 0 0115 0")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF3DCBFF), 0.247f to Color(0x000588F7),
                    start = Offset(11.027759999999999f, 0.0f),
                    end = Offset(12.0f, 24.0f),
                )) {
                pathData("M15 0H6.252c-2.5 0-4 3.331-5 6.662-1.184 3.947-2.734 9.225 1.75 9.225H6.78c1.13 0 2.12-.753 2.43-1.847.657-2.317 1.809-6.359 2.713-9.436.46-1.563.842-2.906 1.43-3.742A1.97 1.97 0 0115 0")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M9 22h8.749c2.5 0 4-3.332 5-6.663 1.184-3.948 2.734-9.227-1.75-9.227H17.22c-1.129 0-2.12.754-2.43 1.848a1149.2 1149.2 0 01-2.713 9.437c-.46 1.564-.842 2.907-1.43 3.743A1.97 1.97 0 019 22")
            }
            path(fill = Brush.linearGradient(
                    0.057999999999999996f to Color(0xFFF8ADFA), 0.708f to Color(0x00A86EDD),
                    start = Offset(20.041680000000003f, -1.4654399999999999f),
                    end = Offset(20.02872f, 5.07144f),
                )) {
                pathData("M9 22h8.749c2.5 0 4-3.332 5-6.663 1.184-3.948 2.734-9.227-1.75-9.227H17.22c-1.129 0-2.12.754-2.43 1.848a1149.2 1149.2 0 01-2.713 9.437c-.46 1.564-.842 2.907-1.43 3.743A1.97 1.97 0 019 22")
            }
        }.build()
        return _copilotcolor!!
    }
