package lobicons

import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.PathParser

internal fun PathBuilder.pathData(data: String) {
    PathParser().parsePathString(data).toNodes().forEach { node ->
        when (node) {
            is androidx.compose.ui.graphics.vector.PathNode.MoveTo -> moveTo(node.x, node.y)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeMoveTo -> moveToRelative(node.dx, node.dy)
            is androidx.compose.ui.graphics.vector.PathNode.LineTo -> lineTo(node.x, node.y)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeLineTo -> lineToRelative(node.dx, node.dy)
            is androidx.compose.ui.graphics.vector.PathNode.HorizontalTo -> horizontalLineTo(node.x)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeHorizontalTo -> horizontalLineToRelative(node.dx)
            is androidx.compose.ui.graphics.vector.PathNode.VerticalTo -> verticalLineTo(node.y)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeVerticalTo -> verticalLineToRelative(node.dy)
            is androidx.compose.ui.graphics.vector.PathNode.CurveTo -> curveTo(node.x1, node.y1, node.x2, node.y2, node.x3, node.y3)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeCurveTo -> curveToRelative(node.dx1, node.dy1, node.dx2, node.dy2, node.dx3, node.dy3)
            is androidx.compose.ui.graphics.vector.PathNode.ReflectiveCurveTo -> reflectiveCurveTo(node.x1, node.y1, node.x2, node.y2)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveCurveTo -> reflectiveCurveToRelative(node.dx1, node.dy1, node.dx2, node.dy2)
            is androidx.compose.ui.graphics.vector.PathNode.QuadTo -> quadTo(node.x1, node.y1, node.x2, node.y2)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeQuadTo -> quadToRelative(node.dx1, node.dy1, node.dx2, node.dy2)
            is androidx.compose.ui.graphics.vector.PathNode.ReflectiveQuadTo -> reflectiveQuadTo(node.x1, node.y1)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeReflectiveQuadTo -> reflectiveQuadToRelative(node.dx1, node.dy1)
            is androidx.compose.ui.graphics.vector.PathNode.ArcTo -> arcTo(node.horizontalEllipseRadius, node.verticalEllipseRadius, node.theta, node.isMoreThanHalf, node.isPositiveArc, node.arcStartX, node.arcStartY)
            is androidx.compose.ui.graphics.vector.PathNode.RelativeArcTo -> arcToRelative(node.horizontalEllipseRadius, node.verticalEllipseRadius, node.theta, node.isMoreThanHalf, node.isPositiveArc, node.arcStartDx, node.arcStartDy)
            is androidx.compose.ui.graphics.vector.PathNode.Close -> close()
        }
    }
}
