package pub.gll.modulevideo

import android.os.Bundle
import androidx.activity.compose.setContent
import com.alibaba.android.arouter.facade.annotation.Route
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.libbase.activity.BaseActivity
import pub.gll.onepeas.libbase.arouter.ARouterPath

@AndroidEntryPoint
@Route(path = ARouterPath.VIDEO_LIST)
class VideoListAct: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            VideoHome()
            PreviewVideoItem()
        }
    }
}