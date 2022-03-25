package pub.gll.onepeas.liblog.config

import pub.gll.onepeas.liblog.formatter.HiStackTraceFormatter
import pub.gll.onepeas.liblog.formatter.HiThreadFormatter
import pub.gll.onepeas.liblog.printer.HiLogPrinter

class HiLogConfig {
    companion object {
        var MAX_LEN = 512
        var HI_THREAD_FORMATTER = HiThreadFormatter()
        var HI_STACK_TRACE_FORMATTER = HiStackTraceFormatter()
    }

    fun injectJsonParser(): JsonParser? {
        return null
    }

    fun getGlobalTag(): String {
        return "HiLog"
    }

    fun enable(): Boolean {
        return true
    }

    fun includeThread(): Boolean {
        return false
    }

    fun stackTraceDepth(): Int {
        return 0
    }

    fun printers(): Array<HiLogPrinter>? {
        return null
    }

    interface JsonParser {
        fun toJson(src: Any?): String?
    }
}