package pub.gll.modulevideo.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lpub/gll/modulevideo/vm/VideoVM;", "Landroidx/lifecycle/ViewModel;", "comicHomeRepository", "Lpub/gll/modulevideo/repository/VideoRepository;", "(Lpub/gll/modulevideo/repository/VideoRepository;)V", "getComicHomeRepository", "()Lpub/gll/modulevideo/repository/VideoRepository;", "data", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lpub/gll/modulevideo/model/VideoItemModel;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "setData", "(Lkotlinx/coroutines/flow/Flow;)V", "key", "Landroidx/compose/runtime/MutableState;", "", "getKey", "()Landroidx/compose/runtime/MutableState;", "refresh", "", "ModuleVideo_debug"})
public final class VideoVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final pub.gll.modulevideo.repository.VideoRepository comicHomeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> key = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.modulevideo.model.VideoItemModel>> data;
    
    @javax.inject.Inject()
    public VideoVM(@org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.repository.VideoRepository comicHomeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pub.gll.modulevideo.repository.VideoRepository getComicHomeRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.modulevideo.model.VideoItemModel>> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.modulevideo.model.VideoItemModel>> p0) {
    }
    
    public final void refresh() {
    }
}