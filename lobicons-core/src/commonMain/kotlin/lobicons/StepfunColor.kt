package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _stepfuncolor: ImageVector? = null

val Lobicons.StepfunColor: ImageVector
    get() {
        if (_stepfuncolor != null) return _stepfuncolor!!
        _stepfuncolor = ImageVector.Builder(
            name = "StepfunColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF01A9FF), 1.0f to Color(0xFF0160FF),
                    start = Offset(1.646f, 1.916f),
                    end = Offset(18.342f, 22.091f),
                ), pathFillType = PathFillType.EvenOdd) {
                pathData("M22.012 0h1.032v.927H24v.968h-.956V3.78h-1.032V1.896h-1.878v-.97h1.878V0zM2.6 12.371V1.87h.969v10.502h-.97zm10.423.66h10.95v.918h-6.208v9.579h-4.742V13.03zM5.629 3.333v12.356H0v4.51h10.386V8L20.859 8l-.003-4.668-15.227.001z")
            }
        }.build()
        return _stepfuncolor!!
    }
