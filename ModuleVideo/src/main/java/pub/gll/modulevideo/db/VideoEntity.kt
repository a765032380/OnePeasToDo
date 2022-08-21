package pub.gll.modulevideo.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import pub.gll.onepeas.libbase.ext.PagerEntity

@Entity(tableName = "VideoEntity")
data class VideoEntity(
    @PrimaryKey
    val id:String,
    val name:String,
    val icon:String,
    val url:String,
    override var page:Int=0,
): PagerEntity