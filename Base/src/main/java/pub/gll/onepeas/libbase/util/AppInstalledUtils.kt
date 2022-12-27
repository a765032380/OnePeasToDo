package pub.gll.onepeas.libbase.util

import android.content.Context
import android.content.Intent
import android.net.Uri

object AppInstalledUtils {
    /**
     * 检测是否安装支付宝
     * @param context
     * @return
     */
    fun isAliPayInstalled(context: Context): Boolean {
        val uri = Uri.parse("alipays://platformapi/startApp")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        val componentName = intent.resolveActivity(context.packageManager)
        return componentName != null
    }
}