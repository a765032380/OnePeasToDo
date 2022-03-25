package pub.gll.onepeas.liblog.formatter

import pub.gll.onepeas.liblog.formatter.HiLogFormatter

class HiThreadFormatter : HiLogFormatter<Thread?> {
    override fun format(data: Thread?): String {
        return "Thread:" + data?.name
    }
}
