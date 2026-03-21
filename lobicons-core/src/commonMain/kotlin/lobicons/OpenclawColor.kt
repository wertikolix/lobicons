package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _openclawcolor: ImageVector? = null

val Lobicons.OpenclawColor: ImageVector
    get() {
        if (_openclawcolor != null) return _openclawcolor!!
        _openclawcolor = ImageVector.Builder(
            name = "OpenclawColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF4D4D), 1.0f to Color(0xFF991B1B),
                    start = Offset(-0.659f, 0.458f),
                    end = Offset(27.023f, 22.855f),
                )) {
                pathData("M12 2.568c-6.33 0-9.495 5.275-9.495 9.495 0 4.22 3.165 8.44 6.33 9.494v2.11h2.11v-2.11s1.055.422 2.11 0v2.11h2.11v-2.11c3.165-1.055 6.33-5.274 6.33-9.494S18.33 2.568 12 2.568z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF4D4D), 1.0f to Color(0xFF991B1B),
                    start = Offset(0.0f, 9.672f),
                    end = Offset(4.311f, 14.949f),
                )) {
                pathData("M3.56 9.953C.396 8.898-.66 11.008.396 13.118c1.055 2.11 3.164 1.055 4.22-1.055.632-1.477 0-2.11-1.056-2.11z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF4D4D), 1.0f to Color(0xFF991B1B),
                    start = Offset(19.385f, 9.953f),
                    end = Offset(24.399f, 14.462f),
                )) {
                pathData("M20.44 9.953c3.164-1.055 4.22 1.055 3.164 3.165-1.055 2.11-3.164 1.055-4.22-1.055-.632-1.477 0-2.11 1.056-2.11z")
            }
            path(fill = SolidColor(Color(0xFFFF4D4D))) {
                pathData("M5.507 1.875c.476-.285 1.036-.233 1.615.037.577.27 1.223.774 1.937 1.488a.316.316 0 01-.447.447c-.693-.693-1.279-1.138-1.757-1.361-.475-.222-.795-.205-1.022-.069a.317.317 0 01-.326-.542zM16.877 1.913c.58-.27 1.14-.323 1.616-.038a.317.317 0 01-.326.542c-.227-.136-.547-.153-1.022.069-.478.223-1.064.668-1.756 1.361a.316.316 0 11-.448-.447c.714-.714 1.36-1.218 1.936-1.487z")
            }
            path(fill = SolidColor(Color(0xFF050810))) {
                pathData("M8.835 9.109a1.266 1.266 0 100-2.532 1.266 1.266 0 000 2.532zM15.165 9.109a1.266 1.266 0 100-2.532 1.266 1.266 0 000 2.532z")
            }
            path(fill = SolidColor(Color(0xFF00E5CC))) {
                pathData("M9.046 8.16a.527.527 0 100-1.056.527.527 0 000 1.055zM15.376 8.16a.527.527 0 100-1.055.527.527 0 000 1.054z")
            }
        }.build()
        return _openclawcolor!!
    }
