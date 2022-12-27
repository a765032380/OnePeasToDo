package pub.gll.onepeas.module.esp8266.mqtt

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.insets.navigationBarsPadding
import com.google.accompanist.insets.statusBarsPadding
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.gson.Gson
import pub.gll.onepeas.module.esp8266.R

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalPagerApi
@Composable
fun MqttPage() {
    val viewModel: MqttVM = hiltViewModel()
    val viewStates = viewModel.viewStates
    Scaffold(modifier = Modifier
        .statusBarsPadding()
        .navigationBarsPadding(),
        bottomBar={
            Edit()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    viewModel.dispatch(MqttViewAction.ChangeClientState)
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
                        text = if (viewStates.isClient) "已连接" else "未连接",
                        fontSize = 12.sp,
                        color = Color.Black
                    )
                }
            }
        },
        content = {
            Column (modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
            ){
                val listState: LazyListState = rememberLazyListState()
                LazyColumn(modifier = Modifier
                    .fillMaxWidth(),
                    state = listState) {
                    items(viewStates.mqttMessageList){message->
                        if (message.isSend){
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End) {
                                Text(text = "${message.message}")
                            }
                        }else{
                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(text = "${message.message}")
                            }
                        }
                    }
                }
            }
        })

}
@Preview
@Composable
fun EditPreview(){
    Edit()
}

@Composable
fun Edit(modifier : Modifier=Modifier){
    val viewModel: MqttVM = hiltViewModel()
    var text by remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        BasicTextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .background(Color.White, CircleShape)
                .height(35.dp)
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 10.dp)
                ) {
                    Box(
                        modifier = Modifier.weight(1f),
                        contentAlignment = Alignment.CenterStart
                    ) {
                        innerTextField()
                    }
                    IconButton(
                        onClick = {
                            viewModel.dispatch(MqttViewAction.SendMessage(text))
                            text = ""
                        },
                    ) {
                        Icon(Icons.Filled.Send, null)
                    }
                }
            }
        )
    }
}