package pub.gll.onepeas.todo

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import pub.gll.onepeas.libbase.BaseApp


/**
 * 1. 所有使用 Hilt 的 App 必须包含 一个使用 @HiltAndroidApp 注解的 Application
 * 2. @HiltAndroidApp 将会触发 Hilt 代码的生成，包括用作应用程序依赖项容器的基类
 * 3. 生成的 Hilt 组件依附于 Application 的生命周期，它也是 App 的父组件，提供其他组件访问的依赖
 * 4. 在 Application 中设置好 @HiltAndroidApp 之后，就可以使用 Hilt 提供的组件了，
 *    Hilt 提供的 @AndroidEntryPoint 注解用于提供 Android 类的依赖（Activity、Fragment、View、Service、BroadcastReceiver）等等
 *    Application 使用 @HiltAndroidApp 注解
 */
@HiltAndroidApp
class MyApp : BaseApp() {

    override fun onCreate() {
        super.onCreate()
        initModuleList(AppConfig.moduleApps)
    }
    /**
     * 这个方法主要在主工程调用，其他工程不要调用
     * 通过反射的方式获取到其他module的Application
     */
    private fun initModuleList(list: Array<String>){
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
    override fun initModuleApp(application: Application) {

    }

    override fun initModuleData(application: Application) {

    }
}