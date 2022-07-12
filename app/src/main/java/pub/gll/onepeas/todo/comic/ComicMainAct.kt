package pub.gll.onepeas.todo.comic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.liblog.ext.e
import pub.gll.onepeas.todo.bean.WebData
import pub.gll.onepeas.todo.comic.bookshelf.ComicBookShelf
import pub.gll.onepeas.todo.comic.home.ComicHome
import pub.gll.onepeas.todo.comic.home.vm.ComicHomeVM
import pub.gll.onepeas.todo.comic.mine.ComicMine
import pub.gll.onepeas.todo.comic.ui.ComicBottomNavBarView
import pub.gll.onepeas.todo.ui.login.LoginPage
import pub.gll.onepeas.todo.ui.page.common.RouteName
import pub.gll.onepeas.todo.ui.webview.WebViewPage
import pub.gll.onepeas.todo.ui.widgets.AppSnackBar
import pub.gll.onepeas.todo.ui.widgets.SNACK_ERROR
import pub.gll.onepeas.todo.ui.widgets.popupSnackBar
import pub.gll.onepeas.todo.util.fromJson
import javax.inject.Inject

@AndroidEntryPoint
class ComicMainAct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main()
        }
    }
}

@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalComposeUiApi::class
)
@Composable
fun Main() {
    val navCtrl = rememberNavController()
    val navBackStackEntry by navCtrl.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val scaffoldState = rememberScaffoldState()
    val coroutineState = rememberCoroutineScope()
    Scaffold(
        modifier = Modifier
            .statusBarsPadding()
            .navigationBarsPadding(),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    popupSnackBar(coroutineState, scaffoldState, label = SNACK_ERROR, "关灯")
//                    commonNotification(navCtrl.context)
                },
                modifier = Modifier.size(60.dp),
                shape = RoundedCornerShape(30.dp),
                contentColor = Color.Blue,
                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 8.dp,
                    hoveredElevation = 10.dp
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
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
                ComicRouteName.COMIC_HOME -> ComicBottomNavBarView(navCtrl = navCtrl)
                ComicRouteName.COMIC_BOOKSHELF -> ComicBottomNavBarView(navCtrl = navCtrl)
                ComicRouteName.COMIC_MINE -> ComicBottomNavBarView(navCtrl = navCtrl)
            }
        },
        content = {
            NavHost(
                modifier = Modifier.background(MaterialTheme.colorScheme.background),
                navController = navCtrl,
                startDestination = ComicRouteName.COMIC_HOME
            ) {
                //首页
                composable(route = ComicRouteName.COMIC_HOME) {
                    it.destination.route?.e()
                    ComicHome()
                }

                //书架
                composable(route = ComicRouteName.COMIC_BOOKSHELF) {
                    it.destination.route?.e()
                    ComicBookShelf()
                }

                //我的
                composable(route = ComicRouteName.COMIC_MINE) {
                    it.destination.route?.e()
                    ComicMine()
                }

                //WebView
                composable(
                    route = RouteName.WEB_VIEW + "/{webData}",
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

                }
            }
        },
        snackbarHost = {
            androidx.compose.material.SnackbarHost(
                hostState = scaffoldState.snackbarHostState
            ) { data ->
                println("actionLabel = ${data.actionLabel}")
                AppSnackBar(data = data)
            }
        }
    )
}