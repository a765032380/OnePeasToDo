package pub.gll.onepeas.module.comic.comic.home.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ComicHomeEntity")
data class ComicHomeEntity(
    @PrimaryKey
    val id:Int,
    val page:Int)