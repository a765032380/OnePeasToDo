package pub.gll.onepeas.todo.util

import pub.gll.onepeas.todo.bean.SteeringEngineConfig
import pub.gll.onepeas.libbase.di.http.DataStoreUtils

object SteeringEngineStartEndUtil {
    private const val STEERING_ENGINE_OPEN_START = "steering_engine_open_start"
    private const val STEERING_ENGINE_OPEN_END = "steering_engine_open_end"

    private const val STEERING_ENGINE_CLOSE_START = "steering_engine_close_start"
    private const val STEERING_ENGINE_CLOSE_END = "steering_engine_close_end"

    var openStart: Int
        get() = DataStoreUtils.readIntData(STEERING_ENGINE_OPEN_START, 0)
        set(value) = DataStoreUtils.saveSyncIntData(STEERING_ENGINE_OPEN_START, value = value)

    var openEnd: Int
        get() = DataStoreUtils.readIntData(STEERING_ENGINE_OPEN_END, 0)
        set(value) = DataStoreUtils.saveSyncIntData(STEERING_ENGINE_OPEN_END, value = value)

    var closeStart: Int
        get() = DataStoreUtils.readIntData(STEERING_ENGINE_CLOSE_START, 56)
        set(value) = DataStoreUtils.saveSyncIntData(STEERING_ENGINE_CLOSE_START, value = value)

    var closeEnd: Int
        get() = DataStoreUtils.readIntData(STEERING_ENGINE_CLOSE_END, 94)
        set(value) = DataStoreUtils.saveSyncIntData(STEERING_ENGINE_CLOSE_END, value = value)

    val steeringEngineStartConfig: SteeringEngineConfig
        get() = SteeringEngineConfig(openStart, openEnd)

    val steeringEngineEndConfig: SteeringEngineConfig
        get() = SteeringEngineConfig(openStart, openEnd)

    fun onOpenStart(start: Int) {
        this.openStart = start
    }

    fun onOpenEnd(end:Int) {
        this.openEnd = end
    }
    fun onCloseStart(start: Int) {
        this.closeStart = start
    }

    fun onCloseEnd(end:Int) {
        this.closeEnd = end
    }
}
