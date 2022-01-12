package pub.gll.onepeas.todo.data.http

import pub.gll.onepeas.todo.bean.BasicBean
import pub.gll.onepeas.todo.bean.UserInfo
import retrofit2.http.*

/**
 * 网络请求接口
 * 注意：接口前无需加斜杠
 * create by Mqz at 4/19
 */
interface HttpService {

    companion object {
        const val url = "https://www.wanandroid.com"
    }


    @FormUrlEncoded
    @POST("user/login")
    suspend fun login(
        @Field("phone") phone:String,
        @Field("password") password:String,
    ): BasicBean<UserInfo?>
}
