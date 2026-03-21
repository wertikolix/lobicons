package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
            path(fill = SolidColor(Color.Black)) {
                pathData("M4.707 6.24V3.5H0v16.977h4.707v-2.74H2.94V6.24h1.766z")
            }
            path(fill = SolidColor(Color(0xFF32EDDA))) {
                pathData("M20.868 3.5h-1.575v2.74h1.775v11.497h-1.775v2.74H24V3.5h-3.132zM13.22 3.5l-.55 3.082H9.623l.541-3.082h3.057zM14.395 8.398l-2.133 12.08H9.213l2.125-12.08h3.057z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF32EDDA), 0.09f to Color(0xE248EEDD), 0.43f to Color(0x8295F5EB), 0.7f to Color(0x3DCEFAF6), 0.9f to Color(0x11F1FDFC), 1.0f to Color(0x00FFFFFF),
                    start = Offset(10.505f, 13.772f),
                    end = Offset(20.36f, 14.838f),
                )) {
                pathData("M14.395 8.398l-2.133 12.08h7.031v-2.741h1.775V8.398h-6.673z")
            }
            path(fill = Brush.linearGradient(
                    0.01f to Color(0xFF32EDDA), 0.06f to Color(0xDD4CEFDE), 0.15f to Color(0xAA76F2E6), 0.25f to Color(0x7C9AF6EC), 0.35f to Color(0x56B9F8F2), 0.45f to Color(0x35D3FBF7), 0.56f to Color(0x1EE6FCFA), 0.68f to Color(0x0CF4FEFD), 0.82f to Color(0x02FCFEFE), 1.0f to Color(0x00FFFFFF),
                    start = Offset(11.854f, 6.258f),
                    end = Offset(12.321f, 9.998f),
                )) {
                pathData("M9.622 6.583l1.716 1.816h3.057l-1.724-1.816H9.62z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF32EDDA), 0.1f to Color(0xCC5BF0E1), 0.23f to Color(0x9686F4E9), 0.35f to Color(0x68ABF7EF), 0.48f to Color(0x42C9FAF5), 0.6f to Color(0x26E1FCF9), 0.73f to Color(0x0FF1FDFC), 0.86f to Color(0x05FBFEFE), 1.0f to Color(0x00FFFFFF),
                    start = Offset(13.112f, 2.9f),
                    end = Offset(20.41f, 8.873f),
                )) {
                pathData("M13.22 3.5h6.073v2.74h1.775v2.158h-6.673L12.67 6.582l.55-3.082z")
            }
        }.build()
        return _codeflickercolor!!
    }
