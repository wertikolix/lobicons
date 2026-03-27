package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _apertis: ImageVector? = null

val Lobicons.Apertis: ImageVector
    get() {
        if (_apertis != null) return _apertis!!
        _apertis = ImageVector.Builder(
            name = "Apertis",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M3.474 24l3.943-8.21H9.34L3.474 24z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M24 24h-4.895l-3.882-8.362 1.356-3.164H9.01L15 0l9 24z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M15.743 12.474H7.737l-1.263 3.315L0 24 10.737 0l5.006 12.474z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M16.146 13.48L20.369 24h-5.21l-3.473-8.21h3.473l.989-2.31z")
            }
        }.build()
        return _apertis!!
    }
