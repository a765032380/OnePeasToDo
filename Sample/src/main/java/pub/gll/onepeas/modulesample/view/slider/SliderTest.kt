package pub.gll.onepeas.modulesample.view.slider

import androidx.compose.material.Slider
import androidx.compose.material.SliderDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

@Composable
fun SliderView(){
    var progress by remember{ mutableStateOf(0f)}
//    // 滑条未经过部分的默认 alpha 值
//    const val InactiveTrackAlpha = 0.24f
//
//    // 当滑条被禁用的状态下已经过部分的默认 alpha 值
//    const val DisabledInactiveTrackAlpha = 0.12f
//
//    // 当滑条被禁用的状态下未经过部分的默认 alpha 值
//    const val DisabledActiveTrackAlpha = 0.32f
//
//    // 在滑条上方显示的刻度的默认的 alpha 值
//    const val TickAlpha = 0.54f
//
//    // 当刻度线被禁用时，默认的 alpha 值
//    const val DisabledTickAlpha = 0.12f

//    从源码中，我们可以知道，设置滑条经过区域的颜色是 activeTrackColor, 而滑条中未经过的地方是 inactiveTrackColor，它将 activeTrackColor 复制，并且设置了 0.24f 的透明度
//    所以一般来说，我们只需要设置 activeTrackColor 的值就可以改变滑条的总体颜色（经过和未经过的区域
    Slider(
        value = progress,
        colors = SliderDefaults.colors(
            thumbColor = Color.White, // 圆圈的颜色
            activeTrackColor = Color(0xFF0079D3)
        ),
        onValueChange = {
            progress = it
        },
    )
}