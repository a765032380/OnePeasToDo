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
        builder.addHeader("Authorization" , "Basic YWRtaW46YWRtaW4=")

        builder.addHeader("User-Agent" , "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Mobile Safari/537.36")
        return chain.proceed(builder.build())
    }
}