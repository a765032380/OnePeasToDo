package pub.gll.onepeas.todo

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pub.gll.onepeas.todo.car.activity.CarActivity
import pub.gll.onepeas.todo.car.activity.CarComposeActivity
import pub.gll.onepeas.todo.car.activity.CustomViewAct
import pub.gll.onepeas.todo.ui.main.MainActivity

@Composable
fun MainCompose(activity:Activity) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.verticalScroll(scrollState)) {
        Button(onClick = {
            activity.startActivity(Intent(activity,CarActivity::class.java))
        }) {
           Text(text = "CarActivity")
        }

        Button(onClick = {
            activity.startActivity(Intent(activity,CarComposeActivity::class.java))
        }) {
           Text(text = "CarComposeActivity")
        }

        Button(onClick = {
            activity.startActivity(Intent(activity,MainActivity::class.java))
        }) {
           Text(text = "MainActivity")
        }

        Button(onClick = {
            activity.startActivity(Intent(activity,CustomViewAct::class.java))
        }) {
           Text(text = "CustomViewAct")
        }

    }
}