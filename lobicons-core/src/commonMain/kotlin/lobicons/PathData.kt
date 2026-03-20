package lobicons

import androidx.compose.ui.graphics.vector.PathBuilder
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.graphics.vector.PathParser

internal fun PathBuilder.pathData(data: String) {
    PathParser().parsePathString(data).toNodes().forEach { addNode(it) }
}

private fun PathBuilder.addNode(node: PathNode) {
    when (node) {
        is PathNode.MoveTo -> moveTo(node.x, node.y)
        is PathNode.RelativeMoveTo -> moveToRelative(node.dx, node.dy)
        is PathNode.LineTo -> lineTo(node.x, node.y)
        is PathNode.RelativeLineTo -> lineToRelative(node.dx, node.dy)
        is PathNode.HorizontalTo -> horizontalLineTo(node.x)
        is PathNode.RelativeHorizontalTo -> horizontalLineToRelative(node.dx)
        is PathNode.VerticalTo -> verticalLineTo(node.y)
        is PathNode.RelativeVerticalTo -> verticalLineToRelative(node.dy)
        is PathNode.CurveTo -> curveTo(node.x1, node.y1, node.x2, node.y2, node.x3, node.y3)
        is PathNode.RelativeCurveTo -> curveToRelative(node.dx1, node.dy1, node.dx2, node.dy2, node.dx3, node.dy3)
        is PathNode.ReflectiveCurveTo -> reflectiveCurveTo(node.x1, node.y1, node.x2, node.y2)
        is PathNode.RelativeReflectiveCurveTo -> reflectiveCurveToRelative(node.dx1, node.dy1, node.dx2, node.dy2)
        is PathNode.QuadTo -> quadTo(node.x1, node.y1, node.x2, node.y2)
        is PathNode.RelativeQuadTo -> quadToRelative(node.dx1, node.dy1, node.dx2, node.dy2)
        is PathNode.ReflectiveQuadTo -> reflectiveQuadTo(node.x, node.y)
        is PathNode.RelativeReflectiveQuadTo -> reflectiveQuadToRelative(node.dx, node.dy)
        is PathNode.ArcTo -> arcTo(node.horizontalEllipseRadius, node.verticalEllipseRadius, node.theta, node.isMoreThanHalf, node.isPositiveArc, node.arcStartX, node.arcStartY)
        is PathNode.RelativeArcTo -> arcToRelative(node.horizontalEllipseRadius, node.verticalEllipseRadius, node.theta, node.isMoreThanHalf, node.isPositiveArc, node.arcStartDx, node.arcStartDy)
        is PathNode.Close -> close()
    }
}
