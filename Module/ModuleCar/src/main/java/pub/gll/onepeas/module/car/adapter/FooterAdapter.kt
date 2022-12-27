package pub.gll.onepeas.module.car.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import pub.gll.onepeas.module.car.databinding.NetworkStateItemBinding

class FooterAdapter (private val carBrandAdapter: CarBrandAdapter, val context: Context) :LoadStateAdapter<NetWorkStateItemViewHolder>(){
    override fun onBindViewHolder(holder: NetWorkStateItemViewHolder, loadState: LoadState) {
        val params  = holder.itemView.layoutParams
        if(params is StaggeredGridLayoutManager.LayoutParams){
            params.isFullSpan = true
        }
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ): NetWorkStateItemViewHolder {
        val binding = NetworkStateItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return NetWorkStateItemViewHolder(binding){
            carBrandAdapter.refresh()
        }
    }
}