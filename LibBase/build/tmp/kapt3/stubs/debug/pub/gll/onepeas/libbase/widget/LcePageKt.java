package pub.gll.onepeas.libbase.widget;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007H\u0007\u001a\b\u0010\b\u001a\u00020\u0001H\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u00a8\u0006\n"}, d2 = {"LcePage", "", "pageState", "Lpub/gll/onepeas/libbase/di/http/result/PageState;", "onRetry", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "PageEmpty", "PageLoading", "LibBase_debug"})
public final class LcePageKt {
    
    /**
     * 通过State进行控制的Loading、Content、Error页面
     *
     * @param pageState 数据State
     * @param onRetry 错误时的点击事件
     * @param content 数据加载成功时应显示的可组合项
     */
    @androidx.compose.runtime.Composable()
    public static final void LcePage(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.di.http.result.PageState pageState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRetry, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PageLoading() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PageEmpty() {
    }
}