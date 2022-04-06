package pub.gll.onepeas.todo

import android.content.Intent
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher

object ActivityResultListenerManager{
    private val list = arrayListOf<IActivityResultListener>()
    var activityResultLauncher: ActivityResultLauncher<Intent>?=null
    fun add(iActivityResultListener: IActivityResultListener){
        if (!list.contains(iActivityResultListener)){
            list.add(iActivityResultListener)
        }
    }
    fun remove(iActivityResultListener: IActivityResultListener){
        if (list.contains(iActivityResultListener)){
            list.remove(iActivityResultListener)
        }
    }
    fun onActivityResult(activityResult: ActivityResult){
        list.forEach {
            it.onActivityResult(activityResult)
        }
    }
}

interface IActivityResultListener {
    fun onActivityResult(activityResult: ActivityResult)
}