package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _makecolor: ImageVector? = null

val Lobicons.MakeColor: ImageVector
    get() {
        if (_makecolor != null) return _makecolor!!
        _makecolor = ImageVector.Builder(
            name = "MakeColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF00FF), 0.17f to Color(0xFFE90CF9), 0.54f to Color(0xFFC023ED), 0.73f to Color(0xFFB02DE9), 1.0f to Color(0xFFB02DE9),
                    start = Offset(1.5f, 19.5f),
                    end = Offset(12.0f, 0.0f),
                )) {
                pathData("M6.989 4.036L.062 17.818a.577.577 0 00.257.774l3.733 1.876a.577.577 0 00.775-.256L11.753 6.43a.577.577 0 00-.257-.775L7.763 3.78a.575.575 0 00-.774.257z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFB02DE9), 0.02f to Color(0xFFB02DE9), 0.8f to Color(0xFF6D00CC), 1.0f to Color(0xFF6D00CC),
                    start = Offset(0.0f, 24.0f),
                    end = Offset(24.0f, 0.0f),
                )) {
                pathData("M19.245 3.832h4.179c.318 0 .577.26.577.577v15.425a.578.578 0 01-.577.578h-4.179a.578.578 0 01-.577-.578V4.41c0-.318.259-.577.577-.577z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF00FF), 0.02f to Color(0xFFFF00FF), 0.09f to Color(0xFFE90CF9), 0.23f to Color(0xFFC023ED), 0.3f to Color(0xFFB02DE9), 0.42f to Color(0xFFA42BE3), 0.63f to Color(0xFF8626D5), 0.85f to Color(0xFF6021C3), 1.0f to Color(0xFF6021C3),
                    start = Offset(0.0f, 24.0f),
                    end = Offset(24.0f, 0.0f),
                )) {
                pathData("M12.815 4.085L9.85 19.108a.576.576 0 00.453.677l4.095.826c.314.063.62-.14.681-.454l2.964-15.022a.577.577 0 00-.453-.677l-4.096-.827a.577.577 0 00-.68.454z")
            }
        }.build()
        return _makecolor!!
    }
