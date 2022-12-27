package pub.gll.onepeas.libbase.ext


/**
 * @desc 表情符号
 * @author derekyan
 * @date 2021/2/7
 */
fun getSafeEmojiStrBySubStr(str: String?, lastIndex: Int): String? {
    if (str == null)
        return ""
    if (str.length < lastIndex)
        return str
    val subStr = str.substring(0, lastIndex)
    // 截取后得字符串不包含表情
    if (noContainsEmoji(subStr))
        return subStr
    // 最后一个字符不是表情符号
    if (!isEmojiCharacter(subStr.last()))
        return subStr
    // 表情字符们
    val emojiChars = getEmojiChar(subStr)
    // 表情字符串是偶数 说明subStr里得表情是完整的 没有截取坏
    if (emojiChars.length and 1 == 0)
        return subStr
    // 最后一个是表情符号 先移除掉
    return subStr.substring(0, lastIndex - 1)
}

/**
 * 字符串中的表情符号
 */
fun getEmojiChar(str: String): String {
    val len = str.length
    val emojiSb = StringBuilder()
    for (i in 0 until len) {
        if (isEmojiCharacter(str[i])) {
            emojiSb.append(str[i])
        }
    }
    return emojiSb.toString()
}

/**
 * 不包含表情
 */
fun noContainsEmoji(str: String): Boolean { //真为不含有表情
    val len = str.length
    for (i in 0 until len) {
        if (isEmojiCharacter(str[i])) {
            return false
        }
    }
    return true
}

/**
 * 是否是表情符号
 */
fun isEmojiCharacter(codePoint: Char): Boolean {
    return !(codePoint.code == 0x0 ||
            codePoint.code == 0x9 ||
            codePoint.code == 0xA ||
            codePoint.code == 0xD ||
            codePoint.code in 0x20..0xD7FF ||
            codePoint.code in 0xE000..0xFFFD ||
            codePoint.code in 0x10000..0x10FFFF)
}