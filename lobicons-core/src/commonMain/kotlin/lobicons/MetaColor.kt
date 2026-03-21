package lobicons

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

private var _metacolor: ImageVector? = null

val Lobicons.MetaColor: ImageVector
    get() {
        if (_metacolor != null) return _metacolor!!
        _metacolor = ImageVector.Builder(
            name = "MetaColor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(fill = Brush.linearGradient(
                    0.0006f to Color(0xFF0867DF), 0.4539f to Color(0xFF0668E1), 0.8591f to Color(0xFF0064E0),
                    start = Offset(18.21528f, 21.40776f),
                    end = Offset(6.3148800000000005f, 2.9265600000000003f),
                )) {
                pathData("M6.897 4h-.024l-.031 2.615h.022c1.715 0 3.046 1.357 5.94 6.246l.175.297.012.02 1.62-2.438-.012-.019a48.763 48.763 0 00-1.098-1.716 28.01 28.01 0 00-1.175-1.629C10.413 4.932 8.812 4 6.896 4z")
            }
            path(fill = Brush.linearGradient(
                    0.1323f to Color(0xFF0064DF), 0.9987999999999999f to Color(0xFF0064E0),
                    start = Offset(5.2008f, 18.20976f),
                    end = Offset(23.29632f, 5.7564f),
                )) {
                pathData("M6.873 4C4.95 4.01 3.247 5.258 2.02 7.17a4.352 4.352 0 00-.01.017l2.254 1.231.011-.017c.718-1.083 1.61-1.774 2.568-1.785h.021L6.896 4h-.023z")
            }
            path(fill = Brush.linearGradient(
                    0.0147f to Color(0xFF0072EC), 0.6881f to Color(0xFF0064DF),
                    start = Offset(9.183119999999999f, 21.39048f),
                    end = Offset(14.614799999999999f, 3.87144f),
                )) {
                pathData("M2.019 7.17l-.011.017C1.2 8.447.598 9.995.274 11.664l-.005.022 2.534.6.004-.022c.27-1.467.786-2.828 1.456-3.845l.011-.017L2.02 7.17z")
            }
            path(fill = Brush.linearGradient(
                    0.0731f to Color(0xFF007CF6), 0.9943000000000001f to Color(0xFF0072EC),
                    start = Offset(11.287679999999998f, 21.645599999999998f),
                    end = Offset(12.515999999999998f, 3.7787999999999995f),
                )) {
                pathData("M2.807 12.264l-2.533-.6-.005.022c-.177.918-.267 1.851-.269 2.786v.023l2.598.233v-.023a12.591 12.591 0 01.21-2.44z")
            }
            path(fill = Brush.linearGradient(
                    0.0731f to Color(0xFF007FF9), 1.0f to Color(0xFF007CF6),
                    start = Offset(12.517199999999999f, 13.99224f),
                    end = Offset(11.42184f, 8.88096f),
                )) {
                pathData("M2.677 15.537a5.462 5.462 0 01-.079-.813v-.022L0 14.468v.024a8.89 8.89 0 00.146 1.652l2.535-.585a4.106 4.106 0 01-.004-.022z")
            }
            path(fill = Brush.linearGradient(
                    0.0731f to Color(0xFF007FF9), 1.0f to Color(0xFF0082FB),
                    start = Offset(9.04536f, 3.0004800000000005f),
                    end = Offset(14.87064f, 15.269760000000002f),
                )) {
                pathData("M3.27 16.89c-.284-.31-.484-.756-.589-1.328l-.004-.021-2.535.585.004.021c.192 1.01.568 1.85 1.106 2.487l.014.017 2.018-1.745a2.106 2.106 0 01-.015-.016z")
            }
            path(fill = SolidColor(Color(0xFF0082FB))) {
                pathData("M10.78 9.654c-1.528 2.35-2.454 3.825-2.454 3.825-2.035 3.2-2.739 3.917-3.871 3.917a1.545 1.545 0 01-1.186-.508l-2.017 1.744.014.017C2.01 19.518 3.058 20 4.356 20c1.963 0 3.374-.928 5.884-5.33l1.766-3.13a41.283 41.283 0 00-1.227-1.886z")
            }
            path(fill = Brush.linearGradient(
                    0.2799f to Color(0xFF007FF8), 0.9140999999999999f to Color(0xFF0082FB),
                    start = Offset(8.35392f, 16.526159999999997f),
                    end = Offset(14.95512f, 5.56176f),
                )) {
                pathData("M13.502 5.946l-.016.016c-.4.43-.786.908-1.16 1.416.378.483.768 1.024 1.175 1.63.48-.743.928-1.345 1.367-1.807l.016-.016-1.382-1.24z")
            }
            path(fill = SolidColor(Color(0xFF0082FB))) {
                pathData("M20.918 5.713C19.853 4.633 18.583 4 17.225 4c-1.432 0-2.637.787-3.723 1.944l-.016.016 1.382 1.24.016-.017c.715-.747 1.408-1.12 2.176-1.12.826 0 1.6.39 2.27 1.075l.015.016 1.589-1.425-.016-.016z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF0082FB), 0.9995f to Color(0xFF0081FA),
                    start = Offset(10.502880000000001f, 1.4964f),
                    end = Offset(13.82448f, 23.643359999999998f),
                )) {
                pathData("M23.998 14.125c-.06-3.467-1.27-6.566-3.064-8.396l-.016-.016-1.588 1.424.015.016c1.35 1.392 2.277 3.98 2.361 6.971v.023h2.292v-.022z")
            }
            path(fill = Brush.linearGradient(
                    0.061900000000000004f to Color(0xFF0081FA), 1.0f to Color(0xFF0080F9),
                    start = Offset(14.4132f, 1.11864f),
                    end = Offset(9.571200000000001f, 16.57848f),
                )) {
                pathData("M23.998 14.15v-.023h-2.292v.022c.004.14.006.282.006.424 0 .815-.121 1.474-.368 1.95l-.011.022 1.708 1.782.013-.02c.62-.96.946-2.293.946-3.91 0-.083 0-.165-.002-.247z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF027AF3), 1.0f to Color(0xFF0080F9),
                    start = Offset(7.2676799999999995f, 14.236799999999999f),
                    end = Offset(14.659440000000002f, 7.97856f),
                )) {
                pathData("M21.344 16.52l-.011.02c-.214.402-.519.67-.917.787l.778 2.462a3.493 3.493 0 00.438-.182 3.558 3.558 0 001.366-1.218l.044-.065.012-.02-1.71-1.784z")
            }
            path(fill = Brush.linearGradient(
                    0.0f to Color(0xFF0377EF), 0.9994f to Color(0xFF0279F1),
                    start = Offset(4.90392f, 12.000239999999998f),
                    end = Offset(19.706879999999998f, 12.000239999999998f),
                )) {
                pathData("M19.92 17.393c-.262 0-.492-.039-.718-.14l-.798 2.522c.449.153.927.222 1.46.222.492 0 .943-.073 1.352-.215l-.78-2.462c-.167.05-.341.075-.517.073z")
            }
            path(fill = Brush.linearGradient(
                    0.0019f to Color(0xFF0471E9), 1.0f to Color(0xFF0377EF),
                    start = Offset(9.67272f, 8.47152f),
                    end = Offset(17.374560000000002f, 13.87464f),
                )) {
                pathData("M18.323 16.534l-.014-.017-1.836 1.914.016.017c.637.682 1.246 1.105 1.937 1.337l.797-2.52c-.291-.125-.573-.353-.9-.731z")
            }
            path(fill = Brush.linearGradient(
                    0.27649999999999997f to Color(0xFF0867DF), 1.0f to Color(0xFF0471E9),
                    start = Offset(7.740959999999999f, 4.73256f),
                    end = Offset(16.32072f, 20.377920000000003f),
                )) {
                pathData("M18.309 16.515c-.55-.642-1.232-1.712-2.303-3.44l-1.396-2.336-.011-.02-1.62 2.438.012.02.989 1.668c.959 1.61 1.74 2.774 2.493 3.585l.016.016 1.834-1.914a2.353 2.353 0 01-.014-.017z")
            }
        }.build()
        return _metacolor!!
    }
