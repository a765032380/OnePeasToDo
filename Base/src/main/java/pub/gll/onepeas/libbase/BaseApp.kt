package pub.gll.onepeas.libbase

import android.app.Application
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.decode.SvgDecoder
import coil.decode.VideoFrameDecoder
import coil.disk.DiskCache
import coil.memory.MemoryCache
import coil.util.DebugLogger
import com.alibaba.android.arouter.launcher.ARouter
import com.tencent.smtt.sdk.QbSdk
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.HiLogManager
import pub.gll.onepeas.lib.log.printer.HiViewPrinter
import pub.gll.onepeas.libbase.di.http.DataStoreUtils
import pub.gll.onepeas.libbase.di.http.OkHttpBuild

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
            .components { //设置加载器
                // SVGs
                add(SvgDecoder.Factory())
                // Video frames
                add(VideoFrameDecoder.Factory())
            }
            .memoryCache {//设置内存缓存策略
                MemoryCache.Builder(this)
                    // Set the max size to 25% of the app's available memory.
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCache {//设置硬盘缓存策略
                DiskCache.Builder()
                    .directory(filesDir.resolve("image_cache"))
                    .maxSizeBytes(512L * 1024 * 1024) // 512MB
                    .build()
            }
            .okHttpClient {//设置网络加载器
                OkHttpBuild.okHttpClient
                // Don't limit concurrent network requests by host.
//                val dispatcher = Dispatcher().apply { maxRequestsPerHost = maxRequests }

                // Lazily create the OkHttpClient that is used for network operations.
//                OkHttpClient.Builder().run {
//                    connectTimeout(30000L, TimeUnit.MILLISECONDS)
//                    readTimeout(30000L, TimeUnit.MILLISECONDS)
//                    writeTimeout(30000L, TimeUnit.MILLISECONDS)
//                }
//                    .dispatcher(dispatcher)
//                    .addInterceptor {
//                        val request = it.request()
//                        val builder = request.newBuilder()
//                        builder.addHeader("Authorization" , "Basic YWRtaW46YWRtaW4=")
                        /**
                         * ETag: "1D8A4A3CCD030A10569EBA38CA40B893-125"
                         */
//                        builder.addHeader("Content-Type" , "image/jpeg")
//                        builder.addHeader("Server" , "AliyunOSS")
//                        builder.addHeader("Vary" , "Origin")
//                        builder.addHeader("x-oss-hash-crc64ecma" , "6231434286087683009")
//                        builder.addHeader("x-oss-hash-func" , "SHA-1")
//                        builder.addHeader("x-oss-hash-value" , "05A01F5353A930E4714C54F8BAEEB9F05493506B")
//                        builder.addHeader("x-oss-object-type" , "Multipart")
//                        builder.addHeader("x-oss-request-id" , "6302F8358B530133363A7B35")
//                        builder.addHeader("x-oss-storage-class" , "Standard")
//                        builder.addHeader("Accept" , "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
//                        builder.addHeader("Accept-Encoding" , "gzip, deflate, br")
//                        builder.addHeader("Accept-Language" , "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7")
//                        builder.addHeader("Host" , "bj29-enet.cn-beijing.data.alicloudccp.com")
//                        builder.addHeader("Referer" , "https://www.aliyundrive.com/")
//                        builder.addHeader("sec-ch-ua" , "\"Chromium\";v=\"104\", \" Not A;Brand\";v=\"99\", \"Google Chrome\";v=\"104\"")
//                        builder.addHeader("sec-ch-ua-mobile" , "?1")
//                        builder.addHeader("sec-ch-ua-platform" , "Android")
//                        builder.addHeader("Sec-Fetch-Dest" , "image")
//                        builder.addHeader("Sec-Fetch-Mode" , "no-cors")
//                        builder.addHeader("Sec-Fetch-Site" , "cross-site")
//                        builder.addHeader("User-Agent" , "Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Mobile Safari/537.36")
//                        it.proceed(builder.build())
//                    }
//                    .build()
            }
            //设置淡入淡出
            .crossfade(true)
            // 忽略网络缓存头，始终从/写入磁盘缓存。
            .respectCacheHeaders(false)
            //如果这是一个调试版本，启用标准Android日志记录。
            .apply { if (BuildConfig.DEBUG) logger(DebugLogger()) }
            .build()
    }
}