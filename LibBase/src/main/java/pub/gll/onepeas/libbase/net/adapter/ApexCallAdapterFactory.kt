package pub.gll.onepeas.libbase.net.adapter

import pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor
import pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor.DefaultGlobalNetworkResultInterceptor
import pub.gll.onepeas.libbase.net.NetworkResult
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Retrofit
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import javax.inject.Inject

class ApexCallAdapterFactory @Inject constructor(
    private val interceptor: GlobalNetworkResultInterceptor
) : CallAdapter.Factory() {

    override fun get(
        returnType: Type,
        annotations: Array<out Annotation>,
        retrofit: Retrofit
    ): ApexCallAdapter? = when (getRawType(returnType)) {
        Call::class.java -> {
            val callType = getParameterUpperBound(0, returnType as ParameterizedType)
            when (getRawType(callType)) {
                NetworkResult::class.java -> {
                    val resultType = getParameterUpperBound(0, callType as ParameterizedType)
                    ApexCallAdapter(resultType, interceptor)
                }
                else -> null
            }
        }
        else -> null
    }

    companion object {

        fun create(
            interceptor: GlobalNetworkResultInterceptor = DefaultGlobalNetworkResultInterceptor
        ): ApexCallAdapterFactory = ApexCallAdapterFactory(interceptor)

    }

}