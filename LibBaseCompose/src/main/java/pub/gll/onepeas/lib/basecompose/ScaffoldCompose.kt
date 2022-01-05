package pub.gll.onepeas.lib.basecompose

import androidx.compose.material3.*
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MScaffold(){
    Scaffold(
        topBar = {
            MTopAppBar {

            }
        },
        bottomBar = {
            MBottomAppBar{

            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {

            }) {

            }
        },
        floatingActionButtonPosition = FabPosition.Center,
    ){

    }
}
@Composable
fun MTopAppBar(topBar: @Composable () -> Unit = {}){

}

@Composable
fun MBottomAppBar(bottomBar: @Composable () -> Unit = {}){

}
