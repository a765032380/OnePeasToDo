package pub.gll.onepeas.module.comic.comic.home.model

import com.google.gson.annotations.SerializedName

data class ComicHomeItemModel(
    @SerializedName("id")
    val id:Int,
    @SerializedName("page")
    val page:Int
    )