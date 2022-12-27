package pub.gll.onepeas.modulesample.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\b\u0010\b\u001a\u00020\u0001H\u0007\u001a\b\u0010\t\u001a\u00020\u0001H\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u001a\b\u0010\u000b\u001a\u00020\u0001H\u0007\u001a\b\u0010\f\u001a\u00020\u0001H\u0007\u001a\b\u0010\r\u001a\u00020\u0001H\u0007\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0007\u001a\b\u0010\u000f\u001a\u00020\u0001H\u0007\u00a8\u0006\u0010"}, d2 = {"TextDemo", "", "TextDemoClickable", "TextDemoCompositionLocal", "TextDemoContentAlignment", "TextDemoFontFamily", "TextDemoLetterSpacing", "TextDemoLineHeight", "TextDemoMaxLines", "TextDemoOverflow", "TextDemoRes", "TextDemoSelectionContainer", "TextDemoStyle", "TextDemoTextAlign", "TextDemoWithStyle", "TextDemoWithStyleClick", "ModuleSample_debug"})
public final class TextTestKt {
    
    @androidx.compose.runtime.Composable()
    public static final void TextDemo() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TextDemoRes() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TextDemoStyle() {
    }
    
    /**
     * 文字间距
     * letterSpacing
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoLetterSpacing() {
    }
    
    /**
     * maxLines 参数
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoMaxLines() {
    }
    
    /**
     * TextOverflow 处理溢出
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoOverflow() {
    }
    
    /**
     * textAlign 参数
     * 当我们在 Text 中设置了 fillMaxWidth() 之后，我们可以指定 Text 的对齐方式
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoTextAlign() {
    }
    
    /**
     * lineHeight 参数
     * 使用 lineHeight 参数可以让我们指定 Text 中每行的行高间距
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoLineHeight() {
    }
    
    /**
     * fontFamily 参数
     * 使用 fontFamily 参数可以让我们自定义字体，它的调用方法是这样的：
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoFontFamily() {
    }
    
    /**
     * 可点击的 Text
     * 有的时候也许您需要将文本当作按钮，那么只需要添加 Modifier.clickable 即可
     * 取消点击波纹
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoClickable() {
    }
    
    /**
     * 特定的文字显示
     * 如果我们想让一个 Text 语句中使用不同的样式，比如粗体提醒，特殊颜色
     *   则我们需要使用到 AnnotatedString
     *   AnnotatedString 是一个数据类，其中包含了：
     *   一个 Text 的值
     *   一个 SpanStyleRange 的 List，等同于位置范围在文字值内的内嵌样式
     *   一个 ParagraphStyleRange 的 List，用于指定文字对齐、文字方向、行高和文字缩进样式
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoWithStyle() {
    }
    
    /**
     * 文字超链接？
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoWithStyleClick() {
    }
    
    /**
     * 文字复制
     * 默认情况下 Text 并不能进行复制等操作，我们需要设置 SelectionContainer 来包装 Text
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoSelectionContainer() {
    }
    
    /**
     * 文字强调效果
     * 文字根据不同情况来确定文字的强调程度，以突出重点并体现出视觉上的层次感。
     * Material Design 建议采用不同的不透明度来传达这些不同的重要程度，你可以通过 LocalContentAlpha 实现此功能。
     * 您可以通过为此 CompositionLocal 提供一个值来为层次结构指定内容 Alpha 值。（CompositionLocal 是一个用于隐式的传递参数的组件，后续会讲到）
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoCompositionLocal() {
    }
    
    /**
     * 文字水平位置
     * 一般情况下，Text 不会水平居中，如果你在 Row, Column, Box 这些 Composable 里面想要实现居中的效果，你可以在 Text 外围写一个 Box, Row, Column 等
     */
    @androidx.compose.runtime.Composable()
    public static final void TextDemoContentAlignment() {
    }
}