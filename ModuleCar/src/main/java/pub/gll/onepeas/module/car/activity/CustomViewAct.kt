package pub.gll.onepeas.module.car.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import pub.gll.onepeas.module.car.databinding.ActivityCustomBinding

@AndroidEntryPoint
class CustomViewAct :AppCompatActivity(){
    private val mViewBinding : ActivityCustomBinding by lazy {
        ActivityCustomBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mViewBinding.root)
        mViewBinding.apply {
            mCustomView.smoothScrollTo(-200,-300)
        }

    }
}