package pub.gll.onepeas.libbase.net.adapter

import pub.gll.onepeas.libbase.net.GlobalNetworkResultInterceptor
import pub.gll.onepeas.libbase.net.NetworkResult
import pub.gll.onepeas.libbase.net.ext.toExceptionResult
import pub.gll.onepeas.libbase.net.ext.toNetworkResult
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

internal class ApexResponseCallDelegate<T>(
    private val proxyCall: Call<T>,
    private val interceptor: GlobalNetworkResultInterceptor
) :
    Call<NetworkResult<T>> {

    override fun enqueue(callback: Callback<NetworkResult<T>>) =
        proxyCall.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                callback.onResponse(
                    this@ApexResponseCallDelegate,
                    Response.success(
                        response.toNetworkResult(interceptor)
                    )
                )
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                callback.onResponse(
                    this@ApexResponseCallDelegate,
                    Response.success(t.toExceptionResult())
                )
            }

        })

    override fun isExecuted(): Boolean = proxyCall.isExecuted

    override fun cancel() = proxyCall.cancel()

    override fun isCanceled(): Boolean = proxyCall.isCanceled

    override fun request(): Request = proxyCall.request()

    override fun timeout(): Timeout = proxyCall.timeout()

    override fun clone(): Call<NetworkResult<T>> =
        ApexResponseCallDelegate(proxyCall.clone(), interceptor)

    override fun execute(): Response<NetworkResult<T>> = throw NotImplementedError()


}