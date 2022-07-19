package pub.gll.onepeas.todo.car.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import pub.gll.onepeas.libbase.R

@BindingAdapter("bindingAvator")
fun bindingAvator(imageView: ImageView,url:String?){
    imageView.load(url){
            crossfade(true)
            placeholder(R.mipmap.ic_launcher_round)
        }
}