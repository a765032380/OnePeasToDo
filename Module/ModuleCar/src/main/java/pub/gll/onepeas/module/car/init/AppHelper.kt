package pub.gll.onepeas.module.car.init

import android.content.Context
import android.net.ConnectivityManager

object AppHelper {
    lateinit var mContext: Context
    fun init(context: Context){
        mContext = context
    }
}
fun Context.isConnectedNetwork():Boolean = run {
    val cm = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork = cm.activeNetworkInfo
    activeNetwork?.isConnectedOrConnecting == true
}