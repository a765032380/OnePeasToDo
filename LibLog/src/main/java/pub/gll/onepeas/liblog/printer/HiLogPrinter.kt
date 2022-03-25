package pub.gll.onepeas.liblog.printer

import pub.gll.onepeas.liblog.config.HiLogConfig

interface HiLogPrinter : IActivityLifecycleCallbacks {
    fun print(config: HiLogConfig, level:Int, tag:String, content:String)
}