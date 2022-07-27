package pub.gll.onepeas.modulesample.localprovider

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import pub.gll.onepeas.modulesample.localprovider.CardElevation
import pub.gll.onepeas.modulesample.localprovider.LocalElevations
import pub.gll.onepeas.modulesample.localprovider.MyCard


@Composable
fun CompositionSample3() {
    /*val elevations = if (isSystemInDarkTheme()) {
        Elevations(card = 10.dp, default = 1.dp)
    } else {
        Elevations(card = 5.dp, default = 0.dp)
    }*/

    Column {
        CompositionLocalProvider(LocalElevations provides CardElevation.high) {
            // 访问全局定义的 LocalElevations 变量获取当前组合项中的 Elevations 实例
            MyCard(
                backgroundColor = MaterialTheme.colors.onSurface.copy(alpha = 0.05f)
            ) {}
        }
        MyCard(
            backgroundColor = MaterialTheme.colors.onSurface.copy(alpha = 0.05f)
        ) {}
    }
}
