package pub.gll.onepeas.todo.comic.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import pub.gll.onepeas.todo.comic.ComicBottomNavRoute


@Composable
fun ComicBottomNavBarView(navCtrl: NavHostController) {
    val bottomNavList = listOf(
        ComicBottomNavRoute.Home,
        ComicBottomNavRoute.BOOKSHELF,
        ComicBottomNavRoute.MINE,
    )
    BottomNavigation(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(Color.White)
        .border(1.dp,Color.Gray, shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
    ) {

        val navBackStackEntry by navCtrl.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        bottomNavList.forEach { screen ->
            val isSelect = currentDestination?.hierarchy?.any { it.route == screen.routeName } == true
            BottomNavigationItem(
                modifier = Modifier.background(Color.White),
                icon = {
                    Icon(
                        imageVector = screen.icon,
                        contentDescription = null,
                        tint = if (isSelect) Color.Black else Color.Gray
                    )
                },
                label = {
                    Text(text = stringResource(screen.stringId),
                        color = if (isSelect) Color.Black else Color.Gray)
                },
                selected = isSelect,
                onClick = {
                    println("BottomNavView当前路由 ===> ${currentDestination?.hierarchy?.toList()}")
                    println("当前路由栈 ===> ${navCtrl.graph.nodes}")
                    if (currentDestination?.route != screen.routeName) {
                        navCtrl.navigate(screen.routeName) {
                            popUpTo(navCtrl.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                })
        }
    }
}