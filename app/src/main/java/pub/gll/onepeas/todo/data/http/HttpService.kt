package pub.gll.onepeas.todo.data.http

import pub.gll.onepeas.todo.bean.BasicBean
import pub.gll.onepeas.todo.bean.UserInfo
import retrofit2.Call
import retrofit2.http.*

/**
 * 网络请求接口
 * 注意：接口前无需加斜杠
 * create by Mqz at 4/19
 */
interface HttpService {

    companion object {
        const val isDebug = true
//        const val url = "https://new.gll.pub/api/"
//        const val debugUrl = "http://127.0.0.1:8081/api/"
        const val url = "https://way.jd.com/showapi/"
        const val debugUrl = "https://way.jd.com/showapi/"
    }

    @FormUrlEncoded
    @POST("user/login")
    suspend fun login(
        @Field("phone") phone:String,
        @Field("password") password:String,
    ): BasicBean<UserInfo>

    @FormUrlEncoded
    @POST("user/select")
    suspend fun select(
        @Field("uuid") uuid: String
    ):  BasicBean<UserInfo>

    @POST("user/user_info")
    suspend fun userInfo(
    ):  BasicBean<UserInfo>

    @POST("user/update")
    suspend fun updateUser(
        @Body body: Map<String, String>
    ):  BasicBean<UserInfo>
}
