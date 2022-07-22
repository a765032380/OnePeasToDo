package pub.gll.onepeas.lib.log.formatter


interface HiLogFormatter<T> {
    fun format(data: T?): String?
}