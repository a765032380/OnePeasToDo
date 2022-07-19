package pub.gll.onepeas.todo.car.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.module.cookbook.CookBookHome
import pub.gll.onepeas.todo.car.model.CarBrandItemModel
import pub.gll.onepeas.todo.car.viewmodel.CarBrandViewModel
import pub.gll.onepeas.todo.ui.theme.AppTheme
import pub.gll.onepeas.todo.web.WebActivity
import javax.inject.Inject


@AndroidEntryPoint
class CarComposeActivity : ComponentActivity() {

    @Inject
    lateinit var mViewModel:CarBrandViewModel

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window,false)

        setContent {
            val refreshState = rememberSwipeRefreshState(isRefreshing = false)
            val data = mViewModel.dataCompose.collectAsLazyPagingItems()
            refreshState.isRefreshing = data.loadState.refresh is LoadState.Loading

            androidx.compose.material3.MaterialTheme {
                ProvideWindowInsets {
                    val systemUiController = rememberSystemUiController()
                    SideEffect {
                        systemUiController.setSystemBarsColor(Color.White, true)
                    }
                    Scaffold(
                        modifier = Modifier.statusBarsPadding(),
                        floatingActionButton = {
                            FloatingActionButton(
                                onClick = {
                                    startActivity(Intent(this, WebActivity::class.java))
                                },
                                backgroundColor = AppTheme.colors.themeUi,
                                modifier = Modifier.size(60.dp),
                                shape = RoundedCornerShape(30.dp),
                                elevation = FloatingActionButtonDefaults.elevation(
                                    defaultElevation = 8.dp,
                                    hoveredElevation = 10.dp
                                )
                            ) {
                                Text(
                                    modifier = Modifier.padding(6.dp),
                                    text = "Video",
                                    fontSize = 14.sp,
                                    color = Color.White
                                )
                            }
                        },
                        floatingActionButtonPosition = FabPosition.End,
                        content = {
                            CookBookHome()
//                            SwipeRefresh(state = refreshState, onRefresh = {
//                                data.refresh()
//                            }) {
//                                Greeting(data) {
//
//                                }
//                            }
                        }
                    )
                }
            }
        }
    }
}
@Composable
fun Greeting(data: LazyPagingItems<CarBrandItemModel>,goImagePreview:(icon:String?)->Unit) {
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
                is LoadState.Loading -> {//加载中的尾部item展示
                    item {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "加载中。。。")
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

@OptIn(ExperimentalCoilApi::class)
@Composable
fun Message(data: CarBrandItemModel?,goImagePreview:(icon:String?)->Unit) {
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