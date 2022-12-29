package pub.gll.onepeas.libbase.arouter

import com.alibaba.android.arouter.launcher.ARouter

object Launch {
    fun videoList(){
        ARouter.getInstance()
            .build(ARouterPath.VIDEO_LIST)
            .navigation()
    }
    fun downloadList(){
        ARouter.getInstance()
            .build(ARouterPath.VIDEO_DOWNLOAD_LIST)
            .navigation()
    }
    fun esp8266(){
        ARouter.getInstance()
            .build(ARouterPath.ESP_8266)
            .navigation()
    }
    fun videoPlay(url:String){
        ARouter.getInstance()
            .build(ARouterPath.VIDEO_PLAY)
            .withString("url",url)
            .navigation()
    }
    fun webView(url:String){
        ARouter.getInstance()
            .build(ARouterPath.WEB_ACTIVITY)
            .withString("url",url)
            .navigation()
    }
    fun carCompose(){
        ARouter.getInstance()
            .build(ARouterPath.ACT_CAR_COMPOSE)
            .navigation()
    }
    fun customView(){
        ARouter.getInstance()
            .build(ARouterPath.ACT_CUSTOM_VIEW)
            .navigation()
    }
    fun comicMain(){
        ARouter.getInstance()
            .build(ARouterPath.ACT_COMIC_MAIN)
            .navigation()
    }
}