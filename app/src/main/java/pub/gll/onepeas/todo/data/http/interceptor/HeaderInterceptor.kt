package pub.gll.onepeas.todo.data.http.interceptor

import okhttp3.Interceptor
import okhttp3.Response
import pub.gll.onepeas.todo.AppConfig
import pub.gll.onepeas.todo.data.DataStoreUtils
import pub.gll.onepeas.todo.util.AppUserUtil

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