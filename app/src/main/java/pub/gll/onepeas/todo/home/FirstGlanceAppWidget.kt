package pub.gll.onepeas.todo.home

import android.content.Context
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.ActionParameters
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.background
import androidx.glance.appwidget.cornerRadius
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.hilt.navigation.compose.hiltViewModel
import pub.gll.onepeas.todo.ui.main.MainActivity
import pub.gll.onepeas.todo.ui.setting.SettingVM
import pub.gll.onepeas.todo.util.MqttClientUtil
import pub.gll.onepeas.todo.util.SteeringEngineStartEndUtil

class FirstGlanceAppWidget : GlanceAppWidget() {

    @Composable
    fun AppScaffold() {
        Button(
            text = "关灯",
            modifier = GlanceModifier.fillMaxSize()
                .background(day = Color.Red, night = Color.Blue)
                .cornerRadius(10.dp)
                .padding(8.dp)
            ,onClick = actionRunCallback(ActionCallbacks::class.java))
    }

    @Composable
    override fun Content() {
        AppScaffold()
    }
}
class ActionCallbacks: ActionCallback {
    override suspend fun onRun(context: Context, glanceId: GlanceId, parameters: ActionParameters) {
        if (MqttClientUtil.isConnected()){
            MqttClientUtil.publishStart2End(
                SteeringEngineStartEndUtil.closeStart,
                SteeringEngineStartEndUtil.closeEnd)
        }else{
            MqttClientUtil.mqttClient { topic, message ->

            }
        }
    }

}