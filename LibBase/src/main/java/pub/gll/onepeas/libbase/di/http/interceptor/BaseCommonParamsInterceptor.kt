package pub.gll.onepeas.libbase.di.http.interceptor

import okhttp3.Interceptor
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import okio.Buffer
import org.json.JSONObject
import pub.gll.onepeas.libcore.util.toJson

/**
 * 公参基类，重写方法来增加公参
 */
abstract class BaseCommonParamsInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originRequest = chain.request()
        //1.body转成json，如果body为空则构建空json，只填充公参
        val jsonBody = (originRequest.body?.toJson() ?: JSONObject()).apply {
            //2.添加公参
//            addCommonParams()
        }
        //3.构建新的requestBody,传递给下一个拦截器
        return chain.proceed(originRequest.newBuilder().apply {
            method(
                originRequest.method,
                jsonBody.toString().toRequestBody(originRequest.body?.contentType())
            )
        }.build())
    }

    //公参
    protected abstract fun getCommonParams(): Map<String, String>

    //给JSON添加参数
    private fun JSONObject.addCommonParams() {
        getCommonParams().forEach { entry ->
            put(entry.key, entry.value)
        }
    }

}

//将RequestBody中的字节流转成字符串
fun RequestBody.string(): String {
    val buffer = Buffer()
    writeTo(buffer)
    return buffer.readUtf8()
}