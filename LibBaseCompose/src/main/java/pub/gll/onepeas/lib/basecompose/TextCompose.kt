package pub.gll.onepeas.lib.basecompose

import android.app.Application
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit

data class TextConfig(val modifier: Modifier = Modifier,
                      val color: Color = Color.Unspecified,
                      val fontSize: TextUnit = TextUnit.Unspecified,
                      val fontStyle: FontStyle? = null,
                      val fontWeight: FontWeight? = null,
                      val fontFamily: FontFamily? = null,
                      val letterSpacing: TextUnit = TextUnit.Unspecified,
                      val textDecoration: TextDecoration? = null,
                      val textAlign: TextAlign? = null,
                      val lineHeight: TextUnit = TextUnit.Unspecified,
                      val overflow: TextOverflow = TextOverflow.Clip,
                      val softWrap: Boolean = true,
                      val maxLines: Int = Int.MAX_VALUE,
                      val onTextLayout: (TextLayoutResult) -> Unit = {},
                      val style: TextStyle = TextStyle.Default)

var mTextConfig:TextConfig?=null

fun Application.initTextConfig(textConfig: TextConfig){
    mTextConfig = textConfig
}

@Composable
fun H(text: String,){
    if (mTextConfig!=null){
        mTextConfig?.apply {
            Text(text, modifier,
                color,
                fontSize,
                fontStyle,
                fontWeight,
                fontFamily,
                letterSpacing,
                textDecoration,
                textAlign,
                lineHeight,
                overflow,
                softWrap,
                maxLines,
                onTextLayout,
                style)
        }
    }else{
        Text(text)
    }


}


@Composable
fun H1(text: String){
    H(text)
}
@Composable
fun H2(){

}
@Composable
fun H3(){
    
}
@Composable
fun H4(){
    
}
@Composable
fun H5(){
    
}
@Composable
fun H6(){
    
}
@Preview
@Composable
fun Test(){
    Row { 
        H1("dddd")
        H2()
        H3()
        H4()
        H5()
        H6()
    }
}
