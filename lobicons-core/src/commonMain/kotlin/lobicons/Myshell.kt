package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _myshell: ImageVector? = null

val Lobicons.Myshell: ImageVector
    get() {
        if (_myshell != null) return _myshell!!
        _myshell = ImageVector.Builder(
            name = "Myshell",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M5.743 4C1.703 4 .306 13.31.002 15.83c-.026.216.241.328.404.182 7.957-7.15 11.644 3.594 14.802 3.594-1.768 0-3.063-4.94-4.69-9.263C9.253 6.985 7.788 4 5.743 4zM23.58 15.76c.153.185.454.063.417-.174-.364-2.303-1.562-8.395-4.078-8.395-1.547 0-1.941 3.084-2.337 6.178l-.002.01c3.381 0 4.665.758 6 2.38z")
            }
            path {
                pathData("M10.517 10.343c1.627 4.322 2.923 9.263 4.69 9.263 1.573 0 1.975-3.117 2.373-6.226l.002-.01c.396-3.095.79-6.18 2.336-6.18-3.1 0-4.71 11.248-9.4 3.153z")
            }
        }.build()
        return _myshell!!
    }
