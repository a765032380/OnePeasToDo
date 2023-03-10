package pub.gll.onepeas.lib.log.adapter

import java.text.SimpleDateFormat
import java.util.*

data class LogBean(
    val level: Int,
    val tag: String,
    var timeMillis: Long = 0,
    val content: String
) {
    private val sdf: SimpleDateFormat = SimpleDateFormat("yy-MM-dd HH:mm:ss", Locale.CHINA)


    fun flattenedLog(): String {
        return """
             ${getFlattened()}
             """.trimIndent()
    }

    private fun getFlattened(): String {
        return format(timeMillis) + '|' + level + '|' + tag + "|: $content"
    }

    private fun format(timeMillis: Long): String {
        return sdf.format(timeMillis)
    }
}