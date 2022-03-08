package pub.gll.onepeas.todo.home

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.action.ActionParameters
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.background
import androidx.glance.appwidget.cornerRadius
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import pub.gll.onepeas.todo.R
import pub.gll.onepeas.todo.util.MqttClientUtil
import pub.gll.onepeas.todo.util.SteeringEngineStartEndUtil

class FirstGlanceAppWidget : GlanceAppWidget() {

    @Composable
    fun AppScaffold() {
        Row{
            Image(
                provider = ImageProvider(R.drawable.icon_desktop),
                modifier = GlanceModifier.fillMaxSize()
                    .clickable(actionRunCallback(ActionCallbacks::class.java))
                    .background(day = Color.Transparent, night = Color.Transparent)
                    .cornerRadius(10.dp)
                    .padding(8.dp),
                contentDescription = ""
            )
        }
    }

    @Composable
    override fun Content() {
        AppScaffold()
    }
}
class ActionCallbacks: ActionCallback {
    override suspend fun onRun(context: Context, glanceId: GlanceId, parameters: ActionParameters) {
        if (!MqttClientUtil.isConnected()){
            MqttClientUtil.mqttClient { topic, message ->

            }
        }
        MqttClientUtil.publishStart2End(
            SteeringEngineStartEndUtil.closeStart,
            SteeringEngineStartEndUtil.closeEnd)
    }

}