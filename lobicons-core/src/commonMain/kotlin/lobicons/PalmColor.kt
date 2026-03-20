package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _palmcolor: ImageVector? = null

val Lobicons.PalmColor: ImageVector
    get() {
        if (_palmcolor != null) return _palmcolor!!
        _palmcolor = ImageVector.Builder(
            name = "PalmColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFFF9AB00))) {
                pathData("M12 22.926c.928 0 1.679-.752 1.679-1.68V6.696h-3.358v14.552c0 .927.751 1.679 1.679 1.679z")
            }
            path(fill = SolidColor(Color(0xFF5BB974))) {
                pathData("M18.69 12.005A5.819 5.819 0 0012 10.904l7.188 7.188c.296.296.807.179.933-.22a5.815 5.815 0 00-1.431-5.867z")
            }
            path(fill = SolidColor(Color(0xFF129EAF))) {
                pathData("M5.31 12.005A5.819 5.819 0 0112 10.904l-7.188 7.188a.562.562 0 01-.933-.22 5.815 5.815 0 011.431-5.867z")
            }
            path(fill = SolidColor(Color(0xFFAF5CF7))) {
                pathData("M18.157 6.426c-2.86 0-5.288 1.875-6.157 4.478h11.367a.629.629 0 00.565-.908c-1.08-2.12-3.26-3.57-5.775-3.57z")
            }
            path(fill = SolidColor(Color(0xFFFF8BCB))) {
                pathData("M13.188 3.384c-2.023 2.024-2.414 5.064-1.188 7.52l8.038-8.039a.629.629 0 00-.242-1.042c-2.264-.735-4.83-.217-6.608 1.561z")
            }
            path(fill = SolidColor(Color(0xFFFA7B17))) {
                pathData("M10.812 3.384c2.023 2.024 2.414 5.064 1.188 7.52L3.962 2.865a.629.629 0 01.242-1.042c2.264-.735 4.83-.217 6.608 1.561z")
            }
            path(fill = SolidColor(Color(0xFF4285F4))) {
                pathData("M5.843 6.426c2.86 0 5.288 1.875 6.157 4.478H.633a.629.629 0 01-.565-.908c1.08-2.12 3.26-3.57 5.775-3.57z")
            }
        }.build()
        return _palmcolor!!
    }
