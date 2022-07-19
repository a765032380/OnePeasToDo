package pub.gll.onepeas.libbase.di.http

import android.annotation.SuppressLint
import okhttp3.OkHttpClient
import pub.gll.onepeas.libbase.di.http.interceptor.CacheCookieInterceptor
import pub.gll.onepeas.libbase.di.http.interceptor.HeaderInterceptor
import pub.gll.onepeas.libbase.di.http.interceptor.LogInterceptor
import pub.gll.onepeas.libbase.di.http.interceptor.SetCookieInterceptor
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.*

/**
 * Created by Superman. 19/5/27
 */
object OkHttpBuild {

    /**
     * 请求超时时间
     */
    private const val DEFAULT_TIMEOUT = 30000

    //手动创建一个OkHttpClient并设置超时时间
    val okHttpClient: OkHttpClient
        get() {
            return OkHttpClient.Builder().run {
                connectTimeout(DEFAULT_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
                readTimeout(DEFAULT_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
                writeTimeout(DEFAULT_TIMEOUT.toLong(), TimeUnit.MILLISECONDS)
                addInterceptor(SetCookieInterceptor())
                addInterceptor(CacheCookieInterceptor())
                addInterceptor(LogInterceptor())
                addInterceptor(HeaderInterceptor())
                //不验证证书
//                sslSocketFactory(createSSLSocketFactory())
                hostnameVerifier(TrustAllNameVerifier())
                build()
            }
        }

    private fun createSSLSocketFactory(): SSLSocketFactory {
        lateinit var ssfFactory: SSLSocketFactory
        try {
            val sslFactory = SSLContext.getInstance("TLS")
            sslFactory.init(null,  arrayOf(TrustAllCerts()), SecureRandom());
            ssfFactory = sslFactory.socketFactory
        } catch (e: Exception) {
            print("SSL错误：${e.message}")
        }
        return ssfFactory
    }

}

class TrustAllNameVerifier: HostnameVerifier {
    @SuppressLint("BadHostnameVerifier")
    override fun verify(hostname: String?, session: SSLSession?): Boolean = true
}

@SuppressLint("CustomX509TrustManager")
class TrustAllCerts : X509TrustManager {

    @SuppressLint("TrustAllX509TrustManager")
    override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {}

    @SuppressLint("TrustAllX509TrustManager")
    override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {}

    override fun getAcceptedIssuers(): Array<X509Certificate> = arrayOf()
}
