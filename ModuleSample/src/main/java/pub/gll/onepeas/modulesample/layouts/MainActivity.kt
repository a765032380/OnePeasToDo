package pub.gll.onepeas.modulesample.layouts

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import pub.gll.onepeas.modulesample.theme.ComposeStudyTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme {
                /*Surface {
                    TwoTexts(text1 = "Hi", text2 = "there")
                }*/
                LargeConstraintLayout()
            }
        }
    }
}
