package pub.gll.onepeas.todo.car.remote

import com.google.gson.annotations.SerializedName
import pub.gll.onepeas.todo.car.model.CarBrandItemModel
import retrofit2.http.GET
import retrofit2.http.Query

interface CarBrandService {

    @GET("tpxh")
    suspend fun fetchCarBrand(
        @Query("page") page:Int,
        @Query("maxResult") maxResult:Int,
        @Query("appkey") appKey:String,
        @Query("time") time:String,
    ):Car

}
//data class Result <T> (
//    var code:String,
//    var msg:String,
//    var result:ResultData<T>
//)
//data class ResultData <T> (
//    @SerializedName("showapi_res_body")
//    var showApiResBody:ContentList<T>
//)
//data class ContentList <T> (
//    var contentlist:T
//)

data class Car(
    val charge: Boolean,
    val code: String,
    val msg: String,
    val result: Result
)

data class Result(
    val showapi_res_body: ShowapiResBody,
    val showapi_res_code: Int,
    val showapi_res_error: String
)

data class ShowapiResBody(
    val allNum: Int,
    val allPages: Int,
    val contentlist: List<CarBrandItemModel>,
    val currentPage: Int,
    val maxResult: Int,
    val ret_code: Int
)
