package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _xuanyuan: ImageVector? = null

val Lobicons.Xuanyuan: ImageVector
    get() {
        if (_xuanyuan != null) return _xuanyuan!!
        _xuanyuan = ImageVector.Builder(
            name = "Xuanyuan",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M0 6.306C0 5.48.893 4.96 1.612 5.37l6.607 3.76c.337.192.545.55.545.938v9.35c0 .596-.483 1.079-1.079 1.079H1.08A1.079 1.079 0 010 19.417V6.307z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M9.708 10.063c0-.385.206-.742.54-.934l12.135-6.984A1.079 1.079 0 0124 3.08v16.337c0 .596-.483 1.079-1.079 1.079H10.787a1.079 1.079 0 01-1.08-1.079v-9.354z")
            }
        }.build()
        return _xuanyuan!!
    }
