package pub.gll.onepeas.todo.car.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import pub.gll.onepeas.todo.car.model.CarBrandItemModel
import pub.gll.onepeas.todo.databinding.CarbrandItemBinding

class CarBrandAdapter(val context:Context):PagingDataAdapter<CarBrandItemModel,BindingViewHolder>(object :
    DiffUtil.ItemCallback<CarBrandItemModel>(){
    override fun areItemsTheSame(oldItem: CarBrandItemModel, newItem: CarBrandItemModel): Boolean {
        return oldItem.icon == newItem.icon
    }

    override fun areContentsTheSame(
        oldItem: CarBrandItemModel,
        newItem: CarBrandItemModel
    ): Boolean {
        return oldItem == newItem
    }
}) {
    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
        getItem(position).let {item->
            val binding = holder.viewBinding
            binding.carBrand = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val binding = CarbrandItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return BindingViewHolder(binding)
    }

}