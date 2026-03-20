package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _akashchat: ImageVector? = null

val Lobicons.Akashchat: ImageVector
    get() {
        if (_akashchat != null) return _akashchat!!
        _akashchat = ImageVector.Builder(
            name = "Akashchat",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M15.902 14.836l3.93 6.914h-7.934L7.93 14.836h7.972z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M19.828 21.754l3.96-6.918L15.86 1H7.93l11.898 20.754z")
            }
            path(fill = SolidColor(Color.Black), pathFillType = PathFillType.EvenOdd) {
                pathData("M3.965 7.914h7.93L3.969 21.75 0 14.836l3.965-6.922z")
            }
        }.build()
        return _akashchat!!
    }
