package pub.gll.onepeas.libbase.di.http.internal

import com.google.gson.annotations.SerializedName

data class ListBean<T>(
    val curPage: Int = 0,
    val offset: Int = 0,
    val over: Boolean = false,
    val pageCount: Int = 0,
    val size: Int = 0,
    val total: Int = 0,
    @SerializedName("datas") val dataList: List<T> = emptyList()
)