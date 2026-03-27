package lobicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _agentvoicecolor: ImageVector? = null

val Lobicons.AgentvoiceColor: ImageVector
    get() {
        if (_agentvoicecolor != null) return _agentvoicecolor!!
        _agentvoicecolor = ImageVector.Builder(
            name = "AgentvoiceColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = SolidColor(Color(0xFF0F6FFF))) {
                pathData("M23.696 12.056h-8.825a.283.283 0 01-.246-.425l4.413-7.643a.283.283 0 00-.246-.425l-9.018.005a.567.567 0 00-.49.283L.037 19.863a.283.283 0 00.246.425h9.015c.203 0 .39-.108.491-.284l4.325-7.49a.283.283 0 01.49 0l4.413 7.644c.11.188.382.188.491 0l4.433-7.677a.283.283 0 00-.246-.425z")
            }
        }.build()
        return _agentvoicecolor!!
    }
