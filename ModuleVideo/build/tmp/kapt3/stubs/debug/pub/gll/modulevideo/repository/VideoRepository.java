package pub.gll.modulevideo.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lpub/gll/modulevideo/repository/VideoRepository;", "", "fetchVideoList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lpub/gll/modulevideo/model/VideoItemModel;", "key", "", "ModuleVideo_debug"})
public abstract interface VideoRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.modulevideo.model.VideoItemModel>> fetchVideoList(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
}