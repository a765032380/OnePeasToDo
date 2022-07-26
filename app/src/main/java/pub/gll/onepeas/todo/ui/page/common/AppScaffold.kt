package pub.gll.onepeas.todo.ui.page.common

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.statusBarsPadding
import pub.gll.onepeas.libbase.util.WebData
import pub.gll.onepeas.libcore.util.fromJson
import pub.gll.onepeas.libcore.util.toJson
import pub.gll.onepeas.lib.log.ext.e
import pub.gll.onepeas.module.account.login.LoginPage
import pub.gll.onepeas.module.account.mine.ProfilePage
import pub.gll.onepeas.todo.ui.webview.WebViewPage
import pub.gll.onepeas.libbase.widget.AppSnackBar
import pub.gll.onepeas.todo.ui.widgets.BottomNavBarView
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

fun NavController.navigateAndArgument(route: String, args: Any? = null) {
    val encodedUrl = URLEncoder.encode(args.toJson(), StandardCharsets.UTF_8.toString())
    navigate("${route}/${encodedUrl}")
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@Composable
fun AppScaffold() {
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
                    val webData = WebData("播放器","http://49.232.198.163/video.html",false)
                    navCtrl.navigateAndArgument(RouteName.WEB_VIEW,webData)
                },
                modifier = Modifier.size(50.dp),
                shape = RoundedCornerShape(25.dp),
                contentColor = Color.Blue,
                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 8.dp,
                    hoveredElevation = 10.dp
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    androidx.compose.material3.Text(
                        text = "关灯",
                        fontSize = 18.sp,
                        color = Color.Black
                    )
                }
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        bottomBar = {
            when (currentDestination?.route) {
                RouteName.HOME -> BottomNavBarView(navCtrl = navCtrl)
                RouteName.WIFI_CONFIG -> BottomNavBarView(navCtrl = navCtrl)
                RouteName.SETTING -> BottomNavBarView(navCtrl = navCtrl)
                RouteName.PROFILE -> BottomNavBarView(navCtrl = navCtrl)
            }
        },
        content = {
            var homeIndex = remember { 0 }
            var categoryIndex = remember { 0 }

            NavHost(
                modifier = Modifier.background(MaterialTheme.colors.background),
                navController = navCtrl,
                startDestination = RouteName.PROFILE
            ) {


                //我的
                composable(route = RouteName.PROFILE) {
                    it.destination.route?.e()
                    ProfilePage(navCtrl, scaffoldState)
                }

                //WebView
                composable(route = RouteName.WEB_VIEW + "/{webData}",
                    arguments = listOf(navArgument("webData") { type = NavType.StringType })
                ) {
                    val args = it.arguments?.getString("webData")?.fromJson<WebData>()

                    if (args != null) {
                        WebViewPage(webData = args, navCtrl = navCtrl){

                        }
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