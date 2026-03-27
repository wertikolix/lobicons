package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _geminiclicolor: ImageVector? = null

val Lobicons.GeminicliColor: ImageVector
    get() {
        if (_geminiclicolor != null) return _geminiclicolor!!
        _geminiclicolor = ImageVector.Builder(
            name = "GeminicliColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFEE4D5D), 0.328f to Color(0xFFB381DD), 0.476f to Color(0xFF207CFE),
                    start = Offset(24.0f, 6.587f),
                    end = Offset(0.0f, 16.494f),
                )) {
                pathData("M0 4.391A4.391 4.391 0 014.391 0h15.217A4.391 4.391 0 0124 4.391v15.217A4.391 4.391 0 0119.608 24H4.391A4.391 4.391 0 010 19.608V4.391z")
            }
            path(fill = SolidColor(Color(0xFF1E1E2E)), pathFillType = PathFillType.EvenOdd) {
                pathData("M19.74 1.444a2.816 2.816 0 012.816 2.816v15.48a2.816 2.816 0 01-2.816 2.816H4.26a2.816 2.816 0 01-2.816-2.816V4.26A2.816 2.816 0 014.26 1.444h15.48zM7.236 8.564l7.752 3.728-7.752 3.727v2.802l9.557-4.596v-3.866L7.236 5.763v2.801z")
            }
        }.build()
        return _geminiclicolor!!
    }
