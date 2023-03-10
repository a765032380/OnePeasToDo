package pub.gll.onepeas.module.car.model

import com.google.gson.annotations.SerializedName

data class CarBrandItemModel(
    @SerializedName("id")
    var id:String,
    @SerializedName("title")
    val name:String,
    @SerializedName("img")
    val icon:String
)