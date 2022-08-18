package pub.gll.modulevideo

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.compose.rememberImagePainter
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import pub.gll.modulevideo.model.VideoItemModel
import pub.gll.modulevideo.vm.VideoVM

@Composable
fun VideoHome(homeViewModel: VideoVM = hiltViewModel()) {
    val refreshState = rememberSwipeRefreshState(isRefreshing = false)
    val data = homeViewModel.data.collectAsLazyPagingItems()
    refreshState.isRefreshing = data.loadState.refresh is LoadState.Loading

    SwipeRefresh(
        state = refreshState,
        modifier = Modifier.fillMaxSize(),
        onRefresh = {
        data.refresh()
    }) {
        Greeting(data = data){

        }
    }

}
@Composable
fun Greeting(data: LazyPagingItems<VideoItemModel>, goImagePreview:(icon:String?)->Unit) {
    LazyColumn(state = rememberLazyListState()) {
        items(items = data) { item ->
            Message(data = item,goImagePreview)
        }
        when (data.loadState.append) {
            is LoadState.Loading -> {//加载中的尾部item展示
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "加载中...")
                    }
                }
            }
            is LoadState.Error->{
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "--加载错误--")
                    }
                }
            }
            else -> {//加载完成或者加载错误展示的尾部item
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
//                            Text(text = "--加载完成或加载错误--")
                    }
                }
            }
        }
    }
}
@Composable
fun Message(data: VideoItemModel?,goImagePreview:(icon:String?)->Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxSize(),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier.padding(10.dp)
            .clickable {
                goImagePreview(data?.icon)
            }) {
            Image(modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
                painter = rememberImagePainter(data = data?.icon,
                    builder = {
                        crossfade(true)
                    }), contentDescription = null)
            Text(
                text = "${data?.name}"
            )
        }
    }
}