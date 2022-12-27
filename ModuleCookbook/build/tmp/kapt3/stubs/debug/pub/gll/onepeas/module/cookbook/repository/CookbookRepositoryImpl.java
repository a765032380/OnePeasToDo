package pub.gll.onepeas.module.cookbook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lpub/gll/onepeas/module/cookbook/repository/CookbookRepositoryImpl;", "Lpub/gll/onepeas/module/cookbook/repository/CookbookRepository;", "api", "Lpub/gll/onepeas/module/cookbook/remote/CookbookService;", "database", "Lpub/gll/onepeas/module/cookbook/db/CookbookAppDatabase;", "carBrandEntity2ModelMapper", "Lpub/gll/onepeas/libbase/mapper/Mapper;", "Lpub/gll/onepeas/module/cookbook/db/CookbookEntity;", "Lpub/gll/onepeas/module/cookbook/model/CookbookItemModel;", "(Lpub/gll/onepeas/module/cookbook/remote/CookbookService;Lpub/gll/onepeas/module/cookbook/db/CookbookAppDatabase;Lpub/gll/onepeas/libbase/mapper/Mapper;)V", "fetchCookbookList", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "ModuleCookbook_debug"})
public final class CookbookRepositoryImpl implements pub.gll.onepeas.module.cookbook.repository.CookbookRepository {
    private final pub.gll.onepeas.module.cookbook.remote.CookbookService api = null;
    private final pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase database = null;
    private final pub.gll.onepeas.libbase.mapper.Mapper<pub.gll.onepeas.module.cookbook.db.CookbookEntity, pub.gll.onepeas.module.cookbook.model.CookbookItemModel> carBrandEntity2ModelMapper = null;
    
    public CookbookRepositoryImpl(@org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.cookbook.remote.CookbookService api, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.module.cookbook.db.CookbookAppDatabase database, @org.jetbrains.annotations.NotNull()
    pub.gll.onepeas.libbase.mapper.Mapper<pub.gll.onepeas.module.cookbook.db.CookbookEntity, pub.gll.onepeas.module.cookbook.model.CookbookItemModel> carBrandEntity2ModelMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<pub.gll.onepeas.module.cookbook.model.CookbookItemModel>> fetchCookbookList() {
        return null;
    }
}