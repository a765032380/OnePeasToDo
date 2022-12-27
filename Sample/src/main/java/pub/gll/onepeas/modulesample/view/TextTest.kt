package pub.gll.onepeas.modulesample.view

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pub.gll.onepeas.module.sample.R

@Composable
fun TextDemo() {
    Text("Hello World")
}
@Composable
fun TextDemoRes() {
    Text(stringResource(id = R.string.account_redacted))
}
@Composable
fun TextDemoStyle() {
    Column{
        Text(
            text = "你好呀陌生人，这是一个标题",
            style = MaterialTheme.typography.h6
        )
        Text(
            text ="你好呀陌生人，我是内容",
            style = MaterialTheme.typography.body2
        )
    }
}

/**
 * 文字间距
 * letterSpacing
 */
@Composable
fun TextDemoLetterSpacing() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "你好陌生人",
            style = TextStyle(
                fontWeight = FontWeight.W900, //设置字体粗细
                fontSize = 20.sp,
                letterSpacing = 7.sp
            )
        )
    }
}

/**
 * maxLines 参数
 */
@Composable
fun TextDemoMaxLines() {
    Column{
        Text(
            text = "你好呀陌生人，这是一个标题，不是很长，因为我想不出其他什么比较好的标题了",
            style = MaterialTheme.typography.h6,
            maxLines = 1,
        )
        Text(
            text ="你好呀陌生人，我是内容",
            style = MaterialTheme.typography.body2
        )
    }
}

/**
 * TextOverflow 处理溢出
 */
@Composable
fun TextDemoOverflow() {
    Column{
        Text(
            text = "你好呀陌生人，这是一个标题，不是很长，因为我想不出其他什么比较好的标题了",
            style = MaterialTheme.typography.h6,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text ="你好呀陌生人，我是内容",
            style = MaterialTheme.typography.body2
        )
    }
}

/**
 * textAlign 参数
 * 当我们在 Text 中设置了 fillMaxWidth() 之后，我们可以指定 Text 的对齐方式
 */
@Composable
fun TextDemoTextAlign() {
    Column {
        Text(
            text = "每天摸鱼",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Left
        )
        Text(
            text = "这好吗",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            text = "这非常的好",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Right
        )
    }
}

/**
 * lineHeight 参数
 * 使用 lineHeight 参数可以让我们指定 Text 中每行的行高间距
 */
@Composable
fun TextDemoLineHeight(){
    Column {
        Text(
            text = "两面包夹芝士".repeat(15),
        )
        Spacer(Modifier.padding(vertical = 15.dp))
        Text(
            text = "两面包夹芝士".repeat(15),
            lineHeight = 30.sp
        )
    }
}

/**
 * fontFamily 参数
 * 使用 fontFamily 参数可以让我们自定义字体，它的调用方法是这样的：
 */
@Composable
fun TextDemoFontFamily(){
    Column {
        Text("Hello World", fontFamily = FontFamily.Serif)
        Text("Hello World", fontFamily = FontFamily.SansSerif)
        Text("Hello World", fontFamily = FontFamily(
            Font(R.font.domine_bold, FontWeight.W700)
        ))
    }
}

/**
 * 可点击的 Text
 * 有的时候也许您需要将文本当作按钮，那么只需要添加 Modifier.clickable 即可
 * 取消点击波纹
 */
@Composable
fun TextDemoClickable() {
    Text(
        text = "确认编辑",
        modifier = Modifier.clickable(
            onClick = {
                // TODO
            },
            //取消点击波纹 需要设置底下的两个参数
            indication = null,
            interactionSource = MutableInteractionSource()
        )
    )
}

/**
 * 特定的文字显示
 * 如果我们想让一个 Text 语句中使用不同的样式，比如粗体提醒，特殊颜色
    则我们需要使用到 AnnotatedString
    AnnotatedString 是一个数据类，其中包含了：
    一个 Text 的值
    一个 SpanStyleRange 的 List，等同于位置范围在文字值内的内嵌样式
    一个 ParagraphStyleRange 的 List，用于指定文字对齐、文字方向、行高和文字缩进样式

 */
@Composable
fun TextDemoWithStyle() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            buildAnnotatedString {
                append("你现在观看的章节是 ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.W900)) {
                    append("Text")
                }
            }
        )
    }
}
/**
 * 文字超链接？
 */
@Composable
fun TextDemoWithStyleClick() {
    val annotatedText = buildAnnotatedString {
        append("勾选即代表同意")
        pushStringAnnotation(
            tag = "tag",
            annotation = "一个用户协议啦啦啦，内容内容"
        )
        withStyle(
            style = SpanStyle(
                color = Color(0xFF0E9FF2),
                fontWeight = FontWeight.Bold
            )
        ) {
            append("用户协议")
        }
        pop()
    }


    ClickableText(
        text = annotatedText,
        onClick = { offset ->
            annotatedText.getStringAnnotations(
                tag = "tag", start = offset,
                end = offset
            ).firstOrNull()?.let { annotation ->
                Log.d("LLLLL", "你已经点到 ${annotation.item} 啦")
            }
        }
    )
}
/**
 * 文字复制
 * 默认情况下 Text 并不能进行复制等操作，我们需要设置 SelectionContainer 来包装 Text
 */
@Composable
fun TextDemoSelectionContainer() {
    SelectionContainer {
        Column{
            Text(
                text = "每天摸鱼",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Left
            )
            Text(
                text = "这好吗",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(
                text = "这非常的好",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Right
            )
        }
    }
}
/**
 * 文字强调效果
 * 文字根据不同情况来确定文字的强调程度，以突出重点并体现出视觉上的层次感。
 * Material Design 建议采用不同的不透明度来传达这些不同的重要程度，你可以通过 LocalContentAlpha 实现此功能。
 * 您可以通过为此 CompositionLocal 提供一个值来为层次结构指定内容 Alpha 值。（CompositionLocal 是一个用于隐式的传递参数的组件，后续会讲到）
 */
@Composable
fun TextDemoCompositionLocal(){
    // 将内部 Text 组件的 alpha 强调程度设置为高
// 注意: MaterialTheme 已经默认将强调程度设置为 high
    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.high) {
        Text("这里是high强调效果")
    }
// 将内部 Text 组件的 alpha 强调程度设置为中
    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
        Text("这里是medium强调效果")
    }
// 将内部 Text 组件的 alpha 强调程度设置为禁用
    CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.disabled) {
        Text("这里是禁用后的效果")
    }
}
/**
 * 文字水平位置
 * 一般情况下，Text 不会水平居中，如果你在 Row, Column, Box 这些 Composable 里面想要实现居中的效果，你可以在 Text 外围写一个 Box, Row, Column 等
 */
@Composable
fun TextDemoContentAlignment(){
    Column {
        Text("123")
        Text("456")
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text("789")
        }
    }
}




