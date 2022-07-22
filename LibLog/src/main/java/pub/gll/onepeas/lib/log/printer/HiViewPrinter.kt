package pub.gll.onepeas.lib.log.printer

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pub.gll.onepeas.lib.log.config.HiLogConfig
import pub.gll.onepeas.lib.log.R
import pub.gll.onepeas.lib.log.adapter.HiLogViewAdapter
import pub.gll.onepeas.lib.log.adapter.LogBean


class HiViewPrinter : HiLogPrinter {
    companion object {
        private const val VIEW_TAG = "hi_view_recyclerview_tag"
    }

    private val hiLogViewAdapter: HiLogViewAdapter by lazy {
        HiLogViewAdapter()
    }
    private var recyclerView: RecyclerView? = null
    private var mTVClear: TextView? = null


    override fun print(config: HiLogConfig, level: Int, tag: String, content: String) {
        addData(level, tag, content)
    }

    private fun addData(level: Int, tag: String, content: String) {
//        list.add(LogBean(level, tag, System.currentTimeMillis(), content))
        hiLogViewAdapter.addData(LogBean(level, tag, System.currentTimeMillis(), content))
        scrollToPosition()
    }

    private var isShowLogView = false

    private fun initView(viewGroup: ViewGroup): View {
        val view = LayoutInflater.from(viewGroup.context).inflate(
            R.layout.hilog_view, viewGroup, false
        )
        recyclerView = view.findViewById(R.id.mLogRecycler)
        mTVClear = view.findViewById(R.id.mTVClear)
        recyclerView?.layoutManager = LinearLayoutManager(viewGroup.context)
        recyclerView?.adapter = hiLogViewAdapter

        val mTVState = view.findViewById<TextView>(R.id.mTVState)
        updateUI(mTVState)
        mTVState.setOnClickListener {
            isShowLogView = !isShowLogView
            updateUI(mTVState)
        }
        mTVClear?.setOnClickListener {
            hiLogViewAdapter.removeAll()
        }
        scrollToPosition()
        view.tag = VIEW_TAG
        return view
    }

    /**
     * 滚动到底部
     */
    private fun scrollToPosition(){
        if (hiLogViewAdapter.itemCount > 0) {
            recyclerView?.smoothScrollToPosition(hiLogViewAdapter.itemCount - 1)
        }
    }

    /**
     * 更新UI
     */
    private fun updateUI(mTVState:TextView){
        if (isShowLogView) {
            mTVState.text = "隐藏"
            recyclerView?.visibility = View.VISIBLE
            mTVClear?.visibility = View.VISIBLE
        } else {
            mTVState.text = "显示"
            recyclerView?.visibility = View.GONE
            mTVClear?.visibility = View.GONE
        }
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        val viewGroup = (activity.window.decorView as ViewGroup)
        val view = viewGroup.findViewWithTag<View>(VIEW_TAG)
        if (view != null) {
            viewGroup.removeView(view)
        }
//        if (activity is ComponentActivity){
//            activity.setContent {
//                LogListView(list)
//            }
//        }
        viewGroup.addView(initView(viewGroup))
    }
}