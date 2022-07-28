package pub.gll.onepeas.libcore.ext

import android.app.Activity
import android.view.View
import android.view.WindowManager
import pub.gll.onepeas.libbase.util.StatusBarUtil


fun Activity.setAppStatusBar(fitSystemWindows:Boolean=true, isBarDarkTheme:Boolean = true) {
    //当FitsSystemWindows设置 true 时，会在屏幕最上方预留出状态栏高度的 padding
    pub.gll.onepeas.libbase.util.StatusBarUtil.setRootViewFitsSystemWindows(this, fitSystemWindows)
    //设置状态栏透明
    pub.gll.onepeas.libbase.util.StatusBarUtil.setTranslucentStatus(this)
    //一般的手机的状态栏文字和图标都是白色的, 可如果你的应用也是纯白色的, 或导致状态栏文字看不清
    //所以如果你是这种情况,请使用以下代码, 设置状态使用深色文字图标风格, 否则你可以选择性注释掉这个if内容
    if (isBarDarkTheme) {
        if (!pub.gll.onepeas.libbase.util.StatusBarUtil.setStatusBarDarkTheme(this, true)) {
            //这样半透明+白=灰, 状态栏的文字能看得清
            pub.gll.onepeas.libbase.util.StatusBarUtil.setStatusBarColor(this, -0x1000000)
        }
    }
}

fun Activity.setAppStatusBarFull() {
    window?.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
    // 全屏显示，隐藏状态栏和导航栏，拉出状态栏和导航栏显示一会儿后消失。
    window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)


    //当FitsSystemWindows设置 true 时，会在屏幕最上方预留出状态栏高度的 padding
    pub.gll.onepeas.libbase.util.StatusBarUtil.setRootViewFitsSystemWindows(this, true)
    //设置状态栏透明
    pub.gll.onepeas.libbase.util.StatusBarUtil.setTranslucentStatus(this)
    //一般的手机的状态栏文字和图标都是白色的, 可如果你的应用也是纯白色的, 或导致状态栏文字看不清
    //所以如果你是这种情况,请使用以下代码, 设置状态使用深色文字图标风格, 否则你可以选择性注释掉这个if内容
    if (!pub.gll.onepeas.libbase.util.StatusBarUtil.setStatusBarDarkTheme(this, true)) {
        //这样半透明+白=灰, 状态栏的文字能看得清
        pub.gll.onepeas.libbase.util.StatusBarUtil.setStatusBarColor(this, -0x1000000)
    }
}