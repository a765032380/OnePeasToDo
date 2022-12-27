package pub.gll.onepeas.module.esp8266.mqtt

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import pub.gll.onepeas.libbase.mqtt.ClientState
import pub.gll.onepeas.libbase.mqtt.MqttListener
import pub.gll.onepeas.libbase.mqtt.MqttManager
import pub.gll.onepeas.libbase.mqtt.MqttOptions
import javax.inject.Inject

@HiltViewModel
class MqttVM @Inject constructor() : ViewModel() {

    var viewStates by mutableStateOf(MqttViewState())
        private set

    fun dispatch(action: MqttViewAction) {
        when (action) {
            is MqttViewAction.ChangeClientState -> {
               if (MqttManager.isConnected()){
                   disconnect()
               }else{
                   client()
               }
            }
            is MqttViewAction.SendMessage ->{
                val message = MqttMessage("testtopic",action.message,true)
                MqttManager.publish(Gson().toJson(message))
            }
        }
    }

    private val mMqttListener = object :MqttListener{
        override fun onMessage(topic: String, message: String) {
            val mqttMessageList = viewStates.mqttMessageList
            val mqttMessage = Gson().fromJson(message,MqttMessage::class.java)
            mqttMessageList.add(mqttMessage)
            viewStates = viewStates.copy(mqttMessageList = mqttMessageList)
            Log.e("LLLLLL","topic:${topic}-message:${message}")
        }

        override fun onClientState(clientState: ClientState) {
            Log.e("LLLLLL",clientState.name)
            viewStates = viewStates.copy(isClient = clientState==ClientState.ConnectedSuccess)
        }
    }


    private fun disconnect(){
        MqttManager.disconnect()
        MqttManager.unRegisterMqttListener(mMqttListener)
    }


    private fun client(){
        MqttManager.registerMqttListener(mMqttListener)
        MqttManager.client(MqttOptions().apply {
            broker = "tcp://49.232.198.163:1883"
            pushTopic = "testtopic"
            uid = 17610670228
            subTopic = arrayListOf("testtopic/#")
        })
    }
}
data class MqttMessage(val topic: String, val message: String, val isSend:Boolean=false)



data class MqttViewState(
    //必须使用SnapshotStateList，否则列表不更新
    val mqttMessageList: SnapshotStateList<MqttMessage> = mutableStateListOf(),
    val isClient: Boolean = false
)

sealed class MqttViewAction {
    object ChangeClientState : MqttViewAction()
    class SendMessage(val message:String) : MqttViewAction()
}