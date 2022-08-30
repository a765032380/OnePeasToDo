package pub.gll.modulevideo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.alibaba.android.arouter.facade.annotation.Route
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import pub.gll.onepeas.libbase.activity.BaseActivity
import pub.gll.onepeas.libbase.arouter.ARouterPath

@AndroidEntryPoint
@Route(path = ARouterPath.VIDEO_LIST)
class VideoListAct: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val lazyListState = rememberLazyListState()
            val coroutineScope = rememberCoroutineScope()
            var editMessageShown by remember { mutableStateOf(false) }

            suspend fun showEditMessage() {
                if (!editMessageShown) {
                    editMessageShown = true
                    delay(3000L)
                    editMessageShown = false
                }
            }
            Scaffold(
                floatingActionButton = {
                    HomeFloatingActionButton(
                        extended = lazyListState.isScrollingUp(),
                        onClick = {
                            coroutineScope.launch {
                                showEditMessage()
                            }
                        }
                    )
                },
                content = {
                    VideoHome(lazyListState = lazyListState)
//                    PreviewVideoItem()
                }
            )
        }
    }
}


@Composable
private fun LazyListState.isScrollingUp(): Boolean {
    var previousIndex by remember(this) { mutableStateOf(firstVisibleItemIndex) }
    var previousScrollOffset by remember(this) { mutableStateOf(firstVisibleItemScrollOffset) }
    return remember(this) {
        derivedStateOf {
            if (previousIndex != firstVisibleItemIndex) {
                previousIndex > firstVisibleItemIndex
            } else {
                previousScrollOffset >= firstVisibleItemScrollOffset
            }.also {
                previousIndex = firstVisibleItemIndex
                previousScrollOffset = firstVisibleItemScrollOffset
            }
        }
    }.value
}



@Composable
private fun HomeFloatingActionButton(
    extended: Boolean,
    onClick: () -> Unit
) {
    // Use `FloatingActionButton` rather than `ExtendedFloatingActionButton` for full control on
    // how it should animate.
    FloatingActionButton(onClick = onClick) {
        Row(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = null
            )
            // Toggle the visibility of the content with animation.
            AnimatedVisibility(visible = extended) {
                Text(
                    text = "搜索",
                    modifier = Modifier
                        .padding(start = 8.dp, top = 3.dp)
                )
            }
        }
    }
}