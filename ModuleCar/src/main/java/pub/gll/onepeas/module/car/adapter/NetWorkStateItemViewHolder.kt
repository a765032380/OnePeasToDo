package pub.gll.onepeas.module.car.adapter

import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import pub.gll.onepeas.module.car.databinding.NetworkStateItemBinding

class NetWorkStateItemViewHolder(val binding: NetworkStateItemBinding, val retryCallback:()->Unit): RecyclerView.ViewHolder(binding.root) {

    fun bind(loadState: LoadState){
        binding.apply {
            progressBar.isVisible = loadState is LoadState.Loading
            retryButton.isVisible = loadState is LoadState.Error
            retryButton.setOnClickListener { retryCallback() }
            errorMsg.isVisible = !(loadState as? LoadState.Error)?.error?.message.isNullOrBlank()
            errorMsg.text = (loadState as? LoadState.Error)?.error?.message
        }
    }
}