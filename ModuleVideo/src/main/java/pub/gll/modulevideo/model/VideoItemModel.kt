package pub.gll.modulevideo.model

import com.google.gson.annotations.SerializedName

data class VideoItemModel(
    @SerializedName("page")
    val page:Int,
    @SerializedName("id")
    var id:String,
    @SerializedName("title")
    val name:String,
    @SerializedName("img")
    val icon:String)