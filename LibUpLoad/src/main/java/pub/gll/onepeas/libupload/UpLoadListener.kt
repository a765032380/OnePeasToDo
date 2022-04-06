package pub.gll.onepeas.libupload

interface UpLoadListener {
    fun uploadState(upLoadState: UpLoadState, urlPath:String?=null)
    fun uploadProgress(progress:Int)
}