package pub.gll.onepeas.todo.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import pub.gll.onepeas.libbase.BaseApp
import pub.gll.onepeas.libmqtt.MqttListener
import pub.gll.onepeas.libmqtt.MqttManager
import pub.gll.onepeas.libmqtt.MqttOptions
import pub.gll.onepeas.todo.ActivityResultListenerManager
import pub.gll.onepeas.todo.ui.page.common.HomeEntry
import pub.gll.onepeas.todo.util.MqttClientUtil

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: MyViewModel by viewModels()
    private lateinit var splashScreen: SplashScreen

    companion object {
        lateinit var instance: MainActivity
    }

    @OptIn(ExperimentalFoundationApi::class, ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        instance = this
        ActivityResultListenerManager.activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            ActivityResultListenerManager.onActivityResult(it)
        }
        WindowCompat.setDecorFitsSystemWindows(window,false)
        splashScreen = installSplashScreen()
        setContent {
            HomeEntry()
        }
        initMqttClient()
    }

    private fun initMqttClient(){
        MqttClientUtil.client()
        MqttManager.registerMqttListener(object :MqttListener{
            override fun onMessage(topic: String, message: String) {
                println("$topic ---- $message")
            }
        })
    }
}