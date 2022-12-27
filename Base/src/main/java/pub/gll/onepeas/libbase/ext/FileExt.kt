package pub.gll.onepeas.libbase.ext

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import android.os.FileUtils
import android.provider.OpenableColumns
import android.webkit.MimeTypeMap
import java.io.File
import java.io.FileOutputStream
import kotlin.random.Random

fun Uri.uriToFileQ(context: Context): File? =
    if (this.scheme == ContentResolver.SCHEME_FILE)
        File(requireNotNull(this.path))
    else if (this.scheme == ContentResolver.SCHEME_CONTENT) {
        //把文件保存到沙盒
        val contentResolver = context.contentResolver
        val displayName = run {
            val cursor = contentResolver.query(this, null, null, null, null)
            cursor?.let {
                if(it.moveToFirst())
                    it.getString(cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME).toInt())
                else null
            }
        }?:"${System.currentTimeMillis()}${Random.nextInt(0, 9999)}.${
            MimeTypeMap.getSingleton()
            .getExtensionFromMimeType(contentResolver.getType(this))}"

        val ios = contentResolver.openInputStream(this)
        if (ios != null) {
            File("${context.externalCacheDir!!.absolutePath}/$displayName")
                .apply {
                    val fos = FileOutputStream(this)
                    FileUtils.copy(ios, fos)
                    fos.close()
                    ios.close()
                }
        } else null
    } else null