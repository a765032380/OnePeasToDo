package pub.gll.onepeas.module.comic.comic

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.statusBarsPadding
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.lib.log.ext.e
import pub.gll.onepeas.libbase.util.WebData
import pub.gll.onepeas.libbase.util.toJson
import pub.gll.onepeas.module.comic.comic.bookshelf.ComicBookShelf
import pub.gll.onepeas.module.comic.comic.home.ComicHome
import pub.gll.onepeas.module.comic.comic.mine.ComicMine
import pub.gll.onepeas.module.comic.comic.ui.ComicBottomNavBarView
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@AndroidEntryPoint
class ComicMainAct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {}
            Main {
                if (it) {
                    //设置横屏
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                } else {
                    requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                }
            }
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN)
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
            window.addFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        }
    }
}



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalComposeUiApi::class
)
@Composable
fun Main(onFull: (isFull: Boolean) -> Unit) {
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
//                    popupSnackBar(coroutineState, scaffoldState, label = SNACK_ERROR, "关灯")
//                    val webData = WebData("播放器","http://49.232.198.163/video.html",false)
//                    val encodedUrl = URLEncoder.encode(webData.toJson(), StandardCharsets.UTF_8.toString())
//                    navCtrl.navigate("${RouteName.WEB_VIEW}/${encodedUrl}")
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

            }
        },
        snackbarHost = {
            androidx.compose.material.SnackbarHost(
                hostState = scaffoldState.snackbarHostState
            ) { data ->
                println("actionLabel = ${data.actionLabel}")
//                AppSnackBar(data = data)
            }
        }
    )
}