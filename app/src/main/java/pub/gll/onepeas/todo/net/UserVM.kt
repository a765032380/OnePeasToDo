package pub.gll.onepeas.todo.net

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import pub.gll.onepeas.libupload.FileType
import pub.gll.onepeas.libupload.TXUploadManager
import pub.gll.onepeas.todo.bean.UserInfo
import pub.gll.onepeas.todo.data.http.HttpResult
import pub.gll.onepeas.todo.data.http.HttpService
import pub.gll.onepeas.todo.ui.login.LoginViewState
import pub.gll.onepeas.todo.util.AppUserUtil
import java.io.File
import javax.inject.Inject

@HiltViewModel
class UserVM @Inject constructor(
    private var service: HttpService
) : ViewModel()  {

    var viewStates by mutableStateOf(UserInfo())
        private set
    var editUserState by mutableStateOf(EditUserState())
        private set

    private val _viewEvents = Channel<UserViewEvent>(Channel.BUFFERED)
    val viewEvents = _viewEvents.receiveAsFlow()

    fun dispatch(action: UserViewAction) {
        when (action) {
            is UserViewAction.UserInfo -> userInfo()
            is UserViewAction.UpdateUserInfo -> updateUser("")
            is UserViewAction.UpdateHeader -> updateUser(action.head_image)
        }
    }

    fun upload(context: Context, file: File){
        viewModelScope.launch {
            TXUploadManager.upload(context, FileType.Image,file)
        }
    }
    private fun userInfo(){
        viewModelScope.launch {
            flow {
                emit(service.userInfo())
            }.map {
                if (it.errorCode == 200) {
                    if (it.data != null) {
                        HttpResult.Success(it.data!!)
                    } else {
                        throw Exception("the result of remote's request is null")
                    }
                } else {
                    throw Exception(it.errorMsg)
                }
            }.onEach {
                AppUserUtil.onLogin(it.result)
                editUserState.copy(head_image = it.result.headerimg)
                _viewEvents.send(UserViewEvent.UserInfoEvent(it.result))
            }.catch {
                _viewEvents.send(UserViewEvent.ErrorMessage(it.message ?: ""))
            }.collect()
        }
    }

    private fun updateUser(head_image: String) {
        viewModelScope.launch {
            flow {
                val map = HashMap<String,String>()
                map["username"] = "gll111"
                map["password"] = "123"
                map["head_image"] = head_image

                emit(service.updateUser(map))
            }.map {
                if (it.errorCode == 200) {
                    if (it.data != null) {
                        HttpResult.Success(it.data!!)
                    } else {
                        throw Exception("the result of remote's request is null")
                    }
                } else {
                    throw Exception(it.errorMsg)
                }
            }.onEach {
                AppUserUtil.onLogin(it.result)
                _viewEvents.send(UserViewEvent.UserInfoEvent(it.result))
            }.catch {
                _viewEvents.send(UserViewEvent.ErrorMessage(it.message ?: ""))
            }.collect()
        }
    }
}
data class EditUserState(
    val username: String = "",
    val head_image: String = "",
    val password: String = "",
    val new_password: String = "",
    val phone: String = ""
)

sealed class UserViewAction {
    object UserInfo : UserViewAction()
    object UpdateUserInfo : UserViewAction()
    data class UpdateHeader(val head_image: String) : UserViewAction()
}

/**
 * 一次性事件
 */
sealed class UserViewEvent {
    object PopBack : UserViewEvent()
    data class ErrorMessage(val message: String) : UserViewEvent()
    data class UserInfoEvent(val userInfo: UserInfo) : UserViewEvent()
}