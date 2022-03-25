package pub.gll.onepeas.liblog.formatter


interface HiLogFormatter<T> {
    fun format(data: T?): String?
}