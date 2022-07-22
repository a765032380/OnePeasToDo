package pub.gll.onepeas.lib.log.config

import pub.gll.onepeas.lib.log.formatter.HiStackTraceFormatter
import pub.gll.onepeas.lib.log.formatter.HiThreadFormatter
import pub.gll.onepeas.lib.log.printer.HiLogPrinter

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