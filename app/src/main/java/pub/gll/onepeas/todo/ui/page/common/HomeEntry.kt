package pub.gll.onepeas.todo.ui.page.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.graphics.Color
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import pub.gll.onepeas.todo.ui.page.splash.SplashPage
import pub.gll.onepeas.todo.ui.theme.AppTheme


@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun HomeEntry() {
    //是否闪屏页
    var isSplash by remember { mutableStateOf(false) }
    MaterialTheme {
        ProvideWindowInsets {
            val systemUiController = rememberSystemUiController()
            SideEffect {
                systemUiController.setSystemBarsColor(Color.Transparent,true)
            }
            if (isSplash) {
                SplashPage { isSplash = false }
            } else {
                AppScaffold()
            }
        }
    }
}

