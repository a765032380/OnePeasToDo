package pub.gll.onepeas.libbase.di.http

import retrofit2.Response

sealed class NetworkResult<T> {

    /**
     * 网络请求成功
     */
    class Success<T>(private val response: Response<T>) : NetworkResult<T>(){}

    /**
     * 网络请求失败
     */
    sealed class Failure<T> : NetworkResult<T>() {
        /**
         * 服务器内部错误
         */
        data class ServerError<T>(private val response: Response<T>) : Failure<T>() {}

        /**
         * 网络请求出现异常
         */
        data class Exception<T> constructor(
            val exception: Throwable
        ) : Failure<T>() {}
    }
}
