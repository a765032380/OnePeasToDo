package pub.gll.onepeas.todo.ui.setting

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
    var start:Int
        set(value) {
            viewModelScope.launch {
                SteeringEngineStartEndUtil.onStart(value)
            }
        }
        get() = SteeringEngineStartEndUtil.steeringEngineConfig.start
    var end :Int
        set(value) {
            viewModelScope.launch {
                SteeringEngineStartEndUtil.onEnd(value)
            }
        }
        get() = SteeringEngineStartEndUtil.steeringEngineConfig.end

    fun close(){
        viewModelScope.launch {
            _viewEvents.send(SettingPageViewEvent.PopBack)
        }
    }
    fun open(){
        viewModelScope.launch (Dispatchers.IO) {
            MqttClientUtil.publishStart2End(start,end)
        }

    }

}
/**
 * 一次性事件
 */
sealed class SettingPageViewEvent {
    object PopBack : SettingPageViewEvent()
}