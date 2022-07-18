package pub.gll.onepeas.todo.ui.page.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import pub.gll.onepeas.todo.test.ButtonTest
import pub.gll.onepeas.todo.test.Greeting
import pub.gll.onepeas.todo.ui.page.splash.SplashPage


@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun HomeEntry() {
    //是否闪屏页---暂时保留
    var isSplash by remember { mutableStateOf(false) }

    var count by remember {
        mutableStateOf(0)
    }
    MaterialTheme {
        ProvideWindowInsets {
            val systemUiController = rememberSystemUiController()
            SideEffect {
                systemUiController.setSystemBarsColor(Color.Transparent,true)
            }
            Column(modifier = Modifier.fillMaxHeight()) {
                val list = List(1000){
                    "Hello Android #$it"
                }
                Column(modifier = Modifier.weight(1f)) {
                    LazyColumn{
                        items(list){item ->
                            Greeting(item)
                        }
                    }
                }
                Column {
                    ButtonTest(count){
                        count = it
                    }
                    ButtonTest(count){
                        count = it
                    }
                    ButtonTest(count){
                        count = it
                    }
                }
            }

        }
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

