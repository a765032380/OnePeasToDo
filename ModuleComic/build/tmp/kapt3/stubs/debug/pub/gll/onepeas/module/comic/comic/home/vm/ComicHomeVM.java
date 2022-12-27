package pub.gll.onepeas.module.comic.comic.home.vm;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lpub/gll/onepeas/module/comic/comic/home/vm/ComicHomeVM;", "Landroidx/lifecycle/ViewModel;", "comicHomeRepository", "Lpub/gll/onepeas/module/comic/comic/home/repository/ComicRepository;", "(Lpub/gll/onepeas/module/comic/comic/home/repository/ComicRepository;)V", "data", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lpub/gll/onepeas/module/comic/comic/home/model/ComicHomeItemModel;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "setData", "(Lkotlinx/coroutines/flow/Flow;)V", "ModuleComic_debug"})
public final class ComicHomeVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel>> data;
    
    @javax.inject.Inject()
    public ComicHomeVM(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.comic.comic.home.repository.ComicRepository comicHomeRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel>> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel>> p0) {
    }
}