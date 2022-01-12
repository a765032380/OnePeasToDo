package pub.gll.onepeas.todo.ui.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import pub.gll.onepeas.todo.data.http.HttpResult
import pub.gll.onepeas.todo.ui.login.LoginViewEvent
import pub.gll.onepeas.todo.ui.widgets.TabTitle
import pub.gll.onepeas.todo.util.AppUserUtil
import pub.gll.onepeas.todo.util.MqttClientUtil
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    var viewStates by mutableStateOf(HomeViewState())
        private set

    init {
        viewStates = viewStates.copy(
            titles = listOf(
                TabTitle(101, "广场"),
                TabTitle(102, "推荐"),
                TabTitle(103, "问答")
            )
        )
    }
    fun publishEnd(end :Int){
        viewModelScope.launch (Dispatchers.IO){
            MqttClientUtil.publishEnd(end)
        }
    }
}

data class HomeViewState(val titles: List<TabTitle> = emptyList())