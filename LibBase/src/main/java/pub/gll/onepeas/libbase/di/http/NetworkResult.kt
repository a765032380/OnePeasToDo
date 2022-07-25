package pub.gll.onepeas.libbase.di.http

import okhttp3.Headers
import retrofit2.Response

sealed class NetworkResult<T> {

    /**
     * 网络请求成功
     */
    class Success<T>(private val response: Response<T>) : NetworkResult<T>(),ResponseGetter{
        val responseBody by lazy { response.body()!! }
        override val code by lazy { response.code() }
        override val headers: Headers by lazy { response.headers() }
    }

    /**
     * 网络请求失败
     */
    sealed class Failure<T> : NetworkResult<T>() {
        /**
         * 服务器内部错误
         */
        data class ServerError<T>(private val response: Response<T>): Failure<T>() , ResponseGetter {
            val responseErrorMessage: String by lazy { response.errorBody()?.string().orEmpty() }
            override val code by lazy { response.code() }
            override val headers: Headers by lazy { response.headers() }
        }

        /**
         * 网络请求出现异常
         */
        data class Exception<T> constructor(
            val exception: Throwable
        ) : Failure<T>() {
            val exceptionMessage:String by lazy {
                //TODO 下文讲解
                exception.message?:""
            }
        }
    }
}
