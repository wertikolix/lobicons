package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _viducolor: ImageVector? = null

val Lobicons.ViduColor: ImageVector
    get() {
        if (_viducolor != null) return _viducolor!!
        _viducolor = ImageVector.Builder(
            name = "ViduColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF40EDD8), 0.024f to Color(0xFF38E7E2), 0.084f to Color(0xFF28DAF7), 0.124f to Color(0xFF22D5FF), 0.36f to Color(0xFF1ABFFF), 0.85f to Color(0xFF0786FE), 0.909f to Color(0xFF047FFE),
                    start = Offset(0.759f, 5.637f),
                    end = Offset(26.155f, 17.311f),
                )) {
                pathData("M20.607 2.247c-2.917-.966-5.426 1.084-6.011 2.96 0 0-2.105 6.76-3.002 9.58-.428 1.346-1.489 3.548-3.487 3.548-1.627 0-2.463-1.527-2.816-2.437L2.865 9.431c-.281-.681.013-2.04 1.14-2.447 1.204-.432 1.978.575 2.178 1.11l3.022 7.74c.72-.928 1.178-2.438 1.476-3.507l-1.984-5.21C7.756 4.686 5.267 3.58 2.962 4.43 1.095 5.118-.702 7.474.275 10.435l2.504 6.44c.38.976 1.881 4.163 5.275 4.163 4.073 0 5.601-3.473 6.449-6.218.424-1.373 2.749-8.797 2.749-8.797.338-1.109 1.71-1.428 2.568-1.148.605.196 1.698 1.031 1.345 2.325-.066.236-1.92 6.209-2.604 8.026-.357.948-1.262 3.006-3.324 2.72-.628 1.39-1.15 2.199-1.94 2.925 2.572 1.218 6.32-.009 7.898-4.776.586-1.773 2.644-8.166 2.644-8.166.598-1.963-.469-4.768-3.232-5.682z")
            }
        }.build()
        return _viducolor!!
    }
