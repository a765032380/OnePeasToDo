package pub.gll.onepeas.todo.ui.home

import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi

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
}