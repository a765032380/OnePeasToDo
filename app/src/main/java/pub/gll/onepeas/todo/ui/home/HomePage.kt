package pub.gll.onepeas.todo.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Snackbar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.launch
import pub.gll.onepeas.todo.ui.setting.SettingVM

@ExperimentalPagerApi
@Composable
fun HomePage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: SettingVM = hiltViewModel()
) {
    val scope = rememberCoroutineScope()
    //跳转到登录
//    if (!AppUserUtil.isLogged){
//        RouteUtils.navTo(navCtrl, RouteName.LOGIN)
//    }
    Box(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center ) {
//        Image(
//            bitmap = rememberImagePainter("images/img.png"),
//            modifier = Modifier.fillMaxWidth()
//                .fillMaxHeight()
//        )
//        ExtendedFloatingActionButton(
//            onClick = {
//                viewModel.open()
//                scope.launch {
//                    scaffoldState.snackbarHostState.showSnackbar("Snackbar")
//                }
//            },
//            icon = {
//                Icon(
//                    Icons.Filled.Favorite,
//                    contentDescription = "Favorite"
//                )
//            },
//            text = { Text("开灯") }
//        )
    }
}