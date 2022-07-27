package pub.gll.onepeas.modulesample.effects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import pub.gll.onepeas.modulesample.basic.SampleData
import pub.gll.onepeas.modulesample.theme.ComposeStudyTheme

class EffectsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme {

            }
        }
    }
}
