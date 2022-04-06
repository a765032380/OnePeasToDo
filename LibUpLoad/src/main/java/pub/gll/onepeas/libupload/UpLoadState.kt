package pub.gll.onepeas.libupload

/**
 * 上传状态枚举类型
 */
enum class UpLoadState{
    /**
     * 开始上传
     */
    START,

    /**
     * 上传中
     */
    UPLOADING,

    /**
     * 上传成功
     */
    COMPLETED,

    /**
     * 上传失败
     */
    FAILED,
}