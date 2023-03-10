package pub.gll.onepeas.module.cookbook

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
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import pub.gll.onepeas.module.cookbook.model.CookbookItemModel
import pub.gll.onepeas.module.cookbook.vm.CookbookVM

@Composable
fun CookBookHome(homeViewModel: CookbookVM = hiltViewModel()) {
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
fun Greeting(data: LazyPagingItems<CookbookItemModel>, goImagePreview:(icon:String?)->Unit) {
//    VerticalPager(count = data.itemCount) {page ->
//        Message(data = data[page],goImagePreview)
//    }
//    HorizontalPager(count = data.itemCount) {page ->
//        Message(data = data[page],goImagePreview)
//    }
    LazyColumn(state = rememberLazyListState()) {
        items(items = data) { item ->
            Message(data = item,goImagePreview)
        }
        when (data.loadState.append) {
            is LoadState.Loading -> {//??????????????????item??????
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "?????????...")
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
                        Text(text = "--????????????--")
                    }
                }
            }
            else -> {//?????????????????????????????????????????????item
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        contentAlignment = Alignment.Center
                    ) {
//                            Text(text = "--???????????????????????????--")
                    }
                }
            }
        }
    }
}
@OptIn(ExperimentalCoilApi::class)
@Composable
fun Message(data: CookbookItemModel?,goImagePreview:(icon:String?)->Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxSize(),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Image(modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clickable {
                    goImagePreview(data?.icon)
                },
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