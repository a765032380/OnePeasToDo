package pub.gll.onepeas.todo.car.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pub.gll.onepeas.todo.databinding.ActivityCustomBinding

class CustomViewAct :AppCompatActivity(){
    private val mViewBinding :ActivityCustomBinding by lazy {
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