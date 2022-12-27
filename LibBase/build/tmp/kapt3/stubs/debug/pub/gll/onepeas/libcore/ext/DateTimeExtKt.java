package pub.gll.onepeas.libcore.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0001\u001a\u0011\u0010\u0005\u001a\u00020\u0003*\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0006\u001a\u001c\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003\u001a\u001c\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0003\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"getWeeOfToday", "", "getFriendlyTimeSpanByNow", "", "getFriendlyTimeSpanByNow1", "getSayHelloDateFormat", "(Ljava/lang/Long;)Ljava/lang/String;", "toDateFormat", "kotlin.jvm.PlatformType", "", "format", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "LibBase_debug"})
public final class DateTimeExtKt {
    
    /**
     * 字符串日期格式（比如：2018-4-6)转为毫秒
     * @param format 时间的格式，默认是按照yyyy-MM-dd HH:mm:ss来转换，如果您的格式不一样，则需要传入对应的格式
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long toDateFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    /**
     * Long类型时间戳转为字符串的日期格式
     * @param format 时间的格式，默认是按照yyyy-MM-dd HH:mm:ss来转换，如果您的格式不一样，则需要传入对应的格式
     */
    public static final java.lang.String toDateFormat(long $this$toDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    public static final java.lang.String toDateFormat(int $this$toDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    /**
     * Return the friendly time span by now.
     *
     * @param millis The milliseconds.
     * @return the friendly time span by now
     *
     * * 如果小于 1 秒钟内，显示刚刚
     * * 如果在 1 分钟内，显示 XXX秒前
     * * 如果在 1 小时内，显示 XXX分钟前
     * * 如果在 1 小时外的今天内，显示今天15:32
     * * 如果是昨天的，显示昨天15:32
     * * 其余显示，2016-10-15
     * * 时间不合法的情况全部日期和时间信息，如星期六 十月 27 14:21:20 CST 2007
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getFriendlyTimeSpanByNow(long $this$getFriendlyTimeSpanByNow) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getFriendlyTimeSpanByNow1(long $this$getFriendlyTimeSpanByNow1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getSayHelloDateFormat(@org.jetbrains.annotations.Nullable()
    java.lang.Long $this$getSayHelloDateFormat) {
        return null;
    }
    
    private static final long getWeeOfToday() {
        return 0L;
    }
}