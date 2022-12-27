package pub.gll.onepeas.module.cookbook.remote;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ/\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J-\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lpub/gll/onepeas/module/cookbook/remote/CookbookRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lpub/gll/onepeas/module/cookbook/db/CookbookEntity;", "api", "Lpub/gll/onepeas/module/cookbook/remote/CookbookService;", "db", "Lpub/gll/onepeas/module/cookbook/db/CookbookAppDatabase;", "(Lpub/gll/onepeas/module/cookbook/remote/CookbookService;Lpub/gll/onepeas/module/cookbook/db/CookbookAppDatabase;)V", "getApi", "()Lpub/gll/onepeas/module/cookbook/remote/CookbookService;", "getDb", "()Lpub/gll/onepeas/module/cookbook/db/CookbookAppDatabase;", "insertDB", "", "loadType", "Landroidx/paging/LoadType;", "page", "data", "", "Lpub/gll/onepeas/module/cookbook/model/CookbookItemModel;", "(Landroidx/paging/LoadType;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadNet", "pageSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModuleCookbook_debug"})
public final class CookbookRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, pub.gll.onepeas.module.cookbook.db.CookbookEntity> {
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.onepeas.module.cookbook.remote.CookbookService api = null;
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase db = null;
    
    public CookbookRemoteMediator(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.cookbook.remote.CookbookService api, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.cookbook.remote.CookbookService getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase getDb() {
        return null;
    }
    
    /**
     * 从网络加载数据
     */
    private final java.lang.Object loadNet(int page, int pageSize, kotlin.coroutines.Continuation<? super java.util.List<pub.gll.onepeas.module.cookbook.model.CookbookItemModel>> continuation) {
        return null;
    }
    
    /**
     * 将数据插入数据库
     */
    private final java.lang.Object insertDB(androidx.paging.LoadType loadType, int page, java.util.List<pub.gll.onepeas.module.cookbook.model.CookbookItemModel> data, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, pub.gll.onepeas.module.cookbook.db.CookbookEntity> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
}