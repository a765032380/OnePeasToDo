package pub.gll.onepeas.libbase

import android.app.Application
import android.content.Context
import pub.gll.onepeas.liblog.config.HiLogConfig
import pub.gll.onepeas.liblog.HiLogManager
import pub.gll.onepeas.liblog.printer.HiViewPrinter

/**
 * 基础的Application
 */
abstract class BaseApp:Application(),IApp{


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
        HiLogManager.init(HiLogConfig(), this,HiViewPrinter())
    }


    /**
     * 这个方法主要在主工程调用，其他工程不要调用
     * 通过反射的方式获取到其他module的Application
     */
    fun initModuleList(list: Array<String>){
        list.forEach {
            try {
                val clazz = Class.forName(it)
                val baseApp: BaseApp = clazz.newInstance() as BaseApp
                baseApp.initModuleApp(this)
                baseApp.initModuleData(this)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InstantiationException) {
                e.printStackTrace()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
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

    override fun getAppContext(): Context {
        return this
    }
}