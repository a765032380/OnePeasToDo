package pub.gll.onepeas.libbase

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.tencent.smtt.sdk.QbSdk
import dagger.hilt.android.HiltAndroidApp
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.HiLogManager
import pub.gll.onepeas.lib.log.printer.HiViewPrinter
import pub.gll.onepeas.libbase.di.http.DataStoreUtils

/**
 * 基础的Application
 */
abstract class BaseApp:Application(){

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