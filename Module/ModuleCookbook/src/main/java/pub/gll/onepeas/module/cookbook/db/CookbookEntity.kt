package pub.gll.onepeas.module.cookbook.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import pub.gll.onepeas.libbase.ext.PagerEntity

@Entity(tableName = "CookbookEntity")
data class CookbookEntity(
    @PrimaryKey
    val id:String,
    val name:String,
    val icon:String,
    override var page:Int=0,
): PagerEntity