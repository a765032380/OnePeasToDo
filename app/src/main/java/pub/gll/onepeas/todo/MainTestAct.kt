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
import pub.gll.libaptannotation.Print
import pub.gll.onepeas.libbase.Test
import pub.gll.onepeas.libbase.arouter.Launch

class MainTestAct : ComponentActivity() {

    @Print
    val age:Int = 100

    @Print
    val name:String = "张三"


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
        Button(onClick = {
            Launch.carCompose()
        }) {
            Text(text = "CarComposeActivity")
        }
        Button(onClick = {
            Launch.customView()
        }) {
            Text(text = "CustomViewAct")
        }
        Button(onClick = {
            Launch.comicMain()
        }) {
            Text(text = "ComicMainAct")
        }
        Button(onClick = {
            Launch.webView(Test.TEST_VIP_VIDEO)
        }) {
            Text(text = "WebActivity")
        }
        Button(onClick = {
            Launch.videoPlay("http://106.54.112.102/live/livestream.flv")
        }) {
            Text(text = "PlayActivity")
        }
        Button(onClick = {
            Launch.videoList()
        }) {
            Text(text = "VideoAct")
        }
        Button(onClick = {
            Launch.downloadList()
        }) {
            Text(text = "DownloadListActivity")
        }
        Button(onClick = {
            Launch.esp8266()
        }) {
            Text(text = "ESP_8266")
        }

    }
}