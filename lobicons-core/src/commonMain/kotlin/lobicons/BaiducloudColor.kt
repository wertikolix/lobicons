package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _baiducloudcolor: ImageVector? = null

val Lobicons.BaiducloudColor: ImageVector
    get() {
        if (_baiducloudcolor != null) return _baiducloudcolor!!
        _baiducloudcolor = ImageVector.Builder(
            name = "BaiducloudColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF5BCA87))) {
                pathData("M21.715 5.61l-3.983 2.31a.903.903 0 01-.896 0L12.44 5.384a.903.903 0 00-.897 0L7.156 7.92a.903.903 0 01-.896 0L2.276 5.617 12.002 0l9.713 5.61z")
            }
            path(fill = SolidColor(Color(0xFFEC5D3E))) {
                pathData("M18.641 9.467a.89.89 0 00-.438.77v5.072a.896.896 0 01-.445.77l-4.428 2.51a.884.884 0 00-.445.777v4.607l4.429-2.536 5.31-3.047V7.157l-3.983 2.31z")
            }
            path(fill = SolidColor(Color(0xFF2464F5))) {
                pathData("M10.98 18.941a.936.936 0 00-.305-.352l-4.429-2.516a.903.903 0 01-.431-.764v-5.078a.89.89 0 00-.452-.757l-.451-.26L1.38 7.158V18.39l5.311 3.047L11.126 24v-4.608a.881.881 0 00-.146-.45z")
            }
        }.build()
        return _baiducloudcolor!!
    }
