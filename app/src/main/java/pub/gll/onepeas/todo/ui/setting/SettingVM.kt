package pub.gll.onepeas.todo.ui.setting

import androidx.compose.material.Snackbar
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import pub.gll.onepeas.todo.util.MqttClientUtil
import pub.gll.onepeas.todo.util.SteeringEngineStartEndUtil
import javax.inject.Inject

@HiltViewModel
class SettingVM @Inject constructor() : ViewModel() {

    private val _viewEvents = Channel<SettingPageViewEvent>(Channel.BUFFERED)
    val viewEvents = _viewEvents.receiveAsFlow()

    fun close(){
        viewModelScope.launch (Dispatchers.IO) {
            MqttClientUtil.publishStart2End(SteeringEngineStartEndUtil.closeStart,SteeringEngineStartEndUtil.closeEnd)
        }
    }

    fun open(){
        viewModelScope.launch (Dispatchers.IO) {
            MqttClientUtil.publishStart2End(SteeringEngineStartEndUtil.openStart,SteeringEngineStartEndUtil.openEnd)
        }
    }
    fun sendValue(value:Int){
        viewModelScope.launch (Dispatchers.IO) {
            MqttClientUtil.publishEnd(value)
        }
    }

    fun saveOpenStart(openStart: Int){
        viewModelScope.launch {
            SteeringEngineStartEndUtil.onOpenStart(openStart)
        }
    }
    fun saveOpenEnd(openEnd:Int){
        viewModelScope.launch {
            SteeringEngineStartEndUtil.onOpenEnd(openEnd)
        }
        sendValue(openEnd)
    }
    fun saveCloseStart(closeStart:Int){
        viewModelScope.launch {
            SteeringEngineStartEndUtil.onCloseStart(closeStart)
        }
    }
    fun saveCloseEnd(closeEnd:Int){
        viewModelScope.launch {
            SteeringEngineStartEndUtil.onCloseEnd(closeEnd)
        }
        sendValue(closeEnd)
    }

}
/**
 * 一次性事件
 */
sealed class SettingPageViewEvent {
    object PopBack : SettingPageViewEvent()
}