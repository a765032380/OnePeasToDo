package pub.gll.onepeas.todo.ui.page.common

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import pub.gll.onepeas.todo.R

sealed class BottomNavRoute(
    var routeName: String,
    @StringRes var stringId: Int,
    var icon: ImageVector
) {
    object Home: BottomNavRoute(RouteName.HOME, R.string.home, Icons.Default.Home)
    object WifiConfig: BottomNavRoute(RouteName.WIFI_CONFIG, R.string.wifi, Icons.Default.Build)
    object SETTING: BottomNavRoute(RouteName.SETTING, R.string.wifi, Icons.Default.Settings)
    object Profile: BottomNavRoute(RouteName.PROFILE, R.string.home, Icons.Default.Person)
}