package pub.gll.onepeas.todo.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Scroller
import kotlin.math.roundToInt

/**
 * 自定义View触摸跟随
 */
open class CustomView @JvmOverloads constructor(
                      context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private lateinit var mScroller:Scroller
    private var lastX: Float = 0f
    private var lastY: Float = 0f
    init {
        mScroller = Scroller(context)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }

    override fun computeScroll() {
        super.computeScroll()
        if (mScroller.computeScrollOffset()){
            (parent as View).scrollTo(mScroller.currX,mScroller.currY)
            invalidate()
        }
    }
    fun smoothScrollTo(destX:Int ,destY:Int){
        val scrollX = scrollX
        val scrollY = scrollY
        val deltaX = destX - scrollX
        val deltaY = destY - scrollY
        mScroller.startScroll(scrollX,scrollY,deltaX,deltaY,2000)
        invalidate()
    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        var x = event.x
        var y = event.y
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                lastX = x
                lastY = y
            }
            MotionEvent.ACTION_MOVE -> {
                val offsetX:Int = ((x - lastX).roundToInt())
                val offsetY:Int= ((y - lastY).roundToInt())
                //1.layout的实现方式
//                layout(
//                    (left + offsetX).roundToInt(), (top + offsetY).roundToInt(),
//                    (right + offsetX).roundToInt(), (bottom + offsetY).roundToInt()
//                )
                //2.offsetLeftAndRight 和 offsetTopAndBottom 实现方式
//                offsetLeftAndRight(offsetX)
//                offsetTopAndBottom(offsetY)
                //3.LayoutParams的方式
                val layoutMarginParams = layoutParams as ViewGroup.MarginLayoutParams
                layoutMarginParams.leftMargin = left+offsetX
                layoutMarginParams.topMargin = top+offsetY
                layoutParams = layoutMarginParams

            }
            MotionEvent.ACTION_UP -> {

            }
        }
//        return super.onTouchEvent(event)
        return true

    }

    override fun dispatchTouchEvent(event: MotionEvent?): Boolean {
        return super.dispatchTouchEvent(event)
    }
}