package pub.gll.onepeas.libbase

import android.app.Application
import android.os.Build
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.decode.SvgDecoder
import coil.decode.VideoFrameDecoder
import coil.disk.DiskCache
import coil.memory.MemoryCache
import coil.util.DebugLogger
import com.alibaba.android.arouter.launcher.ARouter
import com.tencent.smtt.sdk.QbSdk
import dagger.hilt.android.HiltAndroidApp
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.HiLogManager
import pub.gll.onepeas.lib.log.printer.HiViewPrinter
import pub.gll.onepeas.libbase.di.http.DataStoreUtils
import pub.gll.onepeas.libbase.di.http.OkHttpBuild
import pub.gll.onepeas.libbase.di.http.TrustAllCerts
import pub.gll.onepeas.libbase.di.http.TrustAllNameVerifier
import pub.gll.onepeas.libbase.util.AppUserUtil
import java.util.concurrent.TimeUnit

/**
 * 基础的Application
 */
abstract class BaseApp:Application(), ImageLoaderFactory {

    companion object {
        lateinit var instance: BaseApp
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        if (BuildConfig.DEBUG) {
            ARouter.openDebug()
        }
        ARouter.init(this)
        DataStoreUtils.init(this)
//        initLog()
        initWebView()
        initModuleApp(this)
        initModuleData(this)
    }
    private fun initLog(){
        HiLogManager.init(HiLogConfig(), this, HiViewPrinter())
    }
    private fun initWebView(){
        QbSdk.initX5Environment(this, object : QbSdk.PreInitCallback {

            override fun onCoreInitFinished() {
                // 内核初始化完成，可能为系统内核，也可能为系统内核
            }

            /**
             * 预初始化结束
             * 由于X5内核体积较大，需要依赖网络动态下发，所以当内核不存在的时候，默认会回调false，此时将会使用系统内核代替
             * @param isX5 是否使用X5内核
             */
            override fun onViewInitFinished(p0: Boolean) {
            }
        })
        QbSdk.setDownloadWithoutWifi(true)
    }
    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .components {
                // SVGs
                add(SvgDecoder.Factory())
                // Video frames
                add(VideoFrameDecoder.Factory())
            }
            .memoryCache {
                MemoryCache.Builder(this)
                    // Set the max size to 25% of the app's available memory.
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCache {
                DiskCache.Builder()
                    .directory(filesDir.resolve("image_cache"))
                    .maxSizeBytes(512L * 1024 * 1024) // 512MB
                    .build()
            }
            .okHttpClient {
                // Don't limit concurrent network requests by host.
                val dispatcher = Dispatcher().apply { maxRequestsPerHost = maxRequests }

                // Lazily create the OkHttpClient that is used for network operations.
                OkHttpClient.Builder().run {
                    connectTimeout(300000L, TimeUnit.MILLISECONDS)
                    readTimeout(300000L, TimeUnit.MILLISECONDS)
                    writeTimeout(300000L, TimeUnit.MILLISECONDS)
                }
                    .dispatcher(dispatcher)
//                    .sslSocketFactory(OkHttpBuild.createSSLSocketFactory(), TrustAllCerts())
                    .hostnameVerifier(TrustAllNameVerifier())
                    .addInterceptor {
                        val request = it.request()
                        val builder = request.newBuilder()
                        builder.addHeader("Authorization" , "Basic YWRtaW46YWRtaW4=")
                        it.proceed(builder.build())
                    }
                    .build()
            }
            // Show a short crossfade when loading images asynchronously.
            .crossfade(true)
            // Ignore the network cache headers and always read from/write to the disk cache.
            .respectCacheHeaders(false)
            // Enable logging to the standard Android log if this is a debug build.
            .apply { if (BuildConfig.DEBUG) logger(DebugLogger()) }
            .build()
    }
    /**
     * 当前 Application 初始化完成
     *
     * @param application 上下文
     */
    abstract fun initModuleApp(application: Application)

    /**
     * 所有 Application 都初始化完成后的自定义操作
     *
     * @param application 上下文
     */
    abstract fun initModuleData(application: Application)
}