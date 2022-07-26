package pub.gll.onepeas.libbase.di.http.interceptor

import pub.gll.onepeas.libbase.di.http.internal.WanBeanWrapper
import pub.gll.onepeas.libnet.GlobalNetworkResultInterceptor
import pub.gll.onepeas.libnet.NetworkResult
import pub.gll.onepeas.libnet.exception.MsgException
import pub.gll.onepeas.libnet.ext.toExceptionResult
import javax.inject.Inject

class ToDoGlobalNetworkResultInterceptor @Inject constructor() : GlobalNetworkResultInterceptor {

    override fun <T> onIntercept(networkResult: NetworkResult<T>): NetworkResult<T> {
        return if (
        //只有成功才转换
            networkResult is NetworkResult.Success &&
            //只转换这种类型的Bean
            networkResult.responseBody is WanBeanWrapper<*>
        ) {
            //类型强转
            val wanBeanWrapper = (networkResult.responseBody as WanBeanWrapper<*>)
            //如果不成功
            if (!wanBeanWrapper.isSuccessful()) {
                return MsgException(wanBeanWrapper.errorMsg).toExceptionResult()
            }
            networkResult
        } else {
            networkResult
        }
    }

}