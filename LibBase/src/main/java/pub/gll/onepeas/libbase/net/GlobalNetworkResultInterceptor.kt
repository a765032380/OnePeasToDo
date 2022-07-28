package pub.gll.onepeas.libbase.net

interface GlobalNetworkResultInterceptor {

    /**
     * 拦截网络请求，
     */
    fun <T> onIntercept(networkResult: NetworkResult<T>): NetworkResult<T> {
        return networkResult
    }

    //默认实现
    object DefaultGlobalNetworkResultInterceptor : GlobalNetworkResultInterceptor

}