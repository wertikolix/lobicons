package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _monicacolor: ImageVector? = null

val Lobicons.MonicaColor: ImageVector
    get() {
        if (_monicacolor != null) return _monicacolor!!
        _monicacolor = ImageVector.Builder(
            name = "MonicaColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFA83FE0), 0.477f to Color(0xFF515FFB), 1.0f to Color(0xFF2BB5DD),
                    start = Offset(0.0f, 12.281f),
                    end = Offset(24.0f, 12.281f),
                )) {
                pathData("M0.0,12.0 A12.0,12.0,0,1,1,24.0,12.0 A12.0,12.0,0,1,1,0.0,12.0Z")
            }
            path(fill = SolidColor(Color(0xFF1E1E1E))) {
                pathData("M16.207 10.195a.96.96 0 111.357 1.357l-1.114 1.114 1.473.85a.96.96 0 11-.96 1.662l-2.444-1.411a1.003 1.003 0 01-.072-.046.962.962 0 01-.236-1.53l1.996-1.996zM7.688 9.937a1.5 1.5 0 00-1.5 1.5v2.25a1.5 1.5 0 003 0v-2.25a1.5 1.5 0 00-1.5-1.5z")
            }
        }.build()
        return _monicacolor!!
    }
