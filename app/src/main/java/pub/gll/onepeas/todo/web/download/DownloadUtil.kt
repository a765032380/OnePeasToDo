package pub.gll.onepeas.todo.web.download

import android.text.TextUtils
import com.jeffmony.downloader.utils.LogUtils
import com.jeffmony.m3u8library.VideoProcessManager
import com.jeffmony.m3u8library.listener.IVideoTransformListener
import java.io.File
import java.text.DecimalFormat


object DownloadUtil {
    val TAG = "DownloadUtil"
    fun doConvertVideo(inputPath: String) {
        if (TextUtils.isEmpty(inputPath)) {
            LogUtils.i(TAG, "InputPath or OutputPath is null")
            return
        }
        val inputFile = File(inputPath)
        if (!inputFile.exists()) {
            return
        }
        val outputPath = inputPath.replace(".m3u8",".mp4")
        val outputFile = File(outputPath)
        if (!outputFile.exists()) {
            try {
                outputFile.createNewFile()
            } catch (e: Exception) {
                LogUtils.w(TAG, "Create file failed, exception = $e")
                return
            }
        }
        LogUtils.i(TAG, "inputPath=$inputPath, outputPath=$outputPath")
        VideoProcessManager.getInstance()
            .transformM3U8ToMp4(inputPath, outputPath, object : IVideoTransformListener {
                override fun onTransformProgress(progress: Float) {
                    LogUtils.i(TAG, "onTransformProgress progress=$progress")
                }

                override fun onTransformFinished() {
                    LogUtils.i(TAG, "onTransformFinished")
                }

                override fun onTransformFailed(e: Exception) {
                    LogUtils.i(TAG, "onTransformFailed, e=" + e.message)
                }
            })
    }
}

