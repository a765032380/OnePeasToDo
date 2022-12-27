package pub.gll.onepeas.libbase.util;

import java.lang.System;

/**
 * Description
 *
 * @author yangjiaming
 * @version 1.0.0
 * @date 2018/12/27
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0004J\u0010\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a\u00a8\u0006#"}, d2 = {"Lpub/gll/onepeas/libbase/util/OSUtils;", "", "()V", "KEY_VERSION_EMUI", "", "KEY_VERSION_MIUI", "KEY_VERSION_OPPO", "KEY_VERSION_SMARTISAN", "KEY_VERSION_VIVO", "ROM_EMUI", "ROM_FLYME", "ROM_MIUI", "ROM_OPPO", "ROM_QIKU", "ROM_SMARTISAN", "ROM_VIVO", "isEmui", "", "()Z", "isFlyme", "isMiui", "isOppo", "isSmartisan", "isVivo", "name", "getName", "()Ljava/lang/String;", "sName", "sVersion", "version", "getVersion", "check", "rom", "getProp", "is360", "LibBase_debug"})
public final class OSUtils {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.OSUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_MIUI = "MIUI";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_EMUI = "EMUI";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_FLYME = "FLYME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_OPPO = "OPPO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_SMARTISAN = "SMARTISAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_VIVO = "VIVO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROM_QIKU = "QIKU";
    private static final java.lang.String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
    private static final java.lang.String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final java.lang.String KEY_VERSION_OPPO = "ro.build.version.opporom";
    private static final java.lang.String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
    private static final java.lang.String KEY_VERSION_VIVO = "ro.vivo.os.version";
    private static java.lang.String sName;
    private static java.lang.String sVersion;
    
    private OSUtils() {
        super();
    }
    
    public final boolean isEmui() {
        return false;
    }
    
    public final boolean check(@org.jetbrains.annotations.NotNull()
    java.lang.String rom) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProp(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public final boolean isMiui() {
        return false;
    }
    
    public final boolean isVivo() {
        return false;
    }
    
    public final boolean isOppo() {
        return false;
    }
    
    public final boolean isFlyme() {
        return false;
    }
    
    public final boolean is360() {
        return false;
    }
    
    public final boolean isSmartisan() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
}