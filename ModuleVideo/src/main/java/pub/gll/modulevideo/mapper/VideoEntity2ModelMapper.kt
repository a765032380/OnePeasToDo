package pub.gll.modulevideo.mapper

import pub.gll.modulevideo.db.VideoEntity
import pub.gll.modulevideo.model.VideoItemModel
import pub.gll.onepeas.libbase.mapper.Mapper


class VideoEntity2ModelMapper: Mapper<VideoEntity, VideoItemModel> {
    override fun map(comicHomeEntity: VideoEntity): VideoItemModel {
        return VideoItemModel(
            id = comicHomeEntity.id,
            page = comicHomeEntity.page,
            name = comicHomeEntity.name,
            icon = comicHomeEntity.icon,
            url = comicHomeEntity.url,
        )
    }
}