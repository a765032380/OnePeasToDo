package pub.gll.onepeas.libbase.anim

import android.animation.*
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import pub.gll.onepeas.libbase.util.CollectionUtils
import java.lang.ref.WeakReference


class ViewAnimStream private constructor() : IViewAnimStream {
    companion object {

        const val REPEAT_COUNT_INFINITE = ValueAnimator.INFINITE

        fun create(): ViewAnimStream = ViewAnimStream()

        fun next(view: View): ViewAnimStreamItem = create().next(view)

        fun rotate(view: View, durationMs: Long) = create()
            .with(view)
            .interpolator(LinearInterpolator())
            .duration(durationMs)
            .rotation(0f, 359f)
            .repeatCount(REPEAT_COUNT_INFINITE)
            .onFinally {
                it.rotation = 0f
            }
            .build()
    }

    private val viewAnimStreamItems: MutableList<ViewAnimStreamItem> = ArrayList()

    private var playSequentiallyAnimatorSet: AnimatorSet? = null
    private var durationMs: Long? = null
    private var interpolator: TimeInterpolator? = null

    private var onAnimationRepeat: (animation: Animator?) -> Unit = {}
    private var onAnimationEnd: (animation: Animator?) -> Unit = {}
    private var onAnimationCancel: (animation: Animator?) -> Unit = { }
    private var onAnimationStart: (animation: Animator?) -> Unit = {}
    private var onFinally: () -> Unit = {}

    private var id = 0

    override val valid: Boolean
        get() = viewAnimStreamItems.any { it.valid }

    /**
     * 添加一个 View 的动画
     * 和 [next] 方法不一样的是，该方法添加的 View 动画会和上一个动画一起播放
     */
    override fun with(view: View?): ViewAnimStreamItem {
        return ViewAnimStreamItem(id, this, view).apply {
            viewAnimStreamItems.add(this)
        }
    }

    /**
     * 添加一个 View 的动画
     * 和 [with] 方法不一样的是，该方法添加的 View 动画会在上面所有动画播放完成后播放
     */
    override fun next(view: View?): ViewAnimStreamItem {
        return ViewAnimStreamItem(++id, this, view).apply {
            viewAnimStreamItems.add(this)
        }
    }

    override fun build() = apply {
        viewAnimStreamItems.forEach { animationItem ->
            pub.gll.onepeas.libbase.util.CollectionUtils.removeWhen(animationItem.animatorList) {
                animationItem.animatorSet.childAnimations.contains(it)
            }
            animationItem.animatorSet.playTogether(animationItem.animatorList)
            animationItem.animatorSet.addListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(animation: Animator?) {
                    val view = animationItem.view
                    if (view == null) {
                        animation?.cancel()
                        return
                    }
                    animationItem.onAnimationRepeat(animation, view)
                }

                override fun onAnimationEnd(animation: Animator?) {
                    val view = animationItem.view ?: return
                    animationItem.onAnimationEnd(animation, view)
                    animationItem.onFinally(view)
                }

                override fun onAnimationCancel(animation: Animator?) {
                    val view = animationItem.view ?: return
                    animationItem.onAnimationCancel(animation, view)
                    animationItem.onFinally(view)
                }

                override fun onAnimationStart(animation: Animator?) {
                    val view = animationItem.view
                    if (view == null) {
                        animation?.cancel()
                        return
                    }
                    animationItem.onAnimationStart(animation, view)
                }

            })
        }

        playSequentiallyAnimatorSet = AnimatorSet().apply {
            interpolator = this@ViewAnimStream.interpolator
            durationMs?.let { duration = it }
            this.addListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(animation: Animator?) {
                    onAnimationRepeat.invoke(animation)
                }

                override fun onAnimationEnd(animation: Animator?) {
                    onAnimationEnd.invoke(animation)
                    onFinally()
                }

                override fun onAnimationCancel(animation: Animator?) {
                    onAnimationCancel.invoke(animation)
                    onFinally()
                }

                override fun onAnimationStart(animation: Animator?) {
                    onAnimationStart.invoke(animation)
                }

            })
            val animList = viewAnimStreamItems.asSequence().filter {
                it.valid
            }.groupBy {
                it.id
            }.map {
                it.value
            }.filter {
                it.isNotEmpty()
            }.map { items ->
                AnimatorSet().apply {
                    playTogether(items.map { it.animatorSet })
                }
            }.toList()
            playSequentially(animList)
        }
    }

    override fun start() {
        if (viewAnimStreamItems.isNullOrEmpty()) {
            return
        }
        if (playSequentiallyAnimatorSet == null) {
            build()
        }
        playSequentiallyAnimatorSet?.start()
    }

    override fun cancel() {
        playSequentiallyAnimatorSet?.cancel()
    }

    fun duration(durationMs: Long) = apply {
        this.durationMs = durationMs
    }

    fun interpolator(interpolator: TimeInterpolator) = apply {
        this.interpolator = interpolator
    }

    fun onAnimationRepeat(onAnimationRepeat: ((animation: Animator?) -> Unit)) = apply {
        this.onAnimationRepeat = onAnimationRepeat
    }

    fun onAnimationEnd(onAnimationEnd: ((animation: Animator?) -> Unit)) = apply {
        this.onAnimationEnd = onAnimationEnd
    }

    fun onAnimationCancel(onAnimationCancel: ((animation: Animator?) -> Unit)) = apply {
        this.onAnimationCancel = onAnimationCancel
    }

    fun onAnimationStart(onAnimationStart: ((animation: Animator?) -> Unit)) = apply {
        this.onAnimationStart = onAnimationStart
    }

    fun onFinally(onFinally: () -> Unit) = apply {
        this.onFinally = onFinally
    }

    object Interpolator {
        val accelerateDecelerate: AccelerateDecelerateInterpolator by lazy {
            AccelerateDecelerateInterpolator()
        }

        val accelerate: AccelerateInterpolator by lazy {
            AccelerateInterpolator()
        }

        val decelerate: DecelerateInterpolator by lazy {
            DecelerateInterpolator()
        }

        val linear: LinearInterpolator by lazy {
            LinearInterpolator()
        }
    }
}

interface IViewAnimStream {
    val valid: Boolean
    fun start()
    fun cancel()
    fun next(view: View?): ViewAnimStreamItem
    fun with(view: View?): ViewAnimStreamItem
    fun build(): ViewAnimStream
}

class ViewAnimStreamItem(val id: Int, stream: ViewAnimStream, view: View?) : IViewAnimStream by stream {

    private val weakView: WeakReference<View?> = WeakReference(view)

    internal val view: View?
        get() = weakView.get()
    val animatorSet: AnimatorSet = AnimatorSet()

    val animatorList: MutableList<Animator> = ArrayList()

    override val valid: Boolean
        get() = view != null && animatorList.isNotEmpty()

    internal var onAnimationRepeat: (animation: Animator?, view: View) -> Unit = { _, _ -> }
    internal var onAnimationEnd: (animation: Animator?, view: View) -> Unit = { _, _ -> }
    internal var onAnimationCancel: (animation: Animator?, view: View) -> Unit = { _, _ -> }
    internal var onAnimationStart: (animation: Animator?, view: View) -> Unit = { _, _ -> }
    internal var onFinally: (view: View) -> Unit = {}

    fun duration(durationMs: Long) = apply {
        if (animatorList.isEmpty()) {
            animatorSet.duration = durationMs
        } else {
            animatorList.last().duration = durationMs
        }
    }

    fun repeatCount(count: Int) = apply {
        (animatorList.lastOrNull() as? ValueAnimator)?.repeatCount = count
    }

    fun interpolator(interpolator: TimeInterpolator) = apply {
        if (animatorList.isEmpty()) {
            animatorSet.interpolator = interpolator
        } else {
            animatorList.last().interpolator = interpolator
        }
    }

    fun ofFloat(propertyName: String, vararg values: Float) = apply {
        animatorList.add(ObjectAnimator.ofFloat(view, propertyName, *values))
    }

    fun ofInt(propertyName: String, vararg values: Int) = apply {
        animatorList.add(ObjectAnimator.ofInt(view, propertyName, *values))
    }

    fun alpha(vararg values: Float): ViewAnimStreamItem = ofFloat("alpha", *values)

    fun heightDelta(vararg values: Int) = apply {
        val initHeight: Int = view?.layoutParams?.height ?: return@apply
        height(*(values.map { it + initHeight }.toIntArray()))
    }

    fun widthDelta(vararg values: Int) = apply {
        val initWidth: Int = view?.layoutParams?.width ?: return@apply
        width(*(values.map { it + initWidth }.toIntArray()))
    }

    fun height(vararg values: Int): ViewAnimStreamItem = apply {
        val anim = ValueAnimator.ofInt(*values)
        anim.addUpdateListener {
            it ?: return@addUpdateListener
            val value = it.animatedValue as Int
            view?.layoutParams = view?.layoutParams?.apply {
                height = value
            }
        }
        animatorList.add(anim)
    }

    fun width(vararg values: Int): ViewAnimStreamItem = apply {
        val anim = ValueAnimator.ofInt(*values)
        anim.addUpdateListener {
            it ?: return@addUpdateListener
            val value = it.animatedValue as Int
            view?.layoutParams = view?.layoutParams?.apply {
                if (value >= 0) {
                    // 小于0继续赋值会有问题
                    width = value
                }
            }
        }
        animatorList.add(anim)
    }

    fun rotation(vararg values: Float): ViewAnimStreamItem = ofFloat("rotation", *values)

    fun translationY(vararg values: Float): ViewAnimStreamItem = ofFloat("translationY", *values)

    fun translationX(vararg values: Float): ViewAnimStreamItem = ofFloat("translationX", *values)

    fun scale(vararg values: Float) = apply {
        animatorList.add(AnimatorSet().apply {
            playTogether(ObjectAnimator.ofFloat(view, "scaleX", *values),
                ObjectAnimator.ofFloat(view, "scaleY", *values))
        })
    }

    fun onAnimationRepeat(onAnimationRepeat: ((animation: Animator?, view: View) -> Unit)) = apply {
        this.onAnimationRepeat = onAnimationRepeat
    }

    fun onAnimationEnd(onAnimationEnd: ((animation: Animator?, view: View) -> Unit)) = apply {
        this.onAnimationEnd = onAnimationEnd
    }

    fun onAnimationCancel(onAnimationCancel: ((animation: Animator?, view: View) -> Unit)) = apply {
        this.onAnimationCancel = onAnimationCancel
    }

    fun onAnimationStart(onAnimationStart: ((animation: Animator?, view: View) -> Unit)) = apply {
        this.onAnimationStart = onAnimationStart
    }

    fun onFinally(onFinally: (view: View) -> Unit) = apply {
        this.onFinally = onFinally
    }
}