package pub.gll.onepeas.libbase.di.http.result;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/result/PageState;", "", "()V", "Error", "Loading", "Success", "Lpub/gll/onepeas/libbase/di/http/result/PageState$Loading;", "Lpub/gll/onepeas/libbase/di/http/result/PageState$Success;", "Lpub/gll/onepeas/libbase/di/http/result/PageState$Error;", "LibBase_debug"})
public abstract class PageState {
    
    private PageState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/result/PageState$Loading;", "Lpub/gll/onepeas/libbase/di/http/result/PageState;", "()V", "LibBase_debug"})
    public static final class Loading extends pub.gll.onepeas.libbase.di.http.result.PageState {
        @org.jetbrains.annotations.NotNull()
        public static final pub.gll.onepeas.libbase.di.http.result.PageState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/result/PageState$Success;", "Lpub/gll/onepeas/libbase/di/http/result/PageState;", "isEmpty", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "LibBase_debug"})
    public static final class Success extends pub.gll.onepeas.libbase.di.http.result.PageState {
        private final boolean isEmpty = false;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.di.http.result.PageState.Success copy(boolean isEmpty) {
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
        
        public Success(boolean isEmpty) {
            super();
        }
        
        public final boolean component1() {
            return false;
        }
        
        public final boolean isEmpty() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lpub/gll/onepeas/libbase/di/http/result/PageState$Error;", "Lpub/gll/onepeas/libbase/di/http/result/PageState;", "exception", "", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "LibBase_debug"})
    public static final class Error extends pub.gll.onepeas.libbase.di.http.result.PageState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable exception = null;
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.di.http.result.PageState.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
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
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getException() {
            return null;
        }
    }
}