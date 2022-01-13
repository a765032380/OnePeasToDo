package pub.gll.onepeas.todo.util

import pub.gll.onepeas.todo.bean.SteeringEngineConfig
import pub.gll.onepeas.todo.bean.UserInfo
import pub.gll.onepeas.todo.data.DataStoreUtils

object SteeringEngineStartEndUtil {
    private const val STEERING_ENGINE_START = "steering_engine_start"
    private const val STEERING_ENGINE_END = "steering_engine_end"
    var start: Int
        get() = DataStoreUtils.readIntData(STEERING_ENGINE_START, 0)
        set(value) = DataStoreUtils.saveSyncIntData(STEERING_ENGINE_START, value = value)

    var end: Int
        get() = DataStoreUtils.readIntData(STEERING_ENGINE_END, 0)
        set(value) = DataStoreUtils.saveSyncIntData(STEERING_ENGINE_END, value = value)

    val steeringEngineConfig: SteeringEngineConfig
        get() = SteeringEngineConfig(start, end)

    fun onStart(start: Int) {
        this.start = start
    }

    fun onEnd(end:Int) {
        this.end = end
    }
}
