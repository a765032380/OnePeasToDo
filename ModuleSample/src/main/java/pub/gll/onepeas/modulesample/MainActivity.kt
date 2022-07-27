package pub.gll.onepeas.modulesample

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pub.gll.onepeas.modulesample.state.examples.HelloComposeSateActivity
import pub.gll.onepeas.modulesample.state.examples.StateRecoveryListSaverActivity
import pub.gll.onepeas.modulesample.state.examples.StateRecoveryMapSaverActivity
import pub.gll.onepeas.modulesample.state.examples.StateRecoveryParcelableActivity
import pub.gll.onepeas.modulesample.state.todo.TodoActivity
import pub.gll.onepeas.modulesample.theming.ThemingActivity

class MainActivity: ComponentActivity() {
    val list = arrayListOf(
        TestListBean(ContentActivity.ANIMATION_1_1),
        TestListBean(ContentActivity.ANIMATION_1_2),
        TestListBean(ContentActivity.ANIMATION_2_1),
        TestListBean(ContentActivity.ANIMATION_2_2),
        TestListBean(ContentActivity.BASIC),
        TestListBean(ContentActivity.EFFECTS_DERIVEDSTATEOFSAMPLE),
        TestListBean(ContentActivity.EFFECTS_DISPOSABLEEFFECTSAMPLE),
        TestListBean(ContentActivity.EFFECTS_LAUNCHEDEFFECTSAMPLE),
        TestListBean(ContentActivity.EFFECTS_PRODUCESTATESAMPLE),
        TestListBean(ContentActivity.EFFECTS_SCAFFOLDSAMPLE),
        TestListBean(ContentActivity.EFFECTS_REMEMBERUPDATEDSTATESAMPLE),
        TestListBean(ContentActivity.EFFECTS_SIDEEFFECTSAMPLE),
        TestListBean(ContentActivity.EFFECTS_SNAPSHOTFLOWSAMPLE),
        TestListBean(ContentActivity.GESTURE_SAMPLE),
        TestListBean(ContentActivity.LAYOUT_CONSTRAINTLAYOUTCONTENT),
        TestListBean(ContentActivity.LAYOUT_TEXTWITHPADDINGTOBASELINE),
        TestListBean(ContentActivity.LAYOUT_LAYOUTSTUDY),
        TestListBean(ContentActivity.LAYOUT_MYOWNCOLUMN),
        TestListBean(ContentActivity.LAYOUT_PHOTOGRAPHERCARD),
        TestListBean(ContentActivity.LAYOUT_STAGGEREDGRID),
        TestListBean(ContentActivity.LAYOUT_TWOTEXTS),
        TestListBean(ContentActivity.LOCAL_PROVIDER_SAMPLE1),
        TestListBean(ContentActivity.LOCAL_PROVIDER_SAMPLE2),
        TestListBean(ContentActivity.LOCAL_PROVIDER_SAMPLE3),
        TestListBean(ContentActivity.LOCAL_PROVIDER_SAMPLE4),
        TestListBean("Theming", ThemingActivity::class.java),
        TestListBean("TodoActivity", TodoActivity::class.java),
        TestListBean("HelloComposeSateActivity", HelloComposeSateActivity::class.java),
        TestListBean("StateRecoveryListSaverActivity", StateRecoveryListSaverActivity::class.java),
        TestListBean("StateRecoveryMapSaverActivity", StateRecoveryMapSaverActivity::class.java),
        TestListBean("StateRecoveryParcelableActivity", StateRecoveryParcelableActivity::class.java),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestList(list)
        }
    }
    @Composable
    fun TestList(list:List<TestListBean>){
        LazyColumn{
            items(list){
                TestItem(it)
            }

        }
    }

    @Composable
    fun TestItem(testListBean: TestListBean){
        Button(
            modifier = Modifier.fillMaxWidth().padding(16.dp),onClick = {
                if(testListBean.activity==null){
                    val intent = Intent(this, ContentActivity::class.java)
                    intent.putExtra("title",testListBean.title)
                    startActivity(intent)
                }else {
                    startActivity(Intent(this, testListBean.activity))
                }
        }) {
            Text(text = testListBean.title)
        }
    }
}

data class TestListBean(val title:String,val activity:Class<out ComponentActivity>?=null)