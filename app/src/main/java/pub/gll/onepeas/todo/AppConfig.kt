package pub.gll.onepeas.todo

/**
 * @author Elsen
 * @date 2020年11月24日
 * @des 应用配置类   此类中主要进行各个子模块的application配置
 * 如果此模块不进行配置则子模块application不会进行初始化
 */
object AppConfig {
    private const val HOME_APP = "pub.gll.onepeas.module.home.HomeApp"
    private const val MINE_APP = "pub.gll.onepeas.module.mine.MineApp"
    var moduleApps = arrayOf(
        HOME_APP,
        MINE_APP,
    )
}