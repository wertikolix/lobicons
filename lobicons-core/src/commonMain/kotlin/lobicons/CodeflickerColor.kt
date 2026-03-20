package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _codeflickercolor: ImageVector? = null

val Lobicons.CodeflickerColor: ImageVector
    get() {
        if (_codeflickercolor != null) return _codeflickercolor!!
        _codeflickercolor = ImageVector.Builder(
            name = "CodeflickerColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M4.707 6.24V3.5H0v16.977h4.707v-2.74H2.94V6.24h1.766z")
            }
            path(fill = SolidColor(Color(0xFF32EDDA))) {
                pathData("M20.868 3.5h-1.575v2.74h1.775v11.497h-1.775v2.74H24V3.5h-3.132zM13.22 3.5l-.55 3.082H9.623l.541-3.082h3.057zM14.395 8.398l-2.133 12.08H9.213l2.125-12.08h3.057z")
            }
            path(fill = SolidColor(Color(0xFF32EDDA))) {
                pathData("M14.395 8.398l-2.133 12.08h7.031v-2.741h1.775V8.398h-6.673z")
            }
            path(fill = SolidColor(Color(0xFF32EDDA))) {
                pathData("M9.622 6.583l1.716 1.816h3.057l-1.724-1.816H9.62z")
            }
            path(fill = SolidColor(Color(0xFF32EDDA))) {
                pathData("M13.22 3.5h6.073v2.74h1.775v2.158h-6.673L12.67 6.582l.55-3.082z")
            }
        }.build()
        return _codeflickercolor!!
    }
