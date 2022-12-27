package pub.gll.onepeas.libbase.net.exception

import java.io.IOException


/**
 * 一种为了传递字符串信息的异常，用于在Retrofit或者OkHttp处理过程中抛出
 */
class MsgException(val tip: String) : IOException()