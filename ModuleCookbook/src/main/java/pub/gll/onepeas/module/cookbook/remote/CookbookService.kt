package pub.gll.onepeas.module.cookbook.remote

import pub.gll.onepeas.module.cookbook.model.CookbookItemModel
import retrofit2.http.GET
import retrofit2.http.Query

interface CookbookService {

    @GET("tpxh")
    suspend fun fetchCookbook(
        @Query("page") page:Int,
        @Query("maxResult") maxResult:Int,
        @Query("appkey") appKey:String,
        @Query("time") time:String,
    ): Car
}

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
    val contentlist: List<CookbookItemModel>,
    val currentPage: Int,
    val maxResult: Int,
    val ret_code: Int
)
