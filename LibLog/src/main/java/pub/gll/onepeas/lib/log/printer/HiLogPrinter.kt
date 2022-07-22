package pub.gll.onepeas.lib.log.printer

import pub.gll.onepeas.lib.log.config.HiLogConfig

interface HiLogPrinter : IActivityLifecycleCallbacks {
    fun print(config: HiLogConfig, level:Int, tag:String, content:String)
}