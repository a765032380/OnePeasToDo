package pub.gll.onepeas.libcore.ext

import pub.gll.onepeas.libcore.util.time.TimeConstants
import pub.gll.onepeas.libcore.util.time.TimeUtils


/**
 * 过千为k
 * 过万为w
 * 小数点后[digit]位小数
 */
fun Long.numToLetterFormat(digit: Int = 1): String {
    return when(this) {
        in 1000 until  10000-> {
            "${(this / 1000.0).keepDecimal(digit)}k"
        }
        in 10000 ..Int.MAX_VALUE -> {
            "${(this / 10000.0).keepDecimal(digit)}w"
        }

        else -> {
            this.toString()
        }
    }
}

/**
 * 过千为k
 * 过万为w
 * 小数点后[digit]位小数
 */
fun Int.numToLetterFormat(digit: Int): String {
    return this.toLong().numToLetterFormat(digit)
}

/**
 * 保留两位小数格式化
 */
fun Double.keep2Decimal(): String {
    return String.format("%.2f", this)
}

/**
 * 保留一位小数格式化
 */
fun Double.keep1Decimal(): String {
    return String.format("%.1f", this)
}

/**
 * 保留[digit]位小数格式化
 */
fun Double.keepDecimal(digit: Int): String {
    return String.format("%.${digit}f", this)
}


/**
 * 保留两位小数格式化
 */
fun Float.keep2Decimal(): String {
    return String.format("%.2f", this)
}

/**
 * 保留一位小数格式化
 */
fun Float.keep1Decimal(): String {
    return String.format("%.1f", this)
}

/**
 * 保留[digit]位小数格式化
 */
fun Float.keepDecimal(digit: Int): String {
    return String.format("%.${digit}f", this)
}


/**
 * 距离格式化包装扩展方法
 */
fun Long.distanceWrap(): String {
    return when {
        this <= 100 -> {
            "<0.1km"
        }
        else -> {
            val r = this / 1000.0
            val keep1Decimal = r.keep1Decimal()
            "${keep1Decimal}km"
        }
    }
}/**
 * 距离格式化包装扩展方法
 */
fun Long.distanceWrap1(): String {
    return when {
        this < 50 -> {
            "0km"
        }
        this <= 100 -> {
            "<0.1km"
        }
        else -> {
            val r = this / 1000.0
            val keep1Decimal = r.keep1Decimal()
            "${keep1Decimal}km"
        }
    }
}
fun Long.getTimeStr(): String {
    return when {
        TimeUtils.isToday(this) -> {
            // 今天
            TimeUtils.millis2String(this, "HH:mm")
        }
        TimeUtils.isToday(this - TimeConstants.DAY) -> {
            // 明天
            "明天 " + TimeUtils.millis2String(this.toLong(), "HH:mm")
        }
        else -> {
            TimeUtils.millis2String(this, "MM-dd HH:mm")
        }
    }
}