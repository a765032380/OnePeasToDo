package pub.gll.onepeas.lib.log

import pub.gll.onepeas.lib.log.HiLogType.TYPE
import pub.gll.onepeas.lib.log.util.HiStackTraceUtil.getCroppedRealStackTrack
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.printer.HiLogPrinter


object HiLog {

    private val HI_LOG_PACKAGE: String =
        HiLog::class.java.name.substring(0, HiLog::class.java.name.lastIndexOf('.') + 1)

    fun v(vararg contents: Any) {
        log(HiLogType.V, *contents)
    }

    fun vt(tag: String, vararg contents: Any) {
        log(HiLogType.V, tag, *contents)
    }

    fun d(vararg contents: Any) {
        log(HiLogType.D, *contents)
    }

    fun dt(tag: String, vararg contents: Any) {
        log(HiLogType.D, tag, *contents)
    }

    fun i(vararg contents: Any) {
        log(HiLogType.I, *contents)
    }

    fun it(tag: String, vararg contents: Any) {
        log(HiLogType.I, tag, *contents)
    }

    fun w(vararg contents: Any) {
        log(HiLogType.W, *contents)
    }

    fun wt(tag: String, vararg contents: Any) {
        log(HiLogType.W, tag, *contents)
    }

    fun e(vararg contents: Any) {
        log(HiLogType.E, *contents)
    }

    fun et(tag: String, vararg contents: Any) {
        log(HiLogType.E, tag, *contents)
    }

    fun a(vararg contents: Any) {
        log(HiLogType.A, *contents)
    }

    fun at(tag: String, vararg contents: Any) {
        log(HiLogType.A, tag, *contents)
    }

    fun log(@TYPE type: Int, vararg contents: Any) {
        log(type, HiLogManager.getConfig().getGlobalTag(), *contents)
    }

    fun log(@TYPE type: Int, tag: String, vararg contents: Any) {
        log(HiLogManager.getConfig(), type, tag, *contents)
    }

    fun log(config: HiLogConfig, @TYPE type: Int, tag: String, vararg contents: Any) {
        if (!config.enable()) {
            return
        }
        val sb = StringBuilder()
        if (config.includeThread()) {
            val threadInfo: String = HiLogConfig.HI_THREAD_FORMATTER.format(Thread.currentThread())
            sb.append(threadInfo).append("\n")
        }
        if (config.stackTraceDepth() > 0) {
            val stackTrace: String? = HiLogConfig.HI_STACK_TRACE_FORMATTER.format(
                getCroppedRealStackTrack(
                    Throwable().stackTrace,
                    HI_LOG_PACKAGE,
                    config.stackTraceDepth()
                )
            )
            sb.append(stackTrace).append("\n")
        }
        var body = parseBody(contents.toList(), config)
        if (body != null) { //替换转义字符\
            body = body.replace("\\\"", "\"")
        }
        sb.append(body)
        val printers: List<HiLogPrinter> =
            (if (config.printers() != null) config.printers()
                ?.toList() else HiLogManager.getPrinters())
                ?: return
        //打印log
        for (printer in printers) {
            printer.print(config, type, tag, sb.toString())
        }
    }


    private fun parseBody(contents: List<Any>, config: HiLogConfig): String? {
        if (config.injectJsonParser() != null) {
            //只有一个数据且为String的情况下不再进行序列化
            return if (contents.size == 1 && contents[0] is String) {
                contents[0] as String
            } else config.injectJsonParser()!!.toJson(contents)
        }
        val sb = StringBuilder()
        for (o in contents) {
            sb.append(o.toString()).append(";")
        }
        if (sb.isNotEmpty()) {
            sb.deleteCharAt(sb.length - 1)
        }
        return sb.toString()
    }
}