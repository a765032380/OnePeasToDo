package pub.gll.onepeas.modulesample.effects.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lpub/gll/onepeas/modulesample/effects/repository/Result;", "T", "", "()V", "Error", "Loading", "Success", "Lpub/gll/onepeas/modulesample/effects/repository/Result$Loading;", "Lpub/gll/onepeas/modulesample/effects/repository/Result$Error;", "Lpub/gll/onepeas/modulesample/effects/repository/Result$Success;", "ModuleSample_debug"})
public abstract class Result<T extends java.lang.Object> {
    
    private Result() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lpub/gll/onepeas/modulesample/effects/repository/Result$Loading;", "Lpub/gll/onepeas/modulesample/effects/repository/Result;", "Lpub/gll/onepeas/modulesample/effects/repository/Image;", "()V", "ModuleSample_debug"})
    public static final class Loading extends pub.gll.onepeas.modulesample.effects.repository.Result<pub.gll.onepeas.modulesample.effects.repository.Image> {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.modulesample.effects.repository.Result.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lpub/gll/onepeas/modulesample/effects/repository/Result$Error;", "Lpub/gll/onepeas/modulesample/effects/repository/Result;", "Lpub/gll/onepeas/modulesample/effects/repository/Image;", "()V", "ModuleSample_debug"})
    public static final class Error extends pub.gll.onepeas.modulesample.effects.repository.Result<pub.gll.onepeas.modulesample.effects.repository.Image> {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.modulesample.effects.repository.Result.Error INSTANCE = null;
        
        private Error() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lpub/gll/onepeas/modulesample/effects/repository/Result$Success;", "Lpub/gll/onepeas/modulesample/effects/repository/Result;", "Lpub/gll/onepeas/modulesample/effects/repository/Image;", "image", "(Lpub/gll/onepeas/modulesample/effects/repository/Image;)V", "getImage", "()Lpub/gll/onepeas/modulesample/effects/repository/Image;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ModuleSample_debug"})
    public static final class Success extends pub.gll.onepeas.modulesample.effects.repository.Result<pub.gll.onepeas.modulesample.effects.repository.Image> {
        @org.jetbrains.annotations.NotNull()
        private final pub.gll.onepeas.modulesample.effects.repository.Image image = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.modulesample.effects.repository.Result.Success copy(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.modulesample.effects.repository.Image image) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        pub.gll.onepeas.modulesample.effects.repository.Image image) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.modulesample.effects.repository.Image component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.modulesample.effects.repository.Image getImage() {
            return null;
        }
    }
}