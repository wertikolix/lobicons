package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _apertiscolor: ImageVector? = null

val Lobicons.ApertisColor: ImageVector
    get() {
        if (_apertiscolor != null) return _apertiscolor!!
        _apertiscolor = ImageVector.Builder(
            name = "ApertisColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF14B8A6), 0.5f to Color(0xFF0D7D72), 1.0f to Color(0xFF044F47),
                    start = Offset(12.0f, 0.0f),
                    end = Offset(12.0f, 24.0f),
                )) {
                pathData("M3.474 24l3.943-8.21H9.34L3.474 24z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF14B8A6), 0.5f to Color(0xFF0D7D72), 1.0f to Color(0xFF044F47),
                    start = Offset(12.0f, 0.0f),
                    end = Offset(12.0f, 24.0f),
                )) {
                pathData("M24 24h-4.895l-3.882-8.362 1.356-3.164H9.01L15 0l9 24z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF5EEAD4), 0.25f to Color(0xFF2DD4BF), 0.65f to Color(0xFF0D9488), 1.0f to Color(0xFF0A7A6F),
                    start = Offset(0.0f, 0.0f),
                    end = Offset(0.0f, 24.0f),
                )) {
                pathData("M15.743 12.474H7.737l-1.263 3.315L0 24 10.737 0l5.006 12.474z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF5EEAD4), 0.25f to Color(0xFF2DD4BF), 0.65f to Color(0xFF0D9488), 1.0f to Color(0xFF0A7A6F),
                    start = Offset(0.0f, 0.0f),
                    end = Offset(0.0f, 24.0f),
                )) {
                pathData("M16.146 13.48L20.369 24h-5.21l-3.473-8.21h3.473l.989-2.31z")
            }
        }.build()
        return _apertiscolor!!
    }
