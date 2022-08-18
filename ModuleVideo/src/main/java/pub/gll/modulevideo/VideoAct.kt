package pub.gll.modulevideo

import android.os.Bundle
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.libbase.activity.BaseActivity

@AndroidEntryPoint
class VideoAct: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VideoHome()
        }
    }
}