package pub.gll.onepeas.module.comic.comic.home.mapper

import pub.gll.onepeas.module.comic.comic.home.db.ComicHomeEntity
import pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel

class ComicHomeEntity2ModelMapper: Mapper<ComicHomeEntity, ComicHomeItemModel> {
    override fun map(comicHomeEntity: ComicHomeEntity): ComicHomeItemModel {
        return ComicHomeItemModel(
            id = comicHomeEntity.id,
            page = comicHomeEntity.page
        )
    }
}