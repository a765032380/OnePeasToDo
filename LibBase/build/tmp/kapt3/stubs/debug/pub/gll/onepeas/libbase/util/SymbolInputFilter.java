package pub.gll.onepeas.libbase.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lpub/gll/onepeas/libbase/util/SymbolInputFilter;", "Landroid/text/InputFilter;", "filterChars", "", "([C)V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "isFilterChar", "", "c", "", "needFilter", "Companion", "LibBase_debug"})
public final class SymbolInputFilter implements android.text.InputFilter {
    private final char[] filterChars = null;
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.SymbolInputFilter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "SymbolInputFilter";
    
    private SymbolInputFilter(char[] filterChars) {
        super();
    }
    
    /**
     * @param source 输入的文字
     * @param start  输入-0，删除-0
     * @param end    输入-文字的长度，删除-0
     * @param dest   原先显示的内容
     * @param dstart 输入-原光标位置，删除-光标删除结束位置
     * @param dend   输入-原光标位置，删除-光标删除开始位置
     * @return null表示原始输入，""表示不接受输入，其他字符串表示变化值
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence filter(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence source, int start, int end, @org.jetbrains.annotations.NotNull()
    android.text.Spanned dest, int dstart, int dend) {
        return null;
    }
    
    private final boolean needFilter(java.lang.CharSequence source) {
        return false;
    }
    
    private final boolean isFilterChar(char c) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lpub/gll/onepeas/libbase/util/SymbolInputFilter$Companion;", "", "()V", "TAG", "", "newlineCharFilter", "Lpub/gll/onepeas/libbase/util/SymbolInputFilter;", "returnCharFilter", "whitespaceCharFilter", "wnrCharFilter", "LibBase_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.util.SymbolInputFilter newlineCharFilter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.util.SymbolInputFilter whitespaceCharFilter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.util.SymbolInputFilter returnCharFilter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pub.gll.onepeas.libbase.util.SymbolInputFilter wnrCharFilter() {
            return null;
        }
    }
}