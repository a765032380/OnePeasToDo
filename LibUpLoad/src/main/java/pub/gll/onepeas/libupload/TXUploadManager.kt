package pub.gll.onepeas.libupload

import android.content.Context
import com.tencent.cos.xml.CosXmlServiceConfig
import com.tencent.cos.xml.CosXmlSimpleService
import com.tencent.cos.xml.exception.CosXmlClientException
import com.tencent.cos.xml.exception.CosXmlServiceException
import com.tencent.cos.xml.listener.CosXmlResultListener
import com.tencent.cos.xml.model.CosXmlRequest
import com.tencent.cos.xml.model.CosXmlResult
import com.tencent.cos.xml.transfer.TransferConfig
import com.tencent.cos.xml.transfer.TransferManager
import com.tencent.qcloud.core.auth.QCloudCredentialProvider
import com.tencent.qcloud.core.auth.ShortTimeCredentialProvider
import java.io.File
import kotlin.math.roundToInt


object TXUploadManager {
    var upLoadListener : UpLoadListener?=null

    private const val SECRET_ID = "AKIDtDIyShFpKcfS2VGojTEl37qMfnZDYjfP"
    private const val SECRET_KEY = "jHeeV7TaVRGr5E8lAGBtOky0mKdkjqQx"
    private const val BUCKET = "test-1251228670"
    private const val REGION = "ap-beijing-1"
    private const val KEY_DURATION = 3000L

    private fun initCos(context: Context,sourceFile: File){
        // keyDuration 为请求中的密钥有效期，单位为秒
        val myCredentialProvider: QCloudCredentialProvider =
            ShortTimeCredentialProvider(SECRET_ID, SECRET_KEY, KEY_DURATION)
        // 创建 CosXmlServiceConfig 对象，根据需要修改默认的配置参数
        val serviceConfig = CosXmlServiceConfig.Builder()
            .setRegion(REGION)
            .isHttps(true) // 使用 HTTPS 请求, 默认为 HTTP 请求
            .builder()
        // 初始化 COS Service，获取实例
        val cosXmlService = CosXmlSimpleService(
            context,
            serviceConfig,
            myCredentialProvider
        )
        uploadFile(cosXmlService,sourceFile)
    }


    fun upload(context: Context, fileType: FileType, sourceFile: File) {
        upLoadListener?.uploadState(UpLoadState.START)
        when(fileType){
            FileType.Image->{
                initCos(context,sourceFile)
            }
            FileType.Log->{
                initCos(context,sourceFile)
            }
        }

    }

    private fun uploadFile(cosXmlService:CosXmlSimpleService,sourceFile: File) {
        // 初始化 TransferConfig，这里使用默认配置，如果需要定制，请参考 SDK 接口文档
        val transferConfig = TransferConfig
            .Builder()
            .build()
        // 初始化 TransferManager
        val transferManager = TransferManager(
            cosXmlService,
            transferConfig
        )
        val cosPath = "image"+"/"+sourceFile.name//对象在存储桶中的位置标识符，即称对象键
        // 若存在初始化分块上传的 UploadId，则赋值对应的 uploadId 值用于续传；否则，赋值 null。
        var uploadId: String? = null
        // 上传文件
        val cosXmlUploadTask = transferManager.upload(
            BUCKET, cosPath,
            sourceFile.toString(), uploadId
        )
        //设置上传进度回调，这里可以拿到 uploadId 用于续传
        cosXmlUploadTask.setCosXmlProgressListener { complete, target ->
            uploadId = cosXmlUploadTask.uploadId
            val progress :Int = (complete.toDouble()/target.toDouble() * 100).roundToInt()
            upLoadListener?.uploadProgress(progress)
            upLoadListener?.uploadState(UpLoadState.UPLOADING)
        }

        //设置返回结果回调
        cosXmlUploadTask.setCosXmlResultListener(object : CosXmlResultListener {
            override fun onSuccess(request: CosXmlRequest, result: CosXmlResult) {
                upLoadListener?.uploadState(UpLoadState.COMPLETED,cosPath)
            }

            override fun onFail(
                request: CosXmlRequest,
                clientException: CosXmlClientException?,
                serviceException: CosXmlServiceException?
            ) {
                upLoadListener?.uploadState(UpLoadState.FAILED)
                clientException?.printStackTrace()
                serviceException?.printStackTrace()
            }
        })
    }
}