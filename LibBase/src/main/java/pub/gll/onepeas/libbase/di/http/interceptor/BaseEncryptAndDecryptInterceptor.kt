package pub.gll.onepeas.libbase.di.http.interceptor

import okhttp3.Interceptor
import okhttp3.RequestBody
import okhttp3.Response
import java.io.IOException

/**
 * 加解密拦截器基类
 */
abstract class BaseEncryptAndDecryptInterceptor : Interceptor{

    final override fun intercept(chain: Interceptor.Chain): Response {
        val originRequest = chain.request()
        return decryptResponse(chain.proceed(
            originRequest.body.run {
                //如果body为空，则直接往下传
                if (this == null) {
                    originRequest
                }
                //如果body不为空，则解密
                else {
                    originRequest.newBuilder().apply {
                        method(
                            originRequest.method,
                            encrypt(this@run)
                        )
                    }.build()
                }
            }
        ))
    }

    //加密参数
    @Throws(IOException::class)
    abstract fun encrypt(requestBody: RequestBody): RequestBody

    //解密响应报文
    @Throws(IOException::class)
    abstract fun decryptResponse(response: Response): Response

}

//override fun encrypt(requestBody: RequestBody): RequestBody {
//    return requestBody.string()//1.转成String
//        .encrypt()//2.加密
//        .toRequestBody(requestBody.contentType())//3.转成requestBody，保留原来的contentType
//}
//
//override fun decryptResponse(response: Response): Response {
//    //如果不成功则不尝试解密
//    if (!response.isSuccessful) {
//        return response
//    }
//    val responseBody = response.body ?: return response
//    return response.newBuilder()
//        .body(responseBody.encrypt())
//        .build()
//}