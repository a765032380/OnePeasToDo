package pub.gll.onepeas.libbase.util

import pub.gll.onepeas.libbase.di.http.DataStoreUtils

object AppUserUtil {
    private const val LOGGED_FLAG = "logged_flag"
    private const val USER_INFO = "user_info"
    var isLogged: Boolean
        get() = DataStoreUtils.readBooleanData(LOGGED_FLAG, false)
        set(value) = DataStoreUtils.saveSyncBooleanData(LOGGED_FLAG, value = value)

    var userInfo: UserInfo?
        get() = DataStoreUtils.readStringData(USER_INFO).fromJson()
        set(value) = DataStoreUtils.saveSyncStringData(USER_INFO, value = value?.toJson() ?: "")

    fun onLogin(userInfo: UserInfo) {
        isLogged = true
        AppUserUtil.userInfo = userInfo
    }

    fun onLogOut() {
        isLogged = false
        userInfo = null
    }
}