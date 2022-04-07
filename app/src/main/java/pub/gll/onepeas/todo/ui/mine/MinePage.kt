package pub.gll.onepeas.todo.ui.mine

import android.app.Activity
import android.content.Intent
import android.provider.MediaStore
import androidx.activity.result.ActivityResult
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import pub.gll.onepeas.todo.net.UserVM
import pub.gll.onepeas.todo.net.UserViewEvent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import pub.gll.onepeas.libcore.ext.uriToFileQ
import pub.gll.onepeas.liblog.HiLog
import pub.gll.onepeas.libupload.TXUploadManager
import pub.gll.onepeas.libupload.UpLoadListener
import pub.gll.onepeas.libupload.UpLoadState
import pub.gll.onepeas.todo.ActivityResultListenerManager
import pub.gll.onepeas.todo.IActivityResultListener
import pub.gll.onepeas.todo.net.UserViewAction

@ExperimentalComposeUiApi
@Composable
fun ProfilePage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: UserVM = hiltViewModel()
) {

    val keyboardController = LocalSoftwareKeyboardController.current
    val coroutineState = rememberCoroutineScope()

    val viewStates = viewModel.viewStates

    LaunchedEffect(Unit) {
        viewModel.viewEvents.collect {
            if (it is UserViewEvent.PopBack) {
                navCtrl.popBackStack()
            }
        }
    }

    TXUploadManager.upLoadListener = object : UpLoadListener {
        override fun uploadState(upLoadState: UpLoadState, urlPath: String?) {
            urlPath?.let {
                viewModel.dispatch(UserViewAction.UpdateHeader(it))
//                HiLog.et("LLLLL", it)
            }
        }

        override fun uploadProgress(progress: Int) {

        }
    }
    ActivityResultListenerManager.add(object : IActivityResultListener {
        override fun onActivityResult(activityResult: ActivityResult) {
            if(activityResult.resultCode== Activity.RESULT_OK) {
                activityResult.data?.data?.let {
                    it.uriToFileQ(navCtrl.context)
                        ?.let { it1 -> viewModel.upload(navCtrl.context, it1) }
                }
            }
        }
    })

    viewModel.dispatch(UserViewAction.UserInfo)
    LazyColumn{
        item {
            Image(painter = rememberImagePainter(data = viewModel.editUserState.head_image, builder = {
                crossfade(true)
            }),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        val intent = Intent(
                            Intent.ACTION_PICK,
                            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                        )
                        //启动方法
                        ActivityResultListenerManager.activityResultLauncher?.launch(intent)

                    }
                    .height(300.dp),
                contentDescription = ""
            )
        }
        item {
            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()) {
                ExtendedFloatingActionButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    onClick = {
//                        viewModel.dispatch(UserViewAction.UpdateUserInfo)
                    },
                    icon = {
                        Icon(
                            Icons.Filled.Favorite,
                            contentDescription = "Favorite"
                        )
                    },
                    text = { Text("提交") }
                )
            }
        }
    }

}