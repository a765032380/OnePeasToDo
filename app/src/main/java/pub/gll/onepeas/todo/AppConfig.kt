package pub.gll.onepeas.todo

/**
 * @des 应用配置类   此类中主要进行各个子模块的application配置
 * 如果此模块不进行配置则子模块application不会进行初始化
 */
object AppConfig {
    private const val HOME_APP = "pub.gll.onepeas.module.home.HomeApp"
    private const val COOKBOOK_APP = "pub.gll.onepeas.module.cookbook.CookbookApp"
    private const val VIDEO_APP = "pub.gll.modulevideo.VideoApp"

    var moduleApps = arrayOf(
        HOME_APP,
        COOKBOOK_APP,
        VIDEO_APP,
    )
}