package pub.gll.onepeas.todo.ui.setting

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Slider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.flow.collect

@OptIn(ExperimentalPagerApi::class)
@ExperimentalComposeUiApi
@Composable
fun SettingPage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: SettingVM = hiltViewModel()
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    val coroutineState = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        viewModel.viewEvents.collect {
            if (it is SettingPageViewEvent.PopBack) {
                navCtrl.popBackStack()
            }
        }
    }

    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()){
        Text(text = "设置初始的位置")
        var endValue by remember { mutableStateOf(0f) }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        ) {
            Text(text = endValue.toInt().toString())
            Slider(
                value = endValue,
                onValueChange = {
                    endValue = it
                    viewModel.sendValue(endValue.toInt())
                },
                valueRange = 0f..180f,
            )
        }
        var startValue by remember { mutableStateOf(0f) }
        Text(text = "设置偏转的位置")
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        ) {
            Text(text = startValue.toInt().toString())
            Slider(
                value = startValue,
                onValueChange = {
                    startValue = it
                    viewModel.sendValue(startValue.toInt())
                },
                valueRange = 0f..180f,
            )
        }
        TwoButton("保存开灯",Icons.Filled.Favorite,{
            viewModel.saveOpenStart(startValue.toInt())
            viewModel.saveOpenEnd(endValue.toInt())
        },"保存关灯",Icons.Filled.Done,{
            viewModel.saveCloseStart(startValue.toInt())
            viewModel.saveCloseEnd(endValue.toInt())
        })
        Divider(
            color = androidx.compose.ui.graphics.Color.Transparent,
            modifier = Modifier.fillMaxWidth().height(20.dp)
        )
        TwoButton("测试开灯",Icons.Filled.Favorite,{
            viewModel.open()
        },"测试关灯",Icons.Filled.Done,{
            viewModel.close()
        })

    }
}
@Composable
fun TwoButton(
    textStr1:String,
    imageVector1: ImageVector,
    onClick1: () -> Unit,
    textStr2:String,
    imageVector2: ImageVector,
    onClick2: () -> Unit){
    Row(modifier = Modifier.fillMaxWidth()) {
        ExtendedFloatingActionButton(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
            onClick = onClick1,
            icon = {
                Icon(
                    imageVector1,
                    contentDescription = "Favorite"
                )
            },
            text = { Text(textStr1) }
        )
        ExtendedFloatingActionButton(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp)
                .wrapContentWidth(Alignment.CenterHorizontally),
            onClick = onClick2,
            icon = {
                Icon(
                    imageVector2,
                    contentDescription = "Favorite"
                )
            },
            text = { Text(textStr2) }
        )
    }
}
