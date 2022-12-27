package pub.gll.onepeas.lib.log

import android.app.Application
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.printer.HiConsolePrinter
import pub.gll.onepeas.lib.log.printer.HiLogPrinter


object HiLogManager {
    private var config: HiLogConfig = HiLogConfig()
    private val printers: MutableList<HiLogPrinter> = ArrayList()

    init {
        printers.add(HiConsolePrinter())
    }

    fun init(config: HiLogConfig, application: Application?=null, vararg printers: HiLogPrinter) {
        HiLogManager.config = config
        application?.let {
            printers.forEach {
                application.registerActivityLifecycleCallbacks(it)
            }
        }
        HiLogManager.printers.addAll(printers.toMutableList())
    }

    fun getConfig(): HiLogConfig {
        return config
    }

    fun getPrinters(): List<HiLogPrinter> {
        return printers
    }

    fun addPrinter(printer: HiLogPrinter) {
        printers.add(printer)
    }

    fun removePrinter(printer: HiLogPrinter) {
        printers.remove(printer)
    }

}