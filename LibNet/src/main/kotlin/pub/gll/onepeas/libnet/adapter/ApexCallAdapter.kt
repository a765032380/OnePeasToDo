package pub.gll.onepeas.libnet.adapter

import pub.gll.onepeas.libnet.GlobalNetworkResultInterceptor
import pub.gll.onepeas.libnet.NetworkResult
import retrofit2.Call
import retrofit2.CallAdapter
import java.lang.reflect.Type

class ApexCallAdapter constructor(
    private val resultType: Type,
    private val interceptor: GlobalNetworkResultInterceptor
) : CallAdapter<Type, Call<NetworkResult<Type>>> {
    override fun responseType() = resultType

    override fun adapt(call: Call<Type>): Call<NetworkResult<Type>> =
        ApexResponseCallDelegate(call, interceptor)

}