package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * @author derekyan
 * @desc 日历提醒
 * @date 4/2/21
 *
 * CalendarReminderUtils.addCalendarEvent(this,"学校读书","吃了饭再去",System.currentTimeMillis()+3600*24*1000*2+10000,2);
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J6\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lpub/gll/onepeas/libbase/util/CalendarReminderUtils;", "", "()V", "CALENDARS_ACCOUNT_NAME", "", "CALENDARS_ACCOUNT_TYPE", "CALENDARS_DISPLAY_NAME", "CALENDARS_NAME", "CALENDER_EVENT_URL", "CALENDER_REMINDER_URL", "CALENDER_URL", "addCalendarAccount", "", "context", "Landroid/content/Context;", "addCalendarEvent", "", "title", "description", "reminderTime", "previousDate", "", "checkAndAddCalendarAccount", "checkCalendarAccount", "deleteCalendarEvent", "", "LibBase_debug"})
public final class CalendarReminderUtils {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.CalendarReminderUtils INSTANCE = null;
    private static final java.lang.String CALENDER_URL = "content://com.android.calendar/calendars";
    private static final java.lang.String CALENDER_EVENT_URL = "content://com.android.calendar/events";
    private static final java.lang.String CALENDER_REMINDER_URL = "content://com.android.calendar/reminders";
    private static final java.lang.String CALENDARS_NAME = "club";
    private static final java.lang.String CALENDARS_ACCOUNT_NAME = "voice_club";
    private static final java.lang.String CALENDARS_ACCOUNT_TYPE = "com.rs.club";
    private static final java.lang.String CALENDARS_DISPLAY_NAME = "club\u8d26\u6237";
    
    private CalendarReminderUtils() {
        super();
    }
    
    /**
     * 检查是否已经添加了日历账户，如果没有添加先添加一个日历账户再查询
     * 获取账户成功返回账户id，否则返回-1
     */
    private final int checkAndAddCalendarAccount(android.content.Context context) {
        return 0;
    }
    
    /**
     * 检查是否存在现有账户，存在则返回账户id，否则返回-1
     */
    private final int checkCalendarAccount(android.content.Context context) {
        return 0;
    }
    
    /**
     * 添加日历账户，账户创建成功则返回账户id，否则返回-1
     */
    private final long addCalendarAccount(android.content.Context context) {
        return 0L;
    }
    
    /**
     * 添加日历事件
     */
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    public final boolean addCalendarEvent(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description, long reminderTime, int previousDate) {
        return false;
    }
    
    /**
     * 删除日历事件
     */
    public final void deleteCalendarEvent(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
}