package pub.gll.onepeas.libui.di

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@Module
@InstallIn(ActivityComponent::class)
object Module {

    @Provides
    fun provideLifecycleObserver(
    ): LifecycleObserver {
        return object : DefaultLifecycleObserver {

            override fun onCreate(owner: LifecycleOwner) {
//                logger.log("${owner.javaClass.simpleName}[${owner.hashCode()}] onCreate")
            }

            override fun onStart(owner: LifecycleOwner) {
//                logger.log("${owner.javaClass.simpleName}[${owner.hashCode()}] onStart")
            }

            override fun onResume(owner: LifecycleOwner) {
//                logger.log("${owner.javaClass.simpleName}[${owner.hashCode()}] onResume")
            }

            override fun onPause(owner: LifecycleOwner) {
//                logger.log("${owner.javaClass.simpleName}[${owner.hashCode()}] onPause")
            }

            override fun onStop(owner: LifecycleOwner) {
//                logger.log("${owner.javaClass.simpleName}[${owner.hashCode()}] onStop")
            }

            override fun onDestroy(owner: LifecycleOwner) {
//                logger.log("${owner.javaClass.simpleName}[${owner.hashCode()}] onDestroy")
            }

        }
    }

//    @Provides
//    @ActivityScoped
//    fun provideLifecycleLogger(): Logger {
//        return object : Logger {
//            override fun log(message: String) {
//                Log.d("生命周期记录器", message)
//            }
//        }
//    }

}