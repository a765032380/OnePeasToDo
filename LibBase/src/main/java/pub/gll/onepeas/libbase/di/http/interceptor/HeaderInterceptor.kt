package pub.gll.onepeas.libbase.di.http.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import pub.gll.onepeas.libbase.util.AppUserUtil

class HeaderInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val builder = request.newBuilder()
        AppUserUtil.userInfo?.id?.let {
            builder.addHeader("uuid", it)
        }
        return chain.proceed(builder.build())
    }
}