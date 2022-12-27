package pub.gll.onepeas.libbase.di.http.result

import com.google.gson.annotations.SerializedName

data class BasicBean<T>(
    @SerializedName("data")
    var data: T?,
    @SerializedName("code")
    var errorCode: Int,
    @SerializedName("message")
    var errorMsg: String
)
