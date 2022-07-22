package pub.gll.onepeas.lib.log.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater

import android.widget.TextView
import pub.gll.onepeas.lib.log.R
import pub.gll.onepeas.lib.log.HiLogType


class HiLogViewAdapter : RecyclerView.Adapter<HiLogViewAdapter.HiLogViewViewHolder>() {
    private val mData = arrayListOf<LogBean>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HiLogViewViewHolder {
        return HiLogViewViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.hilog_item, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: HiLogViewViewHolder, position: Int) {
        val logItem: LogBean = mData[position]
        val color: Int = getHighlightColor(logItem.level)
        holder.tagView.setTextColor(color)
        holder.tagView.text = logItem.flattenedLog()

    }

    fun addData(logBean: LogBean) {
        mData.add(logBean)
        notifyItemRangeInserted(mData.size - 1, 1)
    }

    fun removeAll() {
        mData.clear()
        notifyDataSetChanged()
    }

    /**
     * 跟进log级别获取不同的高了颜色
     *
     * @param logLevel log 级别
     * @return 高亮的颜色
     */
    private fun getHighlightColor(logLevel: Int): Int {
        val highlight: Int = when (logLevel) {
            HiLogType.V -> -0x444445
            HiLogType.D -> -0x1
            HiLogType.I -> -0x9578a7
            HiLogType.W -> -0x444ad7
            HiLogType.E -> -0x9498
            else -> -0x100
        }
        return highlight
    }

    override fun getItemCount() = mData.size

    class HiLogViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tagView: TextView = itemView.findViewById(R.id.tag)
    }
}