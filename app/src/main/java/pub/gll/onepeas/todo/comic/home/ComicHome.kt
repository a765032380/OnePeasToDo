package pub.gll.onepeas.todo.comic.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import pub.gll.onepeas.todo.comic.home.vm.ComicHomeVM

@Composable
fun ComicHome(homeViewModel: ComicHomeVM = hiltViewModel()) {
    val refreshState = rememberSwipeRefreshState(isRefreshing = false)
    val data = homeViewModel.data.collectAsLazyPagingItems()
    refreshState.isRefreshing = data.loadState.refresh is LoadState.Loading
    SwipeRefresh(state = refreshState, onRefresh = {
        data.refresh()
    }) {
        LazyColumn{

        }
    }

}

@Composable
fun HomeBanner(){

}