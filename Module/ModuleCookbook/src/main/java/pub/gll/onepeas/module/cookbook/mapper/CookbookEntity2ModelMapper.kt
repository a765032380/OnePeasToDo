package pub.gll.onepeas.module.cookbook.mapper

import pub.gll.onepeas.libbase.mapper.Mapper
import pub.gll.onepeas.module.cookbook.db.CookbookEntity
import pub.gll.onepeas.module.cookbook.model.CookbookItemModel


class CookbookEntity2ModelMapper: Mapper<CookbookEntity, CookbookItemModel> {
    override fun map(comicHomeEntity: CookbookEntity): CookbookItemModel {
        return CookbookItemModel(
            id = comicHomeEntity.id,
            page = comicHomeEntity.page,
            name = comicHomeEntity.name,
            icon = comicHomeEntity.icon
        )
    }
}