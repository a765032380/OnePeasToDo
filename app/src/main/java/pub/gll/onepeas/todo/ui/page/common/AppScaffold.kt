package pub.gll.onepeas.todo.ui.page.common

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.statusBarsPadding
import com.google.accompanist.pager.ExperimentalPagerApi
import pub.gll.onepeas.todo.bean.WebData
import pub.gll.onepeas.todo.ui.home.HomePage
import pub.gll.onepeas.todo.ui.login.LoginPage
import pub.gll.onepeas.todo.ui.setting.SettingPage
import pub.gll.onepeas.todo.ui.setting.SettingVM
import pub.gll.onepeas.todo.ui.webview.WebViewPage
import pub.gll.onepeas.todo.ui.widgets.BottomNavBarView
import pub.gll.onepeas.todo.ui.widgets.AppSnackBar
import pub.gll.onepeas.todo.ui.wifi.WifiPage
import pub.gll.onepeas.todo.util.MqttClientUtil
import pub.gll.onepeas.todo.util.fromJson

@OptIn(ExperimentalPagerApi::class)
@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@Composable
fun AppScaffold(settingVM: SettingVM = hiltViewModel()) {
    val navCtrl = rememberNavController()
    val navBackStackEntry by navCtrl.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding(),
        floatingActionButton = {
            androidx.compose.material3.FloatingActionButton(
                onClick = {
                    settingVM.close()
                },
                modifier = Modifier.size(120.dp),
                shape = RoundedCornerShape(60.dp),
                contentColor = Color.Blue,
                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 8.dp,
                    hoveredElevation = 10.dp
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
//                Icon(imageVector = Icons.Filled.Add, contentDescription = "Add", tint = Color.Red)
//                Spacer(modifier = Modifier.width(10.dp))
                    androidx.compose.material3.Text(
                        text = "狗磊请关灯",
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                }
            }
        },
        floatingActionButtonPosition = FabPosition.End,
//        bottomBar = {
//            when (currentDestination?.route) {
//                RouteName.HOME -> BottomNavBarView(navCtrl = navCtrl)
//                RouteName.WIFI_CONFIG -> BottomNavBarView(navCtrl = navCtrl)
//                RouteName.SETTING -> BottomNavBarView(navCtrl = navCtrl)
//                RouteName.PROFILE -> BottomNavBarView(navCtrl = navCtrl)
//            }
//        },
        content = {
            var homeIndex = remember { 0 }
            var categoryIndex = remember { 0 }

            NavHost(
                modifier = Modifier.background(MaterialTheme.colors.background),
                navController = navCtrl,
                startDestination = RouteName.HOME
            ) {
                //首页
                composable(route = RouteName.HOME) {
                    HomePage(navCtrl, scaffoldState)
                }

                //WIFI
                composable(route = RouteName.WIFI_CONFIG) {
                    WifiPage(navCtrl,scaffoldState)
                }

                //设置
                composable(route = RouteName.SETTING) {
                    SettingPage(navCtrl, scaffoldState)
                }

                //我的
                composable(route = RouteName.PROFILE) {
//                    ProfilePage(navCtrl, scaffoldState)
                }

                //WebView
                composable(route = RouteName.WEB_VIEW + "/{webData}",
                    arguments = listOf(navArgument("webData") { type = NavType.StringType })
                ) {
                    val args = it.arguments?.getString("webData")?.fromJson<WebData>()
                    if (args != null) {
                        WebViewPage(webData = args, navCtrl = navCtrl)
                    }
                }

                //登录
                composable(route = RouteName.LOGIN) {
                    LoginPage(navCtrl, scaffoldState)
                }

                //文章搜索页
                composable(
                    route = RouteName.ARTICLE_SEARCH + "/{id}",
                    arguments = listOf(navArgument("id") { type = NavType.IntType })
                ) {
//                    SearchPage(navCtrl, scaffoldState)
                }
            }
        },
        snackbarHost = {
            SnackbarHost(
                hostState = scaffoldState.snackbarHostState
            ) { data ->
                println("actionLabel = ${data.actionLabel}")
                AppSnackBar(data = data)
            }
        }
    )
}