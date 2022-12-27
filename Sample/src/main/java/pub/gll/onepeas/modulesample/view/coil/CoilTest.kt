package pub.gll.onepeas.modulesample.view.coil

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.ImageLoader
import coil.compose.rememberImagePainter
import coil.decode.SvgDecoder

@Composable
fun CoilImage(){
    Image(
        painter = rememberImagePainter(data = "https://picsum.photos/300/300"),
        contentDescription = null
    )
}
@Composable
fun CoilSVG(){
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(SvgDecoder.Factory())
        }
        .build()

    Image(
        painter = rememberImagePainter(
            data = "https://coil-kt.github.io/coil/images/coil_logo_black.svg",
            imageLoader = imageLoader
        ),
        contentDescription = null
    )
}
@Composable
fun CoilSVGBig(){
    val context = LocalContext.current
    val imageLoader = ImageLoader.Builder(context)
        .components {
            add(SvgDecoder.Factory())
        }
        .build()

    var flag by remember { mutableStateOf(false) }
    val size by animateDpAsState(targetValue = if(flag) 450.dp else 50.dp)

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                painter = rememberImagePainter(
                    data = "https://coil-kt.github.io/coil/images/coil_logo_black.svg",
                    imageLoader = imageLoader
                ),
                contentDescription = null,
                modifier = Modifier
                    .size(size)
                    .clickable(
                        onClick = {
                            flag = !flag
                        },
                        indication = null,
                        interactionSource = MutableInteractionSource()
                    )
            )
        }
    }
}