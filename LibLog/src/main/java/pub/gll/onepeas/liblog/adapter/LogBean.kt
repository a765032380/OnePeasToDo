package pub.gll.onepeas.liblog.adapter

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
             $content
             """.trimIndent()
    }

    private fun getFlattened(): String {
        return format(timeMillis) + '|' + level + '|' + tag + "|:"
    }

    private fun format(timeMillis: Long): String {
        return sdf.format(timeMillis)
    }
}