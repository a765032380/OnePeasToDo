package pub.gll.modulevideo.init

import android.content.Context
import androidx.startup.Initializer
import com.jeffmony.downloader.VideoDownloadManager
import com.jeffmony.downloader.common.DownloadConstants
import com.jeffmony.downloader.utils.VideoStorageUtils
import pub.gll.onepeas.lib.log.HiLog
import java.io.File

class VideoInitializer:Initializer<Unit> {
    override fun create(context: Context) {
        HiLog.e("VideoModule init" )
        initDownload(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }

    private fun initDownload(context: Context){
        val file: File = VideoStorageUtils.getVideoCacheDir(context)
        if (!file.exists()) {
            file.mkdir()
        }
        val config = VideoDownloadManager.Build(context)
            .setCacheRoot(file.absolutePath)
            .setTimeOut(DownloadConstants.READ_TIMEOUT, DownloadConstants.CONN_TIMEOUT)
            .setConcurrentCount(DownloadConstants.CONCURRENT)
            .setIgnoreCertErrors(false)
            .setShouldM3U8Merged(true)
            .buildConfig()
        VideoDownloadManager.getInstance().initConfig(config)
    }

}