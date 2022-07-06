package pub.gll.onepeas.todo.car.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.todo.car.model.CarBrandItemModel
import pub.gll.onepeas.todo.car.viewmodel.CarBrandViewModel
import java.io.IOException
import javax.inject.Inject


@AndroidEntryPoint
class CarActivity : ComponentActivity() {
//    private val mViewBinding : ActivityCarBinding by lazy {
//        ActivityCarBinding.inflate(layoutInflater)
//    }
    @Inject
    lateinit var mViewModel:CarBrandViewModel

//    private val mCarBrandAdapter:CarBrandAdapter by lazy {
//        CarBrandAdapter(this)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val refreshState = rememberSwipeRefreshState(isRefreshing = false)
            val data = mViewModel.data.collectAsLazyPagingItems()
            refreshState.isRefreshing = data.loadState.refresh is LoadState.Loading
            SwipeRefresh(state = refreshState, onRefresh = {
                data.refresh()
            }) {
                Greeting(data)
            }

        }
//        setContentView(mViewBinding.root)
//        mViewBinding.mRecyclerView.adapter = mCarBrandAdapter.withLoadStateFooter(FooterAdapter(mCarBrandAdapter,this))
//        mViewModel.data.observe(this){
//            mCarBrandAdapter.submitData(lifecycle,it)
//        }
//        lifecycleScope.launchWhenCreated {
//            mCarBrandAdapter.loadStateFlow.collectLatest {
//                mViewBinding.mSwipeRefreshLayout.isRefreshing = it.refresh is LoadState.Loading
//            }
//        }
    }
}
@Composable
fun Greeting(data: LazyPagingItems<CarBrandItemModel>) {
    LazyColumn(state = rememberLazyListState()) {
            items(items = data) { item ->
                Message(data = item)
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
                            Text(text = "--加载完成或加载错误--")
                        }
                    }
                }
            }
        }


}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun Message(data: CarBrandItemModel?) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxSize(),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Image(modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
                painter = rememberImagePainter(data = data?.icon,
                builder = {
                    crossfade(true)
                }), contentDescription = null)
            Text(
                text = "作者：${data?.name}"
            )
        }
    }
}