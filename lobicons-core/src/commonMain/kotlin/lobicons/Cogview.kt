package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _cogview: ImageVector? = null

val Lobicons.Cogview: ImageVector
    get() {
        if (_cogview != null) return _cogview!!
        _cogview = ImageVector.Builder(
            name = "Cogview",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.006f to Color(0xFFE8096A), 1.0f to Color(0xFF00AFFF),
                    start = Offset(14.07f, 18.852f),
                    end = Offset(20.313f, 20.083f),
                )) {
                pathData("M15.271 16.555l5.72 4.877s-3.276 3.125-7.223-2.866l1.503-2.01z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M15.4 16.523l4.596 5.947s-3.85 2.39-6.477-4.293l1.882-1.654z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF412DF5), 0.691f to Color(0xFF0606B6), 1.0f to Color(0xFF4B00B4),
                    start = Offset(11.764f, 20.533f),
                    end = Offset(3.911f, 1.932f),
                )) {
                pathData("M13.833 21.043h-3.72a.44.44 0 01-.41-.27L2.024 2.94c-.087-.194.065-.421.28-.421H6.07c.184 0 .346.108.41.27l7.635 17.831c.076.205-.065.422-.281.422z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFE60030), 1.0f to Color(0xFF690040),
                    start = Offset(5.23f, 4.866f),
                    end = Offset(8.449f, 4.518f),
                )) {
                pathData("M7.637 3.547c-2.087.562-2.855 2.465-2.855 2.465s1.33-.465 3.18-.876a30.14 30.14 0 012.551-.421c-.043-.617-1.276-1.6-2.876-1.168z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF6500), 1.0f to Color(0xFFEE182C),
                    start = Offset(5.359f, 6.753f),
                    end = Offset(7.933f, 6.013f),
                )) {
                pathData("M6.664 5.05c-1.644 1.416-1.6 3.46-1.6 3.46s.94-.908 2.357-2.163c.951-.843 2.032-1.6 2.032-1.6-.335-.519-1.47-.833-2.79.303z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFEA4D07), 1.0f to Color(0xFFC5171E),
                    start = Offset(5.528f, 8.108f),
                    end = Offset(8.59f, 8.699f),
                )) {
                pathData("M6.307 7.18c-1.363 1.665-1.05 3.385-1.05 3.385s.801-.768 2.001-2.217a31.1 31.1 0 011.763-1.892C8.61 6 7.388 5.872 6.307 7.18z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF0091FF), 0.005f to Color(0xFF0292FC), 0.126f to Color(0xFF37A5C2), 0.249f to Color(0xFF65B58E), 0.372f to Color(0xFF8CC363), 0.496f to Color(0xFFACCF3F), 0.62f to Color(0xFFC4D823), 0.745f to Color(0xFFD6DE10), 0.871f to Color(0xFFE1E204), 1.0f to Color(0xFFE4E300),
                    start = Offset(12.023f, 3.007f),
                    end = Offset(7.057f, 18.02f),
                )) {
                pathData("M14.957 4.141s-.41-1.07-1.254-1.535c-.822-.454-3.028-.552-4.585.616-2.065 1.536-2.768 4.044-2.92 4.64-1.492 5.795 1.558 9.06 4.942 10.64l3.817-14.36z")
            }
            path(fill = Brush.linearGradient(
                    0.006f to Color(0xFFDE003B), 0.241f to Color(0xFFD976FF), 1.0f to Color(0xFF00A4EA),
                    start = Offset(6.803f, 4.807f),
                    end = Offset(13.616f, 18.4f),
                )) {
                pathData("M4.912 11.246a7.404 7.404 0 007.558 7.245l-.313-14.814c-4.088.097-7.332 3.481-7.245 7.569z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M6.296 12.62c.443 4.032 4.087 6.941 8.12 6.498l-1.621-14.62a7.366 7.366 0 00-6.499 8.121z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M9.313 3.785a3.107 3.107 0 00-.097 4.195 3.126 3.126 0 004.174.487L9.313 3.785z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M11.79 8.077a2.909 2.909 0 100-5.817 2.909 2.909 0 000 5.817z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF9500), 1.0f to Color(0xFFF7FF2B),
                    start = Offset(11.435f, 7.86f),
                    end = Offset(12.609f, 16.15f),
                )) {
                pathData("M8.729 13.625c1.016 3.233 4.466 5.039 7.699 4.022L12.751 5.926a6.138 6.138 0 00-4.022 7.699z")
            }
            path(fill = Brush.linearGradient(
                    0.207f to Color(0xFFFF8E00), 1.0f to Color(0xFFF41B56),
                    start = Offset(15.495f, 13.571f),
                    end = Offset(10.596f, 8.476f),
                )) {
                pathData("M9.562 12.079a5.306 5.306 0 006.239 4.173L13.725 5.84c-2.866.563-4.736 3.363-4.163 6.24z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M11.075 2.822s-.648 1.125-.291 2.38c.443 1.556 2.097 1.783 2.8 1.61l1.006-2.108-1.763-2.358-1.752.476z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFFB41F), 1.0f to Color(0xFFF42A56),
                    start = Offset(12.031f, 7.438f),
                    end = Offset(12.816f, 6.584f),
                )) {
                pathData("M12.903 5.807s-.54.162-.887.81c-.292.541-.205 1.287-.205 1.287l2.195-1.686-1.103-.411z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFFB900), 1.0f to Color(0xFFF41880),
                    start = Offset(13.472f, 9.574f),
                    end = Offset(14.931f, 6.928f),
                )) {
                pathData("M15.325 9.97S13.465 9.948 13 8.218c-.313-1.178.249-1.99.249-1.99l1.211-.356.865 4.098z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M7.02.757s.4 1.849 2.412 2.595c1.524.562 4.076-.973 4.076-.973s-1.34-.552-3.33-.552C8.686 1.827 7.02.757 7.02.757z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF6500), 1.0f to Color(0xFFEE182C),
                    start = Offset(8.686f, 2.816f),
                    end = Offset(16.938f, 2.816f),
                )) {
                pathData("M16.904 4.671s.238-1.243-.552-2.4c-.605-.887-2.12-1.882-4.93-1.265C9.053 1.525 8.697 0 8.697 0c-.076.39.183 2.92 2.649 2.552 3.027-.454 2.768 2.509 3.838 3.006.887.39 1.72-.887 1.72-.887z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M13.757 6.412a1.492 1.492 0 100-2.984 1.492 1.492 0 000 2.984z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF008DFF), 0.181f to Color(0xFF331DEA), 0.833f to Color(0xFF39C3FE), 1.0f to Color(0xFF60F5A9),
                    start = Offset(10.556f, 21.192f),
                    end = Offset(21.346f, 2.03f),
                )) {
                pathData("M10.059 21.043h3.828a.44.44 0 00.41-.27L21.976 2.94c.087-.194-.065-.421-.28-.421h-3.872a.44.44 0 00-.411.27L9.778 20.62c-.076.205.065.422.281.422z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M10.059 21.043h3.828a.439.439 0 00.41-.27l6.1-14.144c.086-.195-.065-.422-.282-.422h-3.87a.44.44 0 00-.412.27L9.778 20.621c-.076.205.065.422.281.422z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M16.071 4.888s.054-1.795-1.806-2.736c-2.595-1.309-4.974 1.795-7.699 0 0 0 .552 2.768 6.11 1.72 1.373-.26 1.979.172 2.281.67.26.421.238.789.238 1.005l.876-.66z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFE60030), 1.0f to Color(0xFF690040),
                    start = Offset(14.947f, 2.631f),
                    end = Offset(15.001f, 4.948f),
                )) {
                pathData("M15.671 5.223s.14-.973-.67-1.568c-.876-.638-1.58-.508-1.58-.508s.498-.303 1.212-.303c.379 0 .508-.054.508-.054s.054-.173-.184-.444c2.033.898 1.503 2.433 1.503 2.433l-.789.444z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFFD71F), 1.0f to Color(0xFFDD001B),
                    start = Offset(15.335f, 7.144f),
                    end = Offset(15.426f, 5.699f),
                )) {
                pathData("M16.352 6.856s-.8.746-1.946.356c-.076-.021-.065-.475 0-.767.065-.336.292-.703.476-.93 1.243.108 1.47 1.34 1.47 1.34z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFFFF4C00), 1.0f to Color(0xFFFFFF1E),
                    start = Offset(15.25f, 6.472f),
                    end = Offset(17.127f, 6.603f),
                )) {
                pathData("M16.904 4.596s.616.962.432 2.054c-.216 1.265-1.416 1.86-1.416 1.86s.573-2.206-1.05-2.995c0 0 .336-.368.823-.595.713-.324 1.21-.324 1.21-.324z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M13.52 5.504a.724.724 0 100-1.449.724.724 0 000 1.449z")
            }
            path(fill = SolidColor(Color.Black)) {
                pathData("M13.357 5.169c.257 0 .465-.223.465-.498 0-.274-.208-.497-.465-.497s-.465.223-.465.497c0 .275.208.498.465.498z")
            }
            path(fill = SolidColor(Color(0xFFFFFFFF))) {
                pathData("M13.681 4.423a.108.108 0 100-.217.108.108 0 000 .217z")
            }
        }.build()
        return _cogview!!
    }
