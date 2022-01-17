package pub.gll.onepeas.todo.ui.wifi

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.ImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.launch
import pub.gll.onepeas.todo.ui.setting.SettingVM

@ExperimentalPagerApi
@Composable
fun WifiPage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: WifiVM = hiltViewModel()
) {

    val scope = rememberCoroutineScope()
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()){
        Text(text = "配置WIFI",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 18.sp)
        var wifiName by remember { mutableStateOf("202") }//1901
        var wifiPassword by remember { mutableStateOf("4001001111202") }//Guo.18222902185.com@
        OutlinedTextField(value = wifiName, onValueChange = {
                  wifiName = it
        },modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),label = {
            Text("Wi-Fi名称")
        })
        OutlinedTextField(value = wifiPassword, onValueChange = {
                    wifiPassword = it
        },modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),label = {
            Text("Wi-Fi密码")
        })
        Divider(
            color = Color.Transparent,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )
        var wifiState by remember { mutableStateOf(viewModel.wifiState.value) }
        Row(horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()) {
            ExtendedFloatingActionButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                onClick = {
                    if (viewModel.wifiState.value){
                        viewModel.sendWifi(wifiName,wifiPassword)
                    }else{
                        viewModel.stop()
                    }
                    viewModel.wifiState.value = !viewModel.wifiState.value
                    wifiState = viewModel.wifiState.value
                },
                icon = {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Favorite"
                    )
                },
                text = { Text(if (wifiState) "开始广播" else "停止广播") }
            )
        }


    }
}