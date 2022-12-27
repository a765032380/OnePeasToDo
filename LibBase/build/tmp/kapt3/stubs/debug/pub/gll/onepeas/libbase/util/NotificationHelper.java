package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * 通知辅助类
 *
 * @author derekyan
 * @date 2020/6/11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000eH\u0007Jq\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u00a2\u0006\u0002\u0010*J\u0083\u0001\u0010+\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u000eH\u0007J4\u0010-\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0015H\u0007J\u001e\u00100\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001502H\u0007J\u001e\u00103\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e02H\u0007J\u0016\u00105\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u00106\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004J\u001c\u00107\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000402J\u001c\u00109\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000402J\u0018\u0010;\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0018\u0010<\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J \u0010=\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0006H\u0007J\u000e\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u0004J\u000e\u0010A\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\fJ,\u0010B\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010C\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006D"}, d2 = {"Lpub/gll/onepeas/libbase/util/NotificationHelper;", "", "()V", "TAG", "", "isShowLog", "", "()Z", "setShowLog", "(Z)V", "areNotificationsEnabled", "context", "Landroid/content/Context;", "buildChannel", "Landroid/app/NotificationChannel;", "channelId", "channelName", "importance", "", "groupId", "buildChannelGroup", "Landroid/app/NotificationChannelGroup;", "groupName", "cancel", "", "notificationId", "tag", "cancelAll", "checkChannelParam", "channelBean", "create", "Landroid/app/Notification;", "whenTime", "", "smallIconResId", "largeIconBitmap", "Landroid/graphics/Bitmap;", "contentTitle", "contentText", "defaults", "pendingIntent", "Landroid/app/PendingIntent;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/app/PendingIntent;)Landroid/app/Notification;", "createAndShow", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Ljava/lang/Integer;)V", "createChannel", "createChannelGroup", "channelGroup", "createChannelGroups", "channelGroupList", "", "createChannels", "channelList", "deleteChannel", "deleteChannelGroup", "deleteChannelGroups", "groupIds", "deleteChannels", "channelIds", "isChannelAlreadyCreated", "isChannelGroupAlreadyCreated", "isChannelsEnabled", "isIntentSetting", "log", "content", "openSetting", "show", "notification", "LibBase_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.NotificationHelper INSTANCE = null;
    private static final java.lang.String TAG = "NotificationUtils";
    private static boolean isShowLog = false;
    
    private NotificationHelper() {
        super();
    }
    
    public final boolean isShowLog() {
        return false;
    }
    
    public final void setShowLog(boolean p0) {
    }
    
    /**
     * 创建并显示默认通知
     */
    public final void createAndShow(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId, int notificationId, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.Long whenTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer smallIconResId, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap largeIconBitmap, @org.jetbrains.annotations.Nullable()
    java.lang.String contentTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String contentText, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent pendingIntent, @org.jetbrains.annotations.Nullable()
    java.lang.Integer defaults) {
    }
    
    /**
     * 创建默认通知
     *
     * @param context 上下文
     * @param channelId 渠道id
     * @param whenTime 通知时间
     * @param smallIconResId 通知小图标
     * @param largeIconBitmap 通知大图
     * @param contentTitle 标题
     * @param contentText 内容
     * @param defaults 设置
     * @param pendingIntent 点击意图
     */
    @org.jetbrains.annotations.Nullable()
    public final android.app.Notification create(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.Nullable()
    java.lang.Long whenTime, @org.jetbrains.annotations.Nullable()
    java.lang.Integer smallIconResId, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap largeIconBitmap, @org.jetbrains.annotations.Nullable()
    java.lang.String contentTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String contentText, @org.jetbrains.annotations.Nullable()
    java.lang.Integer defaults, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent pendingIntent) {
        return null;
    }
    
    /**
     * 打开通知
     */
    public final void show(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int notificationId, @org.jetbrains.annotations.Nullable()
    android.app.Notification notification, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    /**
     * 关闭指定 id 的通知
     */
    public final void cancel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int notificationId, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    /**
     * 关闭所有通知
     */
    public final void cancelAll(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * 创建多个通知渠道
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createChannels(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<android.app.NotificationChannel> channelList) {
    }
    
    /**
     * 创建单个通知渠道
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createChannel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationChannel channelBean) {
    }
    
    /**
     * 创建单个通知渠道
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createChannel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    java.lang.String channelName, int importance, @org.jetbrains.annotations.Nullable()
    java.lang.String groupId) {
    }
    
    /**
     * 删除单个渠道
     */
    public final void deleteChannel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId) {
    }
    
    /**
     * 删除多个渠道
     */
    public final void deleteChannels(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> channelIds) {
    }
    
    /**
     * 创建单个渠道组
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createChannelGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.app.NotificationChannelGroup channelGroup) {
    }
    
    /**
     * 创建多个渠道组
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createChannelGroups(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<android.app.NotificationChannelGroup> channelGroupList) {
    }
    
    /**
     * 删除单个渠道组
     */
    public final void deleteChannelGroup(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
    }
    
    /**
     * 删除多个渠道组
     */
    public final void deleteChannelGroups(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> groupIds) {
    }
    
    /**
     * 创建 NotificationChannel 对象
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final android.app.NotificationChannel buildChannel(@org.jetbrains.annotations.NotNull()
    java.lang.String channelId, @org.jetbrains.annotations.NotNull()
    java.lang.String channelName, int importance, @org.jetbrains.annotations.Nullable()
    java.lang.String groupId) {
        return null;
    }
    
    /**
     * 创建 NotificationChannelGroup 对象
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final android.app.NotificationChannelGroup buildChannelGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupName) {
        return null;
    }
    
    /**
     * 检查 channelBean 参数是否合法
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final boolean checkChannelParam(@org.jetbrains.annotations.NotNull()
    android.app.NotificationChannel channelBean) {
        return false;
    }
    
    /**
     * 渠道是否已经创建
     *
     * @return true 已创建 false 未创建
     */
    private final boolean isChannelAlreadyCreated(android.content.Context context, java.lang.String channelId) {
        return false;
    }
    
    /**
     * 渠道组是否创建
     */
    private final boolean isChannelGroupAlreadyCreated(android.content.Context context, java.lang.String groupId) {
        return false;
    }
    
    /**
     * 指定渠道是否打开
     *
     * @param isIntentSetting: true 跳转到通知设置页
     */
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    public final boolean isChannelsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String channelId, boolean isIntentSetting) {
        return false;
    }
    
    /**
     * 通知权限是否打开
     */
    public final boolean areNotificationsEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    /**
     * 打开通知设置
     *
     * 需要适配不同版本
     */
    public final void openSetting(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void log(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
    }
}