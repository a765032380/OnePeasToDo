package pub.gll.onepeas.module.cookbook.model

import com.google.gson.annotations.SerializedName

data class CookbookItemModel(
    @SerializedName("page")
    val page:Int,
    @SerializedName("id")
    var id:String,
    @SerializedName("title")
    val name:String,
    @SerializedName("img")
    val icon:String)