package pub.gll.onepeas.todo.util

import android.text.TextUtils
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tencent.mmkv.MMKV
import pub.gll.onepeas.todo.bean.UserInfo

object CacheUtil {
    /**
     * 获取保存的账户信息
     */
    fun getUser(): UserInfo? {
        val kv = MMKV.mmkvWithID("app")
        val userStr = kv.decodeString("user")
        return if (TextUtils.isEmpty(userStr)) {
           null
        } else {
            Gson().fromJson(userStr, UserInfo::class.java)
        }
    }
    fun getUID(): Int {
        val kv = MMKV.mmkvWithID("app")
        val userStr = kv.decodeString("user")
        return if (TextUtils.isEmpty(userStr)) {
           0
        } else {
            Gson().fromJson(userStr, UserInfo::class.java).id
        }
    }
    fun getUname(): String {
        val kv = MMKV.mmkvWithID("app")
        val userStr = kv.decodeString("user")
        return if (TextUtils.isEmpty(userStr)) {
           ""
        } else {
            Gson().fromJson(userStr, UserInfo::class.java).uname
        }
    }

    /**
     * 设置账户信息
     */
    fun setUser(userResponse: UserInfo?) {
        val kv = MMKV.mmkvWithID("app")
        if (userResponse == null) {
            kv.encode("user", "")
            setIsLogin(false)
        } else {
            kv.encode("user", Gson().toJson(userResponse))
            setIsLogin(true)
        }

    }

    /**
     * 是否已经登录
     */
    fun isLogin(): Boolean {
        val kv = MMKV.mmkvWithID("app")
        return kv.decodeBool("login", false)
    }

    /**
     * 设置是否已经登录
     */
    fun setIsLogin(isLogin: Boolean) {
        val kv = MMKV.mmkvWithID("app")
        kv.encode("login", isLogin)
    }

    /**
     * 是否是第一次登陆
     */
    fun isFirst(): Boolean {
        val kv = MMKV.mmkvWithID("app")
        return kv.decodeBool("first", true)
    }
    /**
     * 是否是第一次登陆
     */
    fun setFirst(first:Boolean): Boolean {
        val kv = MMKV.mmkvWithID("app")
        return kv.encode("first", first)
    }

    /**
     * 首页是否开启获取指定文章
     */
    fun isNeedTop(): Boolean {
        val kv = MMKV.mmkvWithID("app")
        return kv.decodeBool("top", true)
    }
    /**
     * 设置首页是否开启获取指定文章
     */
    fun setIsNeedTop(isNeedTop:Boolean): Boolean {
        val kv = MMKV.mmkvWithID("app")
        return kv.encode("top", isNeedTop)
    }
    /**
     * 获取搜索历史缓存数据
     */
    fun getSearchHistoryData(): ArrayList<String> {
        val kv = MMKV.mmkvWithID("cache")
        val searchCacheStr =  kv.decodeString("history")
        if (!TextUtils.isEmpty(searchCacheStr)) {
            return Gson().fromJson(searchCacheStr
                , object : TypeToken<ArrayList<String>>() {}.type)
        }
        return arrayListOf()
    }

    fun setSearchHistoryData(searchResponseStr: String) {
        val kv = MMKV.mmkvWithID("cache")
        kv.encode("history",searchResponseStr)
    }

    fun setFriends(userId:Int){
        val kv = MMKV.mmkvWithID("cache")
        val list = getFriends()
        list.add(userId)
        val json =Gson().toJson(list)
        kv.encode("friends",json )
    }
    fun removeFriends(userId:Int){
        val kv = MMKV.mmkvWithID("cache")
        val list = getFriends()
        list.remove(userId)
        val json =Gson().toJson(list)
        kv.encode("friends",json )
    }
    fun isFriends(userId:Int):Boolean{
        getFriends().forEach {
            if (it == userId){
                return true
            }
        }
        return false
    }


    fun getFriends():MutableList<Int>{
        val kv = MMKV.mmkvWithID("cache")
        if (kv.getString("friends","")==""){
            return arrayListOf()
        }
        val json = kv.getString("friends","")
        if (json !is String){
            return arrayListOf()
        }
        return Gson().fromJson(json,object : TypeToken<ArrayList<Int>>() {}.type)
    }


}