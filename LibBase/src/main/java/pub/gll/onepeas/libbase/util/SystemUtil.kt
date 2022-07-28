package pub.gll.onepeas.libbase.util

import android.annotation.SuppressLint
import android.content.Context
import android.content.Context.VIBRATOR_SERVICE
import android.os.Vibrator


/**
 * ================================================================
 * 创建时间：2/24/21
 * 创建人：gll_android
 * 邮件：gll_android@163.com
 * 文件描述：
 * 至尊宝：长夜漫漫无心睡眠，我以为只有我睡不着，原来晶晶姑娘你也睡不着 ！
 * ================================================================
 */
object SystemUtil {

    fun vibrator(context:Context){
        // 震动效果的系统服务
        val vibrator = context.applicationContext.getSystemService(VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(500);//振动500毫秒
        // 下边是可以使震动有规律的震动  -1：表示不重复 0：循环的震动
//        val pattern = longArrayOf(200, 2000, 2000, 200, 200, 200)
//        vibrator.vibrate(pattern, -1)
        
    }
}