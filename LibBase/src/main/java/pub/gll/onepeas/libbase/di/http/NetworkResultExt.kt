package pub.gll.onepeas.libbase.di.http

/**
 * 网络请求成功时操作
 */
inline fun <reified T> NetworkResult<T>.ifSuccess(action: (NetworkResult.Success<T>) -> Unit): NetworkResult<T> {
    if (this is NetworkResult.Success) action(this)
    return this
}

/**
 * 网络请求中，服务器已响应但HTTP协议出现错误时（例如404，502）操作
 */
inline fun <reified T> NetworkResult<T>.ifServerError(action: (NetworkResult.Failure.ServerError<T>) -> Unit): NetworkResult<T> {
    if (this is NetworkResult.Failure.ServerError) action(this)
    return this
}

/**
 * 网络请求中，出现异常时（例如解析JSON异常，超时异常，连接网络失败异常等）操作
 */
inline fun <reified T> NetworkResult<T>.ifException(action: (NetworkResult.Failure.Exception<T>) -> Unit): NetworkResult<T> {
    if (this is NetworkResult.Failure.Exception) action(this)
    return this
}

/**
 * 网络请求失败（包括[ifServerError]和[ifException]两种情况）
 */
inline fun <reified T> NetworkResult<T>.ifFailure(action: (errorMsg: String) -> Unit): NetworkResult<T> {
    ifServerError {
        //errorBodyString()方法在下篇文章中会提到
//        action(it.errorBodyString())
    }.ifException {
        //exceptionMessage()方法在下篇文章中会提到
//        action(it.exceptionMessage())
    }
    return this
}
