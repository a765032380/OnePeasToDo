package pub.gll.modulevideo.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lpub/gll/modulevideo/repository/VideoRepositoryImpl;", "Lpub/gll/modulevideo/repository/VideoRepository;", "api", "Lpub/gll/modulevideo/remote/VideoService;", "database", "Lpub/gll/modulevideo/db/VideoAppDatabase;", "carBrandEntity2ModelMapper", "Lpub/gll/onepeas/libbase/mapper/Mapper;", "Lpub/gll/modulevideo/db/VideoEntity;", "Lpub/gll/modulevideo/model/VideoItemModel;", "(Lpub/gll/modulevideo/remote/VideoService;Lpub/gll/modulevideo/db/VideoAppDatabase;Lpub/gll/onepeas/libbase/mapper/Mapper;)V", "fetchVideoList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "key", "", "ModuleVideo_debug"})
public final class VideoRepositoryImpl implements pub.gll.modulevideo.repository.VideoRepository {
    private final pub.gll.modulevideo.remote.VideoService api = null;
    private final pub.gll.modulevideo.db.VideoAppDatabase database = null;
    private final pub.gll.onepeas.libbase.mapper.Mapper<pub.gll.modulevideo.db.VideoEntity, pub.gll.modulevideo.model.VideoItemModel> carBrandEntity2ModelMapper = null;
    
    public VideoRepositoryImpl(@org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.remote.VideoService api, @org.jetbrains.annotations.NotNull()
    pub.gll.modulevideo.db.VideoAppDatabase database, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mapper.Mapper<pub.gll.modulevideo.db.VideoEntity, pub.gll.modulevideo.model.VideoItemModel> carBrandEntity2ModelMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.modulevideo.model.VideoItemModel>> fetchVideoList(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
}