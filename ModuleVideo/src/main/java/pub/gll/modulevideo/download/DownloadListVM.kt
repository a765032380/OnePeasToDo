package pub.gll.modulevideo.download

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeffmony.downloader.VideoDownloadManager
import com.jeffmony.downloader.listener.DownloadListener
import com.jeffmony.downloader.listener.IDownloadInfosCallback
import com.jeffmony.downloader.model.VideoTaskItem
import com.jeffmony.downloader.model.VideoTaskState
import com.jeffmony.downloader.utils.LogUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


class DownloadListVM  @Inject constructor() : ViewModel() {
    val TAG ="DownloadListVM"
    val uiState  = MutableStateFlow<UiState>(UiState.Loading)
    var list = mutableListOf<VideoTaskItem>()
    val videoTaskList =  mutableStateListOf<VideoTaskItem>()

    fun close() {
        VideoDownloadManager.getInstance().removeDownloadInfosCallback(iDownloadInfosCallback)
    }
    fun getData(){
        VideoDownloadManager.getInstance().fetchDownloadItems(iDownloadInfosCallback)
        VideoDownloadManager.getInstance().setGlobalDownloadListener(downloadListener)
    }

    fun download(item:VideoTaskItem){
        if (item.isInitialTask) {
            VideoDownloadManager.getInstance().startDownload(item)
        } else if (item.isRunningTask) {
            VideoDownloadManager.getInstance().pauseDownloadTask(item.url)
        } else if (item.isInterruptTask) {
            VideoDownloadManager.getInstance().resumeDownload(item.url)
        }
    }
    fun delete(item:VideoTaskItem){
        VideoDownloadManager.getInstance().deleteVideoTask(item,true)
        videoTaskList.remove(item)
    }


    private val iDownloadInfosCallback: IDownloadInfosCallback = IDownloadInfosCallback {
        if (it!=null) {
            videoTaskList.addAll(it.filter {
                it.taskState != VideoTaskState.DEFAULT
            })
            uiState.tryEmit(UiState.Success(it))
        }
    }


    private fun notifyChanged(item: VideoTaskItem?) {
        item?:return
        if (item.taskState == VideoTaskState.DEFAULT){
            videoTaskList.remove(item)
            return
        }
        viewModelScope.launch(Dispatchers.Main) {
            var isHave = false
            val list: List<VideoTaskItem> = videoTaskList.toMutableList().map {
                if (it.url == item.url){
                    isHave = true
                    item
                }else{
                    it
                }
            }
            videoTaskList.clear()
            videoTaskList.addAll(list)
            if (!isHave) {
                videoTaskList.add(item)
            }
        }
    }


    private var mLastProgressTimeStamp: Long = 0
    private var mLastSpeedTimeStamp: Long = 0
    private val downloadListener = object : DownloadListener() {
        override fun onDownloadDefault(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadDefault: $item")
            notifyChanged(item)
        }

        override fun onDownloadPending(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadPending: $item")
            notifyChanged(item)
        }

        override fun onDownloadPrepare(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadPrepare: $item")
            notifyChanged(item)
        }

        override fun onDownloadStart(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadStart: $item")
            notifyChanged(item)
        }

        override fun onDownloadProgress(item: VideoTaskItem?) {
            val currentTimeStamp = System.currentTimeMillis()
            if (currentTimeStamp - mLastProgressTimeStamp > 1000) {
                LogUtils.w(
                    TAG,
                    "onDownloadProgress: " + item?.percentString + ", curTs=" + item?.curTs + ", totalTs=" + item?.totalTs
                )
                notifyChanged(item)
                mLastProgressTimeStamp = currentTimeStamp
            }
        }

        override fun onDownloadSpeed(item: VideoTaskItem?) {
            val currentTimeStamp = System.currentTimeMillis()
            if (currentTimeStamp - mLastSpeedTimeStamp > 1000) {
                notifyChanged(item)
                mLastSpeedTimeStamp = currentTimeStamp
            }
        }

        override fun onDownloadPause(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadPause: " + item?.url)
            notifyChanged(item)
        }

        override fun onDownloadError(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadError: " + item?.url)
            notifyChanged(item)
        }

        override fun onDownloadSuccess(item: VideoTaskItem?) {
            LogUtils.w(TAG, "onDownloadSuccess: $item")
            notifyChanged(item)
        }
    }

}
sealed interface UiState {
    data class Success(val list: List<VideoTaskItem>) : UiState
    object Error : UiState
    object Loading : UiState
}