package pub.gll.onepeas.todo.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import org.eclipse.paho.client.mqttv3.MqttMessage
import pub.gll.onepeas.todo.test.*
import pub.gll.onepeas.todo.ui.page.common.HomeEntry
import pub.gll.onepeas.todo.util.MqttClientUtil

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MyViewModel by viewModels()
    private lateinit var splashScreen: SplashScreen

    @OptIn(ExperimentalFoundationApi::class, ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashScreen = installSplashScreen()
        setContent {
            HomeEntry()
        }
        initMqttClient()
    }
    private fun initMqttClient(){
        val gson = Gson()
        MqttClientUtil.mqttClient { topic: String, mqttMessage: MqttMessage ->
            println(topic)
            try {
                val instructions = gson.fromJson(String(mqttMessage.payload), Instructions::class.java)
            } catch (e: Exception) {

            }

        }
        MqttClientUtil.subscribe()
    }
}