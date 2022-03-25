package pub.gll.onepeas.liblog.printer

import android.util.Log
import pub.gll.onepeas.liblog.config.HiLogConfig
import pub.gll.onepeas.liblog.config.HiLogConfig.Companion.MAX_LEN
import java.lang.StringBuilder

/**
 * 控制台打印，内置模块内部，不需要由外部添加
 */
internal class HiConsolePrinter : HiLogPrinter {
    override fun print(config: HiLogConfig, level: Int, tag: String, content: String) {
        val len = content.length
        val countOfSub: Int = len / MAX_LEN
        if (countOfSub > 0) {
            val log = StringBuilder()
            var index = 0
            for (i in 0 until countOfSub) {
                log.append(content.substring(index, index + MAX_LEN))
                index += MAX_LEN
            }
            if (index != len) {
                log.append(content.substring(index, len))
            }
            Log.println(level, tag, log.toString())
        } else {
            Log.println(level, tag, content)
        }
    }
}