package pub.gll.modulevideo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.decode.VideoFrameDecoder
import coil.request.Parameters
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import kotlinx.coroutines.launch
import org.koin.ext.scope
import pub.gll.modulevideo.model.VideoItemModel
import pub.gll.modulevideo.video.icons.PlayArrow
import pub.gll.modulevideo.vm.VideoVM
import pub.gll.onepeas.libbase.Test
import pub.gll.onepeas.libbase.arouter.Launch

@Composable
fun VideoHome(lazyListState:LazyListState) {
    val homeViewModel: VideoVM = hiltViewModel()
    val refreshState = rememberSwipeRefreshState(isRefreshing = false)

    val coroutineScope = rememberCoroutineScope()
    val data = homeViewModel.data.collectAsLazyPagingItems()
    refreshState.isRefreshing = data.loadState.refresh is LoadState.Loading

    Box {
        SwipeRefresh(
            state = refreshState,
            modifier = Modifier.fillMaxSize(),
            onRefresh = {
                data.refresh()
            }) {
            Greeting(data = data, lazyListState)
        }
        AnimatedVisibility(
            visible = lazyListState.isScrollingUp(),
            enter = slideInVertically(
                // Enters by sliding in from offset -fullHeight to 0.
                initialOffsetY = { fullHeight -> -fullHeight },
                animationSpec = tween(durationMillis = 150, easing = LinearOutSlowInEasing)
            ),
            exit = slideOutVertically(
                // Exits by sliding out from offset 0 to -fullHeight.
                targetOffsetY = { fullHeight -> -fullHeight },
                animationSpec = tween(durationMillis = 250, easing = FastOutLinearInEasing)
            )
        ) {
            OutlinedTextField(value = homeViewModel.key.value, onValueChange = {
                homeViewModel.key.value = it
                homeViewModel.refresh()
            }, modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(start = 16.dp, end = 16.dp), label = {
                androidx.compose.material3.Text("搜索")
            })
        }
    }
}
@Composable
fun PreviewVideoItem(){
    val videoItemModel = VideoItemModel(1,"1","复仇者联盟",Test.TEST_MP4_URL,Test.TEST_MP4_URL)
    VideoItem(videoItemModel)
}

@Composable
fun Greeting(data: LazyPagingItems<VideoItemModel>,lazyListState: LazyListState) {
    LazyColumn(state = lazyListState) {
        item { 
            Spacer(modifier = Modifier.height(80.dp))
        }
        items(items = data) { item ->
            VideoItem(data = item)
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
fun VideoItem(data: VideoItemModel?) {
    Card(
        modifier = Modifier
            .padding(5.dp),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier
            .padding(10.dp)
            .clickable {
                data?.url?.let { Launch.videoPlay("${Test.BASE_VIDEO_URL}$it") }
            }) {
//            val videoFrameMicros = Random.nextLong(62_000_000L)
            val videoFrameMicros = 5_000_000L
            val parameters = Parameters.Builder()
                .set(VideoFrameDecoder.VIDEO_FRAME_MICROS_KEY, videoFrameMicros)
                .build()
            Icon(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Gray.copy(alpha = 0.5f))
                    .height(300.dp),
                imageVector = Icons.Rounded.PlayArrow,
                contentDescription ="" )

//            AsyncImage(modifier = Modifier
//                .fillMaxWidth()
//                .clip(RoundedCornerShape(5.dp))
//                .height(300.dp),
//                contentScale = ContentScale.FillWidth,
//                model = ImageRequest.Builder(LocalContext.current)
//                        .apply(block = fun ImageRequest.Builder.() {
//                            data(data = data?.icon)
//                            parameters(parameters = parameters)
//                        })
//                        .build()
//                , contentDescription = null)
            Text(
                text = "${data?.name}",
            )
        }
    }
}