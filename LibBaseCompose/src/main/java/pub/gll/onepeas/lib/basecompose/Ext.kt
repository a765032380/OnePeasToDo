package pub.gll.onepeas.lib.basecompose

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.Activity
import android.app.DialogFragment
import android.content.Context
import android.content.ContextWrapper
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.SystemClock
import android.text.TextUtils
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * @author: hujianqiang
 * @date: 2021/11/30
 */
fun Context?.scanForActivity(): Activity? {
    return if (this == null) null else this as? Activity
        ?: if (this is ContextWrapper) this.baseContext.scanForActivity() else null
}

inline fun <T> Boolean.yes(action: () -> T): Boolean {
    if (this) action()
    return this
}

inline fun <T> Boolean.no(action: () -> T): Boolean {
    if (!this) action()
    return this
}
fun String?.filterNullOrEmpty(): String {
    return this.filterNullOrEmpty("无")
}

fun String?.filterNullOrEmpty(defaultStr: String): String {
    return if (!TextUtils.isEmpty(this)) this!! else defaultStr
}
fun getDensity(context: Context): Float {
    return context.resources.displayMetrics.density
}

fun getFontDensity(context: Context): Float {
    return context.resources.displayMetrics.scaledDensity
}

fun Context?.screenDimensWidth() = this?.resources?.displayMetrics?.widthPixels ?: 1080


fun Context?.isFinishing(): Boolean {
    if (this == null) {
        return true
    }
    return this is Activity && this.isFinishing
}

//fun Int.dp2px(): Int = this.dp2px(BaseApplication.getInstance())

fun Int.dp2px(context: Context?): Int = this.toFloat().dp2px(context)

//fun Float.dp2px(): Int = this.dp2px(BaseApplication.getInstance())

fun Float.dp2px(context: Context?): Int {
    val scale = context?.resources?.displayMetrics?.density ?: 2f
    return (this * scale + 0.5f).toInt()
}

//fun Int.px2dp(): Float = this.px2dp(BaseApplication.getInstance())

fun Int.px2dp(context: Context?): Float = this.toFloat().px2dp(context)

//fun Float.px2dp(): Float = this.px2dp(BaseApplication.getInstance())

fun Float.px2dp(context: Context?): Float {
    val scale = context?.resources?.displayMetrics?.density ?: 2f
    return this / scale
}


/**
 * 单位转换: dp -> px
 *
 * @param dp
 * @return
 */
fun dp2px(context: Context, dp: Int): Int {
    return (getDensity(context) * dp + 0.5).toInt()
}

/**
 * 单位转换: sp -> px
 *
 * @param sp
 * @return
 */
fun sp2px(context: Context, sp: Int): Int {
    return (getFontDensity(context) * sp + 0.5).toInt()
}

/**
 * 单位转换:px -> dp
 *
 * @param px
 * @return
 */
fun px2dp(context: Context, px: Int): Int {
    return (px / getDensity(context) + 0.5).toInt()
}

/**
 * 单位转换:px -> sp
 *
 * @param px
 * @return
 */
fun px2sp(context: Context, px: Int): Int {
    return (px / getFontDensity(context) + 0.5).toInt()
}

fun Activity?.screenHeight(): Int {
    if (this == null) {
        return 0
    }
    return resources?.displayMetrics?.heightPixels ?: 0
}


fun Animator?.endListener(action: () -> Unit) {
    if (this == null) {
        return
    }
    addListener(object : AnimatorListenerAdapter() {
        override fun onAnimationEnd(animation: Animator?) {
            action.invoke()
        }
    })
}


/**
 * 获取activity的根view
 */
fun getActivityRoot(activity: Activity): View {
    return (activity.findViewById<View>(Window.ID_ANDROID_CONTENT) as ViewGroup).getChildAt(0)
}
fun <U, T> Activity.bindExtra(key: String) = BindLoader<U, T>(key)

//fun <U, T> Fragment.bindArgument(key: String) = BindLoader<U, T>(key)

fun <U, T> android.app.Fragment.bindArgument(key: String) = BindLoader<U, T>(key)

private class IntentDelegate<in U, out T>(private val key: String) : ReadOnlyProperty<U, T> {
    override fun getValue(thisRef: U, property: KProperty<*>): T {
        @Suppress("UNCHECKED_CAST")
        return when (thisRef) {
//            is Fragment -> thisRef.arguments?.get(key) as T
            is android.app.Fragment -> thisRef.arguments?.get(key) as T
            else -> (thisRef as Activity).intent?.extras?.get(key) as T
        }
    }
}

class BindLoader<in U, out T>(private val key: String) {
    operator fun provideDelegate(thisRef: U, prop: KProperty<*>): ReadOnlyProperty<U, T> {
        return IntentDelegate(key)
    }
}

//fun <T : View> Fragment.bind(@IdRes idRes: Int): Lazy<T> {
//    return lazy { this.view!!.findViewById<T>(idRes) }
//}

fun <T : View> DialogFragment.bind(@IdRes idRes: Int): Lazy<T> {
    return lazy {
        if (this.dialog != null) {
            this.dialog.findViewById<T>(idRes)
        } else {
            this.view!!.findViewById<T>(idRes)
        }
    }
}

fun <T : Any> Collection<T>?.isEmptyOrNull(): Boolean {
    if (this == null)
        return true
    return isEmpty()
}

fun Any?.toString(): String {
    if (this == null) return "null"
    return toString()
}


fun <T : Any> MutableList<T>?.removeLastElements(size: Int) {
    if (isEmptyOrNull())
        return
    (0..size).forEach {
        if (this!!.size > it)
            this.removeAt(size - it)
    }

}

fun <T : View> Activity.bind(@IdRes idRes: Int): Lazy<T> {
    return lazy { findViewById<T>(idRes) }
}

fun Activity?.cancelTouchAction() {
    this ?: return
    val now = SystemClock.uptimeMillis()
    val cancelEvent = MotionEvent.obtain(now, now,
        MotionEvent.ACTION_CANCEL, 0.0f, 0.0f, 0)
    this.window?.decorView?.dispatchTouchEvent(cancelEvent)
}

fun Context.color(color: Int): Int {
    if (resources == null) {
        return 0
    }
    return resources.getColor(color)
}
fun Context.drawable(@DrawableRes id: Int): Drawable {
    return if (Build.VERSION.SDK_INT >= 21) {
        resources.getDrawable(id, null)
    } else {
        @Suppress("DEPRECATION")
        resources.getDrawable(id)
    }
}
fun String.toUri(): Uri = Uri.parse(this)