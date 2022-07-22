package pub.gll.onepeas.module.comic.comic.home.remote

import pub.gll.onepeas.module.comic.comic.home.model.ComicHomeItemModel
import retrofit2.http.GET
import retrofit2.http.Query

interface ComicHomeService {

    @GET("tpxh")
    suspend fun fetchComicHome(
        @Query("page") page:Int,
        @Query("maxResult") maxResult:Int,
        @Query("appkey") appKey:String,
        @Query("time") time:String,
    ): List<ComicHomeItemModel>
}