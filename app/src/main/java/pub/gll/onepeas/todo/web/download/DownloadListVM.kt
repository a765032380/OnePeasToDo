package pub.gll.onepeas.todo.web.download

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeffmony.downloader.VideoDownloadManager
import com.jeffmony.downloader.listener.DownloadListener
import com.jeffmony.downloader.listener.IDownloadInfosCallback
import com.jeffmony.downloader.model.VideoTaskItem
import com.jeffmony.downloader.utils.LogUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


class DownloadListVM  @Inject constructor() : ViewModel() {
    val TAG ="LLLLL"
    val uiState  = MutableStateFlow<UiState>(UiState.Loading)
    var list = mutableListOf<VideoTaskItem>()

    override fun onCleared() {
        super.onCleared()
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
    }


    private val iDownloadInfosCallback: IDownloadInfosCallback = IDownloadInfosCallback {
        list = it
        uiState.tryEmit(UiState.Success(it))
    }


    private fun notifyChanged(item: VideoTaskItem) {
        viewModelScope.launch {
            val newList = arrayListOf<VideoTaskItem>()
            var isHave = false
            list.forEach {
                if(it.url == item.url){
                    isHave = true
                    newList.add(item)
                }else{
                    newList.add(it)
                }
            }
            if(!isHave){
                newList.add(item)
            }
            list = newList
            uiState.tryEmit(UiState.Success(newList))
        }
    }


    private var mLastProgressTimeStamp: Long = 0
    private var mLastSpeedTimeStamp: Long = 0
    private val downloadListener = object : DownloadListener() {
        override fun onDownloadDefault(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadDefault: $item")
            notifyChanged(item)
        }

        override fun onDownloadPending(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadPending: $item")
            notifyChanged(item)
        }

        override fun onDownloadPrepare(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadPrepare: $item")
            notifyChanged(item)
        }

        override fun onDownloadStart(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadStart: $item")
            notifyChanged(item)
        }

        override fun onDownloadProgress(item: VideoTaskItem) {
            val currentTimeStamp = System.currentTimeMillis()
            if (currentTimeStamp - mLastProgressTimeStamp > 1000) {
                LogUtils.w(
                    TAG,
                    "onDownloadProgress: " + item.percentString + ", curTs=" + item.curTs + ", totalTs=" + item.totalTs
                )
                notifyChanged(item)
                mLastProgressTimeStamp = currentTimeStamp
            }
        }

        override fun onDownloadSpeed(item: VideoTaskItem) {
            val currentTimeStamp = System.currentTimeMillis()
            if (currentTimeStamp - mLastSpeedTimeStamp > 1000) {
                notifyChanged(item)
                mLastSpeedTimeStamp = currentTimeStamp
            }
        }

        override fun onDownloadPause(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadPause: " + item.url)
            notifyChanged(item)
        }

        override fun onDownloadError(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadError: " + item.url)
            notifyChanged(item)
        }

        override fun onDownloadSuccess(item: VideoTaskItem) {
            LogUtils.w(TAG, "onDownloadSuccess: $item")
            notifyChanged(item)
            DownloadUtil.doConvertVideo(item.filePath)
        }
    }

}
sealed interface UiState {
    data class Success(val list: List<VideoTaskItem>) : UiState
    object Error : UiState
    object Loading : UiState
}