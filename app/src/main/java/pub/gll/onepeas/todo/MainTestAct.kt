package pub.gll.onepeas.todo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import pub.gll.onepeas.module.car.activity.CarComposeActivity
import pub.gll.onepeas.module.car.activity.CustomViewAct
import pub.gll.onepeas.module.comic.comic.ComicMainAct
import pub.gll.onepeas.todo.ui.main.MainActivity
import pub.gll.onepeas.todo.web.WebActivity
import pub.gll.onepeas.todo.web.download.PlayActivity

class MainTestAct : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainCompose(this)
        }
    }
}

@Composable
fun MainCompose(activity: Activity) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.verticalScroll(scrollState)) {
//        Button(onClick = {
//            activity.startActivity(Intent(activity,CarActivity::class.java))
//        }) {
//           Text(text = "CarActivity")
//        }

        Button(onClick = {
            activity.startActivity(Intent(activity, CarComposeActivity::class.java))
        }) {
            Text(text = "CarComposeActivity")
        }

        Button(onClick = {
            activity.startActivity(Intent(activity, MainActivity::class.java))
        }) {
            Text(text = "MainActivity")
        }

        Button(onClick = {
            activity.startActivity(Intent(activity, CustomViewAct::class.java))
        }) {
            Text(text = "CustomViewAct")
        }
        Button(onClick = {
            activity.startActivity(Intent(activity, ComicMainAct::class.java))
        }) {
            Text(text = "ComicMainAct")
        }
        Button(onClick = {
            activity.startActivity(Intent(activity, WebActivity::class.java))
        }) {
            Text(text = "WebActivity")
        }
        Button(onClick = {
            PlayActivity.launch(activity,Test.TEST_MP4_URL)
        }) {
            Text(text = "M3U8PlayActivity")
        }

    }
}