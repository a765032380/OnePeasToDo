package pub.gll.onepeas.libbase.di.http.internal

/**
 * 带壳的相应bean
 * @param T data实体类
 * @property data T 报文中对应data的部分
 * @property errorCode Int 报文中对应errorCode的部分
 * @property errorMsg String 报文中对应errorMsg的部分
 * @constructor
 */
data class WanBeanWrapper<T>(
    val data: T,
    val errorCode: Int = -1,
    val errorMsg: String = ""
) {

    companion object {
        const val SUCCESS_CODE = 0
        const val LOGIN_ERROR_CODE = -1001
    }

    /**
     * 请求是否成功
     * @return Boolean true:成功
     */
    fun isSuccessful(): Boolean {
        return errorCode == SUCCESS_CODE
    }

    /**
     * 登陆失败
     * @return Boolean true:登陆失败
     */
    fun isLoginError(): Boolean {
        return errorCode == LOGIN_ERROR_CODE
    }

}