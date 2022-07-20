package pub.gll.onepeas.todo.web.download

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.hilt.navigation.compose.hiltViewModel
import com.jeffmony.downloader.model.VideoTaskItem
import com.jeffmony.downloader.model.VideoTaskState
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.libbase.activity.BaseActivity
import javax.inject.Inject

@AndroidEntryPoint
class DownloadListActivity: BaseActivity() {

    @Inject
    lateinit var mViewModel: DownloadListVM

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel.getData()
        setContent {
            val uiState: UiState by mViewModel.uiState.collectAsState()
            when(uiState){
                is UiState.Success->{
                    DownloadList((uiState as UiState.Success).list){
                        val intent = Intent(this,M3U8PlayActivity::class.java)
                        intent.putExtra("url",it)
                        startActivity(intent)
                    }
                }
                UiState.Loading->{

                }
                else -> {

                }
            }

        }
    }
}
@Composable
fun DownloadList(videoTaskList:List<VideoTaskItem>,goPlay:(url:String)->Unit){
    LazyColumn{
        items(videoTaskList,key = { item -> item.url }){item->
            DownloadItem(item,goPlay)
        }
    }
}
@Composable
fun DownloadItem(videoTaskItem: VideoTaskItem,goPlay:(url:String)->Unit){
    val downloadVM:DownloadListVM = hiltViewModel()
    Column(modifier = Modifier.clickable {
        downloadVM.download(videoTaskItem)
    }) {
        Text(text = videoTaskItem.url)
        when(videoTaskItem.taskState){
            VideoTaskState.PREPARE,VideoTaskState.PENDING->{
                Text(text = "等待中")
            }
            VideoTaskState.START,VideoTaskState.DOWNLOADING->{
                Text(text = "下载中")
            }
            VideoTaskState.PAUSE->{
                Text(text = "下载暂停:${videoTaskItem.downloadSizeString}")
            }
            VideoTaskState.SUCCESS->{
                Text(text = "下载完成:${videoTaskItem.downloadSizeString}")
            }
            VideoTaskState.ERROR->{
                Text(text = "下载失败")
            }
        }
        Row {
            when(videoTaskItem.taskState){
                VideoTaskState.SUCCESS->{
                    Button(onClick = {
                        goPlay(videoTaskItem.filePath)
                    }) {
                        Text(text = "播放")
                    }
                }
            }
            Button(onClick = {
                downloadVM.delete(videoTaskItem)
            }) {
                Text(text = "删除")
            }
        }
    }
}