package pub.gll.onepeas.module.account

import retrofit2.http.GET

interface VideoService {

    @GET("/%E6%81%8B%E4%B8%8A%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%28%E7%AC%AC%E4%B8%89%E5%AD%A3%29%E7%AD%89%E5%A4%9A%E4%B8%AA%E6%96%87%E4%BB%B6/%E6%81%8B%E4%B8%8A%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%28%E7%AC%AC%E4%BA%8C%E5%AD%A3%29/1.%E8%A7%86%E9%A2%91/")
    suspend fun getlist(): Any

}