package pub.gll.onepeas.lib.log;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0004J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ3\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0011\"\u00020\u0007\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lpub/gll/onepeas/lib/log/HiLogManager;", "", "()V", "config", "Lpub/gll/onepeas/lib/log/config/HiLogConfig;", "printers", "", "Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;", "addPrinter", "", "printer", "getConfig", "getPrinters", "", "init", "application", "Landroid/app/Application;", "", "(Lpub/gll/onepeas/lib/log/config/HiLogConfig;Landroid/app/Application;[Lpub/gll/onepeas/lib/log/printer/HiLogPrinter;)V", "removePrinter", "LibLog_debug"})
public final class HiLogManager {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.lib.log.HiLogManager INSTANCE = null;
    private static pub.gll.onepeas.lib.log.config.HiLogConfig config;
    private static final java.util.List<pub.gll.onepeas.lib.log.printer.HiLogPrinter> printers = null;
    
    private HiLogManager() {
        super();
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.config.HiLogConfig config, @org.jetbrains.annotations.Nullable()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.printer.HiLogPrinter... printers) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.lib.log.config.HiLogConfig getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pub.gll.onepeas.lib.log.printer.HiLogPrinter> getPrinters() {
        return null;
    }
    
    public final void addPrinter(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.printer.HiLogPrinter printer) {
    }
    
    public final void removePrinter(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.lib.log.printer.HiLogPrinter printer) {
    }
}