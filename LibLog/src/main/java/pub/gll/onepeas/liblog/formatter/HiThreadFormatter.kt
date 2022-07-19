package pub.gll.onepeas.liblog.formatter

class HiThreadFormatter : HiLogFormatter<Thread?> {
    override fun format(data: Thread?): String {
        return "Thread:" + data?.name
    }
}
