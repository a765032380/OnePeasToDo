package pub.gll.onepeas.module.esp8266.init

import android.content.Context
import androidx.startup.Initializer
import pub.gll.onepeas.lib.log.HiLog

class Esp8266Initializer:Initializer<Unit> {
    override fun create(context: Context) {
        HiLog.e("Esp8266Module init" )
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}