package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _klingcolor: ImageVector? = null

val Lobicons.KlingColor: ImageVector
    get() {
        if (_klingcolor != null) return _klingcolor!!
        _klingcolor = ImageVector.Builder(
            name = "KlingColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                pathData("M5.412 13.775A23.193 23.193 0 017.41 9.32c3.17-5.492 7.795-8.757 10.33-7.294C12.038-1.266 4.598.944 1.122 6.964A13.378 13.378 0 00.085 9.22c-.259.739.092 1.534.77 1.926l4.557 2.63z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M18.588 10.164a23.188 23.188 0 01-1.999 4.455c-3.17 5.492-7.795 8.758-10.33 7.294 5.703 3.293 13.143 1.082 16.619-4.938a13.392 13.392 0 001.037-2.255c.259-.738-.092-1.534-.77-1.925l-4.557-2.63z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF003EFF), 1.0f to Color(0xFF0BFFE7),
                    start = Offset(15.578f, 1.798f),
                    end = Offset(18.062f, 9.861f),
                )) {
                pathData("M16.59 14.62c3.17-5.492 3.686-11.13 1.15-12.594C15.207.563 10.582 3.83 7.41 9.32c2.074-3.59 5.809-5.315 8.344-3.852 2.534 1.464 2.908 5.56.835 9.151z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF003EFF), 1.0f to Color(0xFF0BFFE7),
                    start = Offset(8.422f, 22.142f),
                    end = Offset(5.938f, 14.079f),
                )) {
                pathData("M7.41 9.32c-3.17 5.492-3.686 11.13-1.15 12.593 2.534 1.464 7.159-1.802 10.33-7.294-2.074 3.591-5.809 5.316-8.344 3.852-2.534-1.463-2.908-5.56-.835-9.15z")
            }
        }.build()
        return _klingcolor!!
    }
