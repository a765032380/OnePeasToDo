package pub.gll.onepeas.todo.ui.setting

import androidx.compose.foundation.layout.*
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Slider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
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

    Column {
        var startValue by remember { mutableStateOf(viewModel.start.toFloat()) }
        Text(text = "设置初始的位置")
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
                    viewModel.start = startValue.toInt()
                },
                valueRange = 0f..180f,
            )
        }
        Text(text = "设置偏转的位置")
        var endValue by remember { mutableStateOf(viewModel.end.toFloat()) }
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
                    viewModel.end = endValue.toInt()
                },
                valueRange = 0f..180f,
            )
        }
        Row() {
            ExtendedFloatingActionButton(
                onClick = {

                          },
                icon = {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Favorite"
                    )
                },
                text = { Text("保存开灯") }
            )
            ExtendedFloatingActionButton(
                onClick = { /* ... */ },
                icon = {
                    Icon(
                        Icons.Filled.Add,
                        contentDescription = "Favorite"
                    )
                },
                text = { Text("保存关灯") }
            )

        }

    }

}