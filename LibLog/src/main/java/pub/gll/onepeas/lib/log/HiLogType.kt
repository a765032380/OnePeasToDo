package pub.gll.onepeas.lib.log

import android.util.Log
import androidx.annotation.IntDef

object HiLogType {
    const val V = Log.VERBOSE
    const val D = Log.DEBUG
    const val I = Log.INFO
    const val W = Log.WARN
    const val E = Log.ERROR
    const val A = Log.ASSERT

    @IntDef(V, D, I, W, E, A)
    @Retention(AnnotationRetention.SOURCE)
    annotation class TYPE
}