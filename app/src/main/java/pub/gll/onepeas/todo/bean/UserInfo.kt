package pub.gll.onepeas.todo.bean

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * 作者　: hegaojian
 * 时间　: 2019/12/23
 * 描述　: 账户信息
 */
@Parcelize
data class UserInfo(
    @SerializedName("user_id")
    var id: Int = 0,
    @SerializedName("password")
    var password: String = "",
    @SerializedName("phone")
    var phone: String = "",
    @SerializedName("nick_name")
    var uname: String = "",
    @SerializedName("headerimg")
    var headerimg: String = "",
):Parcelable

@Parcelize
data class WebData(
    var title: String?,
    var url: String
) : Parcelable

