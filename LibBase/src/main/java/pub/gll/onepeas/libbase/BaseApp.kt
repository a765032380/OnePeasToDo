package pub.gll.onepeas.libbase

import android.app.Application
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.HiLogManager
import pub.gll.onepeas.lib.log.printer.HiViewPrinter

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
//        initLog()
        initModuleApp(this)
        initModuleData(this)
    }
    private fun initLog(){
        HiLogManager.init(HiLogConfig(), this, HiViewPrinter())
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