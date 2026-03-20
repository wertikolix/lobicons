package lobicons

import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _gradio: ImageVector? = null

val Lobicons.Gradio: ImageVector
    get() {
        if (_gradio != null) return _gradio!!
        _gradio = ImageVector.Builder(
            name = "Gradio",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(pathFillType = PathFillType.EvenOdd) {
                pathData("M11.238 7.603a1.532 1.532 0 011.524 0l10.468 6a1.532 1.532 0 010 2.66l-10.468 6c-.472.27-1.052.27-1.524 0l-10.468-6a1.533 1.533 0 010-2.66l10.468-6zm-6.624 7.33L12 19.166l7.386-4.233L12 10.699l-7.386 4.234z")
            }
            path(pathFillType = PathFillType.EvenOdd) {
                pathData("M11.238 1.733a1.533 1.533 0 011.524 0l10.468 6a1.532 1.532 0 010 2.659l-10.468 6c-.472.27-1.052.27-1.524 0l-10.468-6a1.532 1.532 0 010-2.659l10.468-6zm-6.624 7.33L12 13.296l7.386-4.233L12 4.829 4.614 9.063z")
            }
            path(pathFillType = PathFillType.EvenOdd) {
                pathData("M12.784 10.265L2.291 16.239.774 13.575l10.494-5.974 1.516 2.664z")
            }
        }.build()
        return _gradio!!
    }
