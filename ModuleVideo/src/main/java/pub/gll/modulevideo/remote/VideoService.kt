package pub.gll.modulevideo.remote

import android.provider.MediaStore.Video
import pub.gll.modulevideo.model.VideoItemModel
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoService {

    @GET("tpxh")
    suspend fun fetchVideo(
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
    val contentlist: List<VideoItemModel>,
    val currentPage: Int,
    val maxResult: Int,
    val ret_code: Int
)
