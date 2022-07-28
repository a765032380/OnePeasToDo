package pub.gll.onepeas.libbase.util

import android.content.Context
import android.net.ConnectivityManager
import java.net.InetAddress
import java.net.NetworkInterface
import java.net.SocketException
import java.util.*

/**
 * 网络状态
 */

object NetCheckUtil {

    fun checkNet(context: Context): Boolean {
        // 判断是否具有可以用于通信渠道
        val mobileConnection = isMobileConnection(context)
        val wifiConnection = isWIFIConnection(context)
        return !(!mobileConnection && !wifiConnection)
    }

    /**
     * 判断手机接入点（APN）是否处于可以使用的状态
     *
     * @param context
     * @return
     */
    private fun isMobileConnection(context: Context): Boolean {
        val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = manager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
        return networkInfo != null && networkInfo.isConnected
    }

    /**
     * 判断当前wifi是否是处于可以使用状态
     *
     * @param context
     * @return
     */
    private fun isWIFIConnection(context: Context): Boolean {
        val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = manager.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
        return networkInfo != null && networkInfo.isConnected
    }

    /**
     * 获取本地IP地址
     *
     * @return
     */
    fun getLocalIpAddress(): String? {
        try {
            var ipv4: String? = ""
            val nilist: List<NetworkInterface> =
                Collections.list(NetworkInterface.getNetworkInterfaces())
            for (ni in nilist) {
                val ialist: List<InetAddress> = Collections.list(ni.inetAddresses)
                for (address in ialist) {
                    if (!address.isLoopbackAddress &&
                        isIPv4Address(address.hostAddress.also { ipv4 = it })
                    ) {
                        return ipv4
                    }
                }
            }
        } catch (ex: SocketException) {
            ex.printStackTrace()
        }
        return null
    }
    fun isIPv4Address(ip: String): Boolean {
        return ip.contains(".") && ip.split(".").let { nums -> nums.size == 4 && nums.any { num -> num.length <= 3 } }
    }
}

