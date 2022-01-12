package pub.gll.onepeas.todo.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Slider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import dagger.hilt.android.lifecycle.HiltViewModel
import pub.gll.onepeas.todo.ui.page.common.RouteName
import kotlinx.coroutines.launch
import pub.gll.onepeas.todo.ui.widgets.HomeSearchBar
import pub.gll.onepeas.todo.ui.widgets.TextTabBar
import pub.gll.onepeas.todo.util.AppUserUtil
import pub.gll.onepeas.todo.util.MqttClientUtil
import pub.gll.onepeas.todo.util.RouteUtils

@ExperimentalPagerApi
@Composable
fun HomePage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val titles = viewModel.viewStates.titles
    val scopeState = rememberCoroutineScope()
    //跳转到登录
//    if (!AppUserUtil.isLogged){
//        RouteUtils.navTo(navCtrl, RouteName.LOGIN)
//    }
    Column {
        val pagerState = rememberPagerState(
            initialPage = 0
        )
        var slideValue by remember { mutableStateOf(0f) }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        ) {
            Text(text = slideValue.toInt().toString())
            Slider(
                value = slideValue,
                onValueChange = {
                    slideValue = it
                    viewModel.publishEnd(slideValue.toInt())
                },
                valueRange = 0f..180f,
            )
        }

    }

//    OpenButton()
}
@Preview(showBackground = true)
@Composable
fun OpenButton(){
    FloatingActionButton(
        onClick = {
        MqttClientUtil.publishStart2End(0,180)
    }) {

    }
}