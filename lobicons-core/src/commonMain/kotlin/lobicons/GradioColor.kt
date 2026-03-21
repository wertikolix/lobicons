package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _gradiocolor: ImageVector? = null

val Lobicons.GradioColor: ImageVector
    get() {
        if (_gradiocolor != null) return _gradiocolor!!
        _gradiocolor = ImageVector.Builder(
            name = "GradioColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFF9D100), 1.0f to Color(0xFFF97700),
                    start = Offset(0.182f, 14.907f),
                    end = Offset(19.377f, 14.907f),
                ), pathFillType = PathFillType.EvenOdd) {
                pathData("M11.238 7.603a1.532 1.532 0 011.524 0l10.468 6a1.532 1.532 0 010 2.66l-10.468 6c-.472.27-1.052.27-1.524 0l-10.468-6a1.533 1.533 0 010-2.66l10.468-6zm-6.624 7.33L12 19.166l7.386-4.233L12 10.699l-7.386 4.234z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFF9D100), 1.0f to Color(0xFFF97700),
                    start = Offset(23.74f, 9.037f),
                    end = Offset(4.519f, 9.037f),
                ), pathFillType = PathFillType.EvenOdd) {
                pathData("M11.238 1.733a1.533 1.533 0 011.524 0l10.468 6a1.532 1.532 0 010 2.659l-10.468 6c-.472.27-1.052.27-1.524 0l-10.468-6a1.532 1.532 0 010-2.659l10.468-6zm-6.624 7.33L12 13.296l7.386-4.233L12 4.829 4.614 9.063z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFF9D100), 1.0f to Color(0xFFF97700),
                    start = Offset(0.182f, 14.907f),
                    end = Offset(19.35f, 14.793f),
                ), pathFillType = PathFillType.EvenOdd) {
                pathData("M12.784 10.265L2.291 16.239.774 13.575l10.494-5.974 1.516 2.664z")
            }
        }.build()
        return _gradiocolor!!
    }
