package pub.gll.onepeas.todo

import android.app.Application
import com.tencent.smtt.sdk.QbSdk
import dagger.hilt.android.HiltAndroidApp
import pub.gll.onepeas.libbase.BaseApp
import pub.gll.onepeas.todo.data.DataStoreUtils

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
        DataStoreUtils.init(this)
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
//        initModuleList(AppConfig.moduleApps)
    }

    override fun initModuleApp(application: Application) {

    }

    override fun initModuleData(application: Application) {

    }
}