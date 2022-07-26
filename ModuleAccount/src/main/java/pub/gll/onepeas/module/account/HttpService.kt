package pub.gll.onepeas.module.account

import pub.gll.onepeas.libbase.di.http.result.BasicBean
import pub.gll.onepeas.libbase.util.UserInfo
import pub.gll.onepeas.libnet.NetworkResult
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * 网络请求接口
 * 注意：接口前无需加斜杠
 * create by Mqz at 4/19
 */
interface HttpService {

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
    ): BasicBean<UserInfo>

    @POST("user/user_info")
    suspend fun userInfo(
    ): BasicBean<UserInfo>

    @POST("user/update")
    suspend fun updateUser(
        @Body body: Map<String, String>
    ): BasicBean<UserInfo>

    @POST("/friend/list")
    suspend fun requestFriend(

    ): NetworkResult<Any>
}
