package pub.gll.onepeas.liblog


/**
 * 日志打印拓展类
 */
fun Any.a(tag: String? = null) {
    if (tag.isNullOrEmpty()) {
        tag ?: HiLog.a(this)
    } else {
        HiLog.at(tag, this)
    }
}

fun Any.e(tag: String? = null) {
    if (tag.isNullOrEmpty()) {
        tag ?: HiLog.e(this)
    } else {
        HiLog.et(tag, this)
    }
}

fun Any.w(tag: String? = null) {
    if (tag.isNullOrEmpty()) {
        tag ?: HiLog.w(this)
    } else {
        HiLog.wt(tag, this)
    }
}

fun Any.i(tag: String? = null) {
    if (tag.isNullOrEmpty()) {
        tag ?: HiLog.i(this)
    } else {
        HiLog.it(tag, this)
    }
}

fun Any.d(tag: String? = null) {
    if (tag.isNullOrEmpty()) {
        tag ?: HiLog.d(this)
    } else {
        HiLog.dt(tag, this)
    }
}

fun Any.v(tag: String? = null) {
    if (tag.isNullOrEmpty()) {
        tag ?: HiLog.v(this)
    } else {
        HiLog.vt(tag, this)
    }
}