package pub.gll.modulevideo

import android.app.Application
import com.jeffmony.downloader.VideoDownloadManager
import com.jeffmony.downloader.common.DownloadConstants
import com.jeffmony.downloader.utils.VideoStorageUtils
import dagger.hilt.android.HiltAndroidApp
import pub.gll.onepeas.libbase.BaseApp
import java.io.File


class VideoApp : BaseApp() {
    override fun initModuleApp(application: Application) {
        initDownload(application)
    }

    private fun initDownload(application: Application){
        val file: File = VideoStorageUtils.getVideoCacheDir(application)
        if (!file.exists()) {
            file.mkdir()
        }
        val config = VideoDownloadManager.Build(application)
            .setCacheRoot(file.absolutePath)
            .setTimeOut(DownloadConstants.READ_TIMEOUT, DownloadConstants.CONN_TIMEOUT)
            .setConcurrentCount(DownloadConstants.CONCURRENT)
            .setIgnoreCertErrors(false)
            .setShouldM3U8Merged(true)
            .buildConfig()
        VideoDownloadManager.getInstance().initConfig(config)
    }

    override fun initModuleData(application: Application) {

    }
}