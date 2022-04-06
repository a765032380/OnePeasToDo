package pub.gll.onepeas.todo.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.google.accompanist.pager.ExperimentalPagerApi
import pub.gll.onepeas.todo.ui.setting.SettingVM

const val imageUrl = "https://test-1251228670.cos.ap-beijing-1.myqcloud.com/image/IMG_20220331_181756.jpg"

@ExperimentalPagerApi
@Composable
fun HomePage(
    navCtrl: NavHostController,
    scaffoldState: ScaffoldState,
    viewModel: SettingVM = hiltViewModel()
) {
    Box(
        Modifier.fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center ) {
        LazyColumn{
            items(100){
                ImageItem()
            }
        }
    }
}
@Composable
fun ImageItem(){
    Image(painter = rememberImagePainter(data = imageUrl, builder = {
        crossfade(true)
    }),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
        contentDescription = ""
    )
}