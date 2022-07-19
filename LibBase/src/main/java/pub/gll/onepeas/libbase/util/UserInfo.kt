package pub.gll.onepeas.libbase.util

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * 作者　: hegaojian
 * 时间　: 2019/12/23
 * 描述　: 账户信息
 */
@Parcelize
data class UserInfo(
    @SerializedName("id")
    var id: String = "",
    @SerializedName("password")
    var password: String = "",
    @SerializedName("phone")
    var phone: String = "",
    @SerializedName("username")
    var uname: String = "",

    @SerializedName("createdAt")
    var createdAt: String = "",
    @SerializedName("grade")
    var grade: Int = 0,
    @SerializedName("identity")
    var identity: Int = 0,

    @SerializedName("imageBaseUrl")
    var imageBaseUrl: String = "",
):Parcelable{

    @SerializedName("headImage")
    var headerimg: String = ""
        get() {
            return imageBaseUrl+field
        }
        set(value) {
            field = value
        }
}

@Parcelize
data class WebData(
    var title: String?,
    var url: String,
    var showTitle:Boolean=true
) : Parcelable

