package pub.gll.onepeas.module.esp8266.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.google.accompanist.pager.ExperimentalPagerApi
import com.tencent.smtt.sdk.*
import pub.gll.onepeas.libbase.arouter.ARouterPath
import pub.gll.onepeas.libbase.util.StatusBarUtil
import pub.gll.onepeas.module.esp8266.wifi.WifiPage


@Route(path = ARouterPath.ESP_8266)
class Esp8266Activity : AppCompatActivity() {


    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.setStatusBarDarkTheme(this,true)
        setContent {
            WifiPage()
        }
    }
}