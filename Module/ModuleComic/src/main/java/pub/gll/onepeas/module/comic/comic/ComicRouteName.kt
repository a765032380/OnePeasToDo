package pub.gll.onepeas.module.comic.comic

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import pub.gll.onepeas.module.comic.R

object ComicRouteName {
    const val COMIC_HOME = "comic_home"
    const val COMIC_BOOKSHELF = "comic_bookshelf"
    const val COMIC_MINE = "comic_mine"
}
sealed class ComicBottomNavRoute(
    var routeName: String,
    @StringRes var stringId: Int,
    var icon: ImageVector
) {
    object Home: ComicBottomNavRoute(ComicRouteName.COMIC_HOME, R.string.home, Icons.Default.Home)
    object BOOKSHELF: ComicBottomNavRoute(ComicRouteName.COMIC_BOOKSHELF, R.string.bookshelf, Icons.Default.Build)
    object MINE: ComicBottomNavRoute(ComicRouteName.COMIC_MINE, R.string.profile, Icons.Default.Person)
}