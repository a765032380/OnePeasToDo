package pub.gll.onepeas.todo.test

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun ButtonTest(count:Int,updateCount:(Int)->Unit){
    Button(onClick = {
        updateCount(count+1)
    }, colors = ButtonDefaults.buttonColors(
        containerColor = if (count>5) Color.Green else Color.Red)
    ){
        Text(text = "测试=${count}")
    }
}

@Composable
fun Greeting(name:String){
    var isSelect by remember {
        mutableStateOf(false)
    }
    val backgroundColor by animateColorAsState(if
            (isSelect) Color.Red else Color.Transparent
    )
    Text(text = name,
        modifier = Modifier.background(backgroundColor)
        .clickable {
            isSelect = !isSelect
        },
        color = Color.Blue
    )
}