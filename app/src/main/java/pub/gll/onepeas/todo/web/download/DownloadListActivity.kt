package pub.gll.onepeas.todo.web.download

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.LiveData
import com.jeffmony.downloader.model.VideoTaskItem
import com.jeffmony.downloader.model.VideoTaskState
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.libbase.activity.BaseActivity
import javax.inject.Inject

@AndroidEntryPoint
class DownloadListActivity: BaseActivity() {

    @Inject
    lateinit var mViewModel: DownloadListVM
    override fun onPause() {
        super.onPause()
        if (isFinishing){
            mViewModel.close()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel.getData()
        setContent {
            val list = mViewModel.videoTaskList
            DownloadList(list, {
                val intent = Intent(this,M3U8PlayActivity::class.java)
                intent.putExtra("url",it)
                startActivity(intent)
            },{
                mViewModel.download(it)
            },{
                mViewModel.delete(it)
            })
        }
    }
}
@Composable
fun DownloadList(videoTaskList:List<VideoTaskItem>,goPlay:(url:String)->Unit,download:(VideoTaskItem)->Unit,delete:(VideoTaskItem)->Unit,){
    LazyColumn{
        items(videoTaskList){item->
            DownloadItem(item,goPlay,download,delete)
        }
    }
}
@Composable
fun DownloadItem(videoTaskItem: VideoTaskItem,goPlay:(url:String)->Unit,download:(VideoTaskItem)->Unit,delete:(VideoTaskItem)->Unit,){
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        shape = RoundedCornerShape(5.dp),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier.padding(16.dp).clickable {
            download(videoTaskItem)
        }) {

            Text(text = videoTaskItem.title)

            val str = when (videoTaskItem.taskState) {
                VideoTaskState.PREPARE, VideoTaskState.PENDING -> {
                    "等待中"
                }
                VideoTaskState.START, VideoTaskState.DOWNLOADING -> {
                     "下载中:${videoTaskItem.percentString}"
                }
                VideoTaskState.PAUSE -> {
                    "下载暂停:${videoTaskItem.downloadSizeString}"
                }
                VideoTaskState.SUCCESS -> {
                   "下载完成:${videoTaskItem.downloadSizeString}"
                }
                VideoTaskState.ERROR -> {
                    "下载失败"
                }
                else -> {
                    ""
                }
            }
            Text(modifier = Modifier.padding(top = 8.dp),text = str)
            Row(modifier = Modifier.padding(top = 8.dp)) {
                when (videoTaskItem.taskState) {
                    VideoTaskState.SUCCESS -> {
                        Button(
                            modifier = Modifier.padding(end = 16.dp),
                            onClick = {
                                goPlay(videoTaskItem.filePath)
                            }) {
                            Text(text = "播放")
                        }
                    }
                }
                Button(
                    onClick = {
                        delete(videoTaskItem)
                    }) {
                    Text(text = "删除")
                }
            }
        }
    }
}