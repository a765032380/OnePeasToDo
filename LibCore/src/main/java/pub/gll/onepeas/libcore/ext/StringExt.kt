package pub.gll.onepeas.libcore.ext

import android.util.Base64
import java.util.regex.Pattern


/**
 * unicode转中文
 * @param unicode
 * @return
 */
fun String.byUnicode(): String {
    if (this.isNullOrEmpty()) {
        return ""
    }
    return try {
        val retBuf = StringBuffer()
        val maxLoop = this.length
        var newStr: String = try {
            this.replace("\\\\", "\\")
        } catch (e: Exception) {
            e.printStackTrace()
            this
        }
        var i = 0
        while (i < maxLoop) {
            if (newStr[i] == '\\') {
                if (i < maxLoop - 5 && (newStr[i + 1] == 'u' || this[i + 1] == 'U')) try {
                    retBuf.append(newStr.substring(i + 2, i + 6).toInt(16).toChar())
                    i += 5
                } catch (localNumberFormatException: NumberFormatException) {
                    retBuf.append(newStr[i])
                } else retBuf.append(newStr[i])
            } else {
                retBuf.append(newStr[i])
            }
            i++
        }
        retBuf.toString()
    } catch (e: Exception) {
        e.printStackTrace()
        ""
    }

}

/**
 * 中文转unicode
 *
 * @param string
 * @return
 */
fun String.toUnicode(): String {
    if (this.isNullOrEmpty()) return ""

    return try {
        val unicode = StringBuffer()
        for (element in this) {
            // 取出每一个字符
            val c = element
            // 转换为unicode
            //"\\u只是代号，请根据具体所需添加相应的符号"
            unicode.append("\\u" + Integer.toHexString(c.code))
        }
        unicode.toString()
    } catch (e: Exception) {
        e.printStackTrace()
        ""
    }

}

/**
 * 普通字符串转为Base64字符串
 */
fun CharSequence.toBase64(): String {
    var str = this.toString()
    return Base64.encodeToString(str.toByteArray(), Base64.NO_WRAP)
}

/**
 * Base64字符串转为普通字符串
 */
fun CharSequence.byBase64(): String {
    val str = this.toString()
    return try {
        try {
                str.toLong()
                str
        }catch (e:Exception){
            if (str.isBase64()) {
                String(Base64.decode(str.toByteArray(),Base64.NO_WRAP))
            }else{
                str
            }
        }
    }catch (e: Exception){
        str
    }

}

/**
 * 判断是否是Base64字符串
 */
private fun String.isBase64(): Boolean {
    val base64Pattern =
        "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$"
    return Pattern.matches(base64Pattern, this)
}

/**
 * 手机号中间4位*号显示
 */
fun String.phoneMiddleEncrypt(): String {
    return Regex("(\\d{3})\\d{4}(\\d{4})").replace(this, "$1****$2")
}