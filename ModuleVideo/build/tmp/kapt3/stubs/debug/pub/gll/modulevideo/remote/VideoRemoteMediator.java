package pub.gll.modulevideo.remote;

import java.lang.System;

@kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ/\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J-\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lpub/gll/modulevideo/remote/VideoRemoteMediator;", "Landroidx/paging/RemoteMediator;", "", "Lpub/gll/modulevideo/db/VideoEntity;", "api", "Lpub/gll/modulevideo/remote/VideoService;", "db", "Lpub/gll/modulevideo/db/VideoAppDatabase;", "key", "", "(Lpub/gll/modulevideo/remote/VideoService;Lpub/gll/modulevideo/db/VideoAppDatabase;Ljava/lang/String;)V", "getApi", "()Lpub/gll/modulevideo/remote/VideoService;", "getDb", "()Lpub/gll/modulevideo/db/VideoAppDatabase;", "getKey", "()Ljava/lang/String;", "insertDB", "", "loadType", "Landroidx/paging/LoadType;", "page", "data", "", "Lpub/gll/modulevideo/model/VideoItemModel;", "(Landroidx/paging/LoadType;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "Landroidx/paging/RemoteMediator$MediatorResult;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/LoadType;Landroidx/paging/PagingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadNet", "pageSize", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ModuleVideo_debug"})
public final class VideoRemoteMediator extends androidx.paging.RemoteMediator<java.lang.Integer, pub.gll.modulevideo.db.VideoEntity> {
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.modulevideo.remote.VideoService api = null;
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.modulevideo.db.VideoAppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String key = null;
    
    public VideoRemoteMediator(@org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.remote.VideoService api, @org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.db.VideoAppDatabase db, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.modulevideo.remote.VideoService getApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.modulevideo.db.VideoAppDatabase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKey() {
        return null;
    }
    
    /**
     * 从网络加载数据
     */
    private final java.lang.Object loadNet(int page, int pageSize, kotlin.coroutines.Continuation<? super java.util.List<pub.gll.modulevideo.model.VideoItemModel>> continuation) {
        return null;
    }
    
    /**
     * 将数据插入数据库
     */
    private final java.lang.Object insertDB(androidx.paging.LoadType loadType, int page, java.util.List<pub.gll.modulevideo.model.VideoItemModel> data, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    androidx.paging.LoadType loadType, @org.jetbrains.annotations.NotNull()
    androidx.paging.PagingState<java.lang.Integer, pub.gll.modulevideo.db.VideoEntity> state, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.MediatorResult> continuation) {
        return null;
    }
}