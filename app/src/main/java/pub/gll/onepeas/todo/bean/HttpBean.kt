package pub.gll.onepeas.todo.bean

import com.google.gson.annotations.SerializedName


data class BasicBean<T>(
    @SerializedName("data")
    var data: T?,
    @SerializedName("code")
    var errorCode: Int,
    @SerializedName("message")
    var errorMsg: String
)

data class ListWrapper<T>(
    var curPage: Int,
    var offset: Int,
    var over: Boolean,
    var pageCount: Int,
    var size: Int,
    var total: Int,
    var datas: ArrayList<T>
)