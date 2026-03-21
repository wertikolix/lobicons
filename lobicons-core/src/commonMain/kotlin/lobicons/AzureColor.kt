package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _azurecolor: ImageVector? = null

val Lobicons.AzureColor: ImageVector
    get() {
        if (_azurecolor != null) return _azurecolor!!
        _azurecolor = ImageVector.Builder(
            name = "AzureColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF114A8B), 1.0f to Color(0xFF0669BC),
                    start = Offset(8.247f, 1.626f),
                    end = Offset(1.002f, 23.03f),
                )) {
                pathData("M7.242 1.613A1.11 1.11 0 018.295.857h6.977L8.03 22.316a1.11 1.11 0 01-1.052.755h-5.43a1.11 1.11 0 01-1.053-1.466L7.242 1.613z")
            }
            path(fill = SolidColor(Color(0xFF0078D4))) {
                pathData("M18.397 15.296H7.4a.51.51 0 00-.347.882l7.066 6.595c.206.192.477.298.758.298h6.226l-2.706-7.775z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0x4C000000), 0.071f to Color(0x33000000), 0.321f to Color(0x19000000), 0.623f to Color(0x0C000000), 1.0f to Color(0x00000000),
                    start = Offset(14.042f, 15.302f),
                    end = Offset(12.324f, 15.888f),
                )) {
                pathData("M15.272.857H7.497L0 23.071h7.775l1.596-4.73 5.068 4.73h6.665l-2.707-7.775h-7.998L15.272.857z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF3CCBF4), 1.0f to Color(0xFF2892DF),
                    start = Offset(12.841f, 1.626f),
                    end = Offset(20.793f, 22.814f),
                )) {
                pathData("M17.193 1.613a1.11 1.11 0 00-1.052-.756h-7.81.035c.477 0 .9.304 1.052.756l6.748 19.992a1.11 1.11 0 01-1.052 1.466h-.12 7.895a1.11 1.11 0 001.052-1.466L17.193 1.613z")
            }
        }.build()
        return _azurecolor!!
    }
