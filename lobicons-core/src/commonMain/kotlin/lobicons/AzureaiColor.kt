package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _azureaicolor: ImageVector? = null

val Lobicons.AzureaiColor: ImageVector
    get() {
        if (_azureaicolor != null) return _azureaicolor!!
        _azureaicolor = ImageVector.Builder(
            name = "AzureaiColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF712575), 0.09f to Color(0xFF9A2884), 0.18f to Color(0xFFBF2C92), 0.27f to Color(0xFFDA2E9C), 0.34f to Color(0xFFEB30A2), 0.4f to Color(0xFFF131A5), 0.5f to Color(0xFFEC30A3), 0.61f to Color(0xFFDF2F9E), 0.72f to Color(0xFFC92D96), 0.83f to Color(0xFFAA2A8A), 0.95f to Color(0xFF83267C), 1.0f to Color(0xFF712575),
                    start = Offset(18.242f, 16.837f),
                    end = Offset(14.191f, 0.616f),
                ), pathFillType = PathFillType.EvenOdd) {
                pathData("M16.233 0c.713 0 1.345.551 1.572 1.329.227.778 1.555 5.59 1.555 5.59v9.562h-4.813L14.645 0h1.588z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFDA7ED0), 0.08f to Color(0xFFB17BD5), 0.19f to Color(0xFF8778DB), 0.3f to Color(0xFF6276E1), 0.41f to Color(0xFF4574E5), 0.54f to Color(0xFF2E72E8), 0.67f to Color(0xFF1D71EB), 0.81f to Color(0xFF1471EC), 1.0f to Color(0xFF1171ED),
                    start = Offset(19.782f, 0.34f),
                    end = Offset(19.782f, 23.222f),
                )) {
                pathData("M23.298 7.47c0-.34-.275-.6-.6-.6h-2.835a3.617 3.617 0 00-3.614 3.615v5.996h3.436a3.617 3.617 0 003.613-3.614V7.47z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFDA7ED0), 0.05f to Color(0xFFB77BD4), 0.11f to Color(0xFF9079DA), 0.18f to Color(0xFF6E77DF), 0.25f to Color(0xFF5175E3), 0.33f to Color(0xFF3973E7), 0.42f to Color(0xFF2772E9), 0.54f to Color(0xFF1A71EB), 0.68f to Color(0xFF1371EC), 1.0f to Color(0xFF1171ED),
                    start = Offset(18.404f, 0.859f),
                    end = Offset(3.236f, 25.183f),
                ), pathFillType = PathFillType.EvenOdd) {
                pathData("M16.233 0a.982.982 0 00-.989.989l-.097 18.198A4.814 4.814 0 0110.334 24H1.6a.597.597 0 01-.567-.794l7-19.981A4.819 4.819 0 0112.57 0h3.679-.016z")
            }
        }.build()
        return _azureaicolor!!
    }
