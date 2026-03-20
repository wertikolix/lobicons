package lobicons

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _magic: ImageVector? = null

val Lobicons.Magic: ImageVector
    get() {
        if (_magic != null) return _magic!!
        _magic = ImageVector.Builder(
            name = "Magic",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path {
                pathData("M15.294 20.628c-4.8 0-8.706-3.9-8.706-8.695 0-1.168.948-2.116 2.118-2.116s2.12.948 2.12 2.116a4.47 4.47 0 004.468 4.463 4.47 4.47 0 004.468-4.463V8.97c0-1.169.95-2.116 2.12-2.116C23.051 6.854 24 7.8 24 8.97v2.963c0 4.794-3.906 8.695-8.706 8.695z")
            }
            path {
                pathData("M2.119 17.074A2.117 2.117 0 010 14.958v-2.964C0 7.2 3.906 3.3 8.706 3.3c4.8 0 8.706 3.9 8.706 8.694a2.117 2.117 0 01-2.118 2.116 2.117 2.117 0 01-2.12-2.116 4.47 4.47 0 00-4.468-4.462 4.47 4.47 0 00-4.468 4.462v2.964a2.117 2.117 0 01-2.12 2.116z")
            }
        }.build()
        return _magic!!
    }
