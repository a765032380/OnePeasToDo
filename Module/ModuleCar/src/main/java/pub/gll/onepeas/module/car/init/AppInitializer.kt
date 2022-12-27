package pub.gll.onepeas.module.car.init

import android.content.Context
import androidx.startup.Initializer
import pub.gll.onepeas.lib.log.HiLog

class AppInitializer:Initializer<Unit> {
    override fun create(context: Context) {
        AppHelper.init(context)
        HiLog.e("CarModule init" )
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}