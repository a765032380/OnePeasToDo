package pub.gll.modulevideo

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.decode.VideoFrameDecoder
import coil.request.ImageRequest
import coil.request.Parameters
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import pub.gll.modulevideo.model.VideoItemModel
import pub.gll.modulevideo.vm.VideoVM
import pub.gll.onepeas.libbase.Test
import pub.gll.onepeas.libbase.arouter.Launch
import kotlin.random.Random

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
        Greeting(data = data)
    }

}
@Composable
fun PreviewVideoItem(){
    val videoItemModel = VideoItemModel(1,"1","复仇者联盟",Test.TEST_MP4_URL,Test.TEST_MP4_URL)
    VideoItem(videoItemModel)
}

@Composable
fun Greeting(data: LazyPagingItems<VideoItemModel>) {
    LazyColumn(state = rememberLazyListState()) {
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
        Column(modifier = Modifier.padding(10.dp)
            .clickable {
                data?.url?.let { Launch.videoPlay(it) }
            }) {
            val videoFrameMicros = Random.nextLong(62_000_000L)
            val parameters = Parameters.Builder()
                .set(VideoFrameDecoder.VIDEO_FRAME_MICROS_KEY, videoFrameMicros)
                .build()

            AsyncImage(modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(5.dp))
                .height(300.dp),
                contentScale = ContentScale.FillWidth,
                model = ImageRequest.Builder(LocalContext.current)
                        .apply(block = fun ImageRequest.Builder.() {
                            data(data = data?.icon)
                            crossfade(true)
                            parameters(parameters = parameters)
                            addHeader("Authorization" , "Basic YWRtaW46YWRtaW4=")
                        })
                        .build()
                , contentDescription = null)
            Text(
                text = "${data?.name}",
            )
        }
    }
}