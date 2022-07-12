package pub.gll.onepeas.todo.comic.home.mapper

import pub.gll.onepeas.todo.comic.home.db.ComicHomeEntity
import pub.gll.onepeas.todo.comic.home.model.ComicHomeItemModel

class ComicHomeEntity2ModelMapper: Mapper<ComicHomeEntity, ComicHomeItemModel> {
    override fun map(comicHomeEntity: ComicHomeEntity): ComicHomeItemModel {
        return ComicHomeItemModel(
            id = comicHomeEntity.id,
            page = comicHomeEntity.page
        )
    }
}