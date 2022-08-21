package pub.gll.modulevideo.remote

import Json4Kotlin_Base
import pub.gll.modulevideo.model.VideoItemModel
import retrofit2.http.GET
import retrofit2.http.Query

interface VideoService {

    @GET("video/list")
    suspend fun fetchVideo(
        @Query("page") page:Int,
        @Query("key") key:String
    ): Json4Kotlin_Base
}
