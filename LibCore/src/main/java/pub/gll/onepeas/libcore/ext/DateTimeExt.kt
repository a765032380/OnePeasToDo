package pub.gll.onepeas.libcore.ext

import pub.gll.onepeas.libcore.util.time.TimeConstants
import pub.gll.onepeas.libcore.util.time.TimeUtils
import java.text.SimpleDateFormat
import java.util.*


/**
 *  字符串日期格式（比如：2018-4-6)转为毫秒
 *  @param format 时间的格式，默认是按照yyyy-MM-dd HH:mm:ss来转换，如果您的格式不一样，则需要传入对应的格式
 */
fun String.toDateFormat(format: String = "yyyy-MM-dd HH:mm:ss") = SimpleDateFormat(format, Locale.getDefault()).parse(this)?.time


/**
 * Long类型时间戳转为字符串的日期格式
 * @param format 时间的格式，默认是按照yyyy-MM-dd HH:mm:ss来转换，如果您的格式不一样，则需要传入对应的格式
 */
fun Long.toDateFormat(format: String = "yyyy-MM-dd HH:mm:ss") = SimpleDateFormat(format, Locale.getDefault()).format(Date(this))

fun Int.toDateFormat(format: String = "yyyy-MM-dd HH:mm:ss") = SimpleDateFormat(format, Locale.getDefault()).format(Date(this.toLong()))


/**
 * Return the friendly time span by now.
 *
 * @param millis The milliseconds.
 * @return the friendly time span by now
 *
 *  * 如果小于 1 秒钟内，显示刚刚
 *  * 如果在 1 分钟内，显示 XXX秒前
 *  * 如果在 1 小时内，显示 XXX分钟前
 *  * 如果在 1 小时外的今天内，显示今天15:32
 *  * 如果是昨天的，显示昨天15:32
 *  * 其余显示，2016-10-15
 *  * 时间不合法的情况全部日期和时间信息，如星期六 十月 27 14:21:20 CST 2007
 *
 */
fun Long.getFriendlyTimeSpanByNow(): String? {
    val now = System.currentTimeMillis()
    val span = now - this
    if (TimeUtils.millis2String(
            TimeUtils.getNowMills(), "yyyy") != TimeUtils.millis2String(this, "yyyy") ) {
        // 不是同一年
        return TimeUtils.millis2String(
            TimeUtils.getNowMills(), "yyyy年MM月dd日")
    }
    if (span < 0) // U can read http://www.apihome.cn/api/java/Formatter.html to understand it.
//            return String.format("%tc", millis)
        return "刚刚"
    when {
        /*span < 1000 -> {
            return "刚刚"
        }*/
        span < TimeConstants.MIN -> {
            return "刚刚"
//                return String.format(Locale.getDefault(), "%d秒前", span / TimeConstants.SEC)
        }
        span < TimeConstants.HOUR -> {
            return String.format(Locale.getDefault(), "%d分钟前", span / TimeConstants.MIN)
        }
        // 获取当天 00:00
        else -> {
            val wee = getWeeOfToday()
            return when {
                this >= wee -> {
//                        String.format("今天%tR", millis)
                    String.format(Locale.getDefault(), "%d小时前", span / TimeConstants.HOUR)
                }
                /*millis >= wee - TimeConstants.DAY -> {
                    String.format("昨天%tR", millis)
                }*/
                else -> {
//                        String.format("%tF", millis)
                    TimeUtils.millis2String(this, "MM月dd日")
                }
            }
        }
    }
}

fun Long.getFriendlyTimeSpanByNow1(): String? {
    val now = System.currentTimeMillis()
    val span = now - this
    if (TimeUtils.millis2String(
            TimeUtils.getNowMills(), "yyyy") != TimeUtils.millis2String(this, "yyyy") ) {
        // 不是同一年
        return TimeUtils.millis2String(
            TimeUtils.getNowMills(), "7天以前")
    }
    if (span < 0) // U can read http://www.apihome.cn/api/java/Formatter.html to understand it.
//            return String.format("%tc", millis)
        return "1分钟前"
    when {
        /*span < 1000 -> {
            return "刚刚"
        }*/
        span < TimeConstants.MIN -> {
            return "1分钟前"
//                return String.format(Locale.getDefault(), "%d秒前", span / TimeConstants.SEC)
        }
//            span < TimeConstants.MIN * 6 -> {
//                return "${span/TimeConstants.MIN}分钟"
////                return String.format(Locale.getDefault(), "%d秒前", span / TimeConstants.SEC)
//            }
        span < TimeConstants.HOUR -> {
            return String.format(Locale.getDefault(), "%d分钟前", span / TimeConstants.MIN)
        }
        span < TimeConstants.DAY -> {
            return String.format(Locale.getDefault(), "%d小时前", span / TimeConstants.HOUR)
        }
        span < TimeConstants.DAY * 7 -> {
            return String.format(Locale.getDefault(), "%d天前", span / TimeConstants.DAY)
        }
        // 获取当天 00:00
        else -> {
            return "7天前"
            /*
            val wee = getWeeOfToday()
            return when {
                millis >= wee -> {
//                        String.format("今天%tR", millis)
                    String.format(Locale.getDefault(), "%d小时前", span / TimeConstants.HOUR)
                }
                *//*millis >= wee - TimeConstants.DAY -> {
                        String.format("昨天%tR", millis)
                    }*//*
                    else -> {
//                        String.format("%tF", millis)
                        TimeUtils.millis2String(millis, "MM月dd日")
                    }
                }*/
        }
    }
}

fun Long?.getSayHelloDateFormat(): String {
    this?:return ""
    var millis = this * 1000
    val now = System.currentTimeMillis()
    val span: Long = now - millis
    if (span < 0)
        return String.format("%tc", millis)
    return when {
        span < TimeConstants.MIN -> {
            "${span / TimeConstants.SEC}秒前"
        }
        span <= TimeConstants.HOUR -> {
            "${span / TimeConstants.MIN}分钟前"
        }

        span <= TimeConstants.DAY -> {
            "${span / TimeConstants.HOUR}小时前"
        }

        span <= TimeConstants.DAY * 365->{
            (this).toDateFormat("MM-dd HH:mm")
        }

        else -> {
            (this).toDateFormat("YY-MM-dd HH:mm")
        }
    }

}

private fun getWeeOfToday(): Long {
    val cal = Calendar.getInstance()
    cal[Calendar.HOUR_OF_DAY] = 0
    cal[Calendar.SECOND] = 0
    cal[Calendar.MINUTE] = 0
    cal[Calendar.MILLISECOND] = 0
    return cal.timeInMillis
}