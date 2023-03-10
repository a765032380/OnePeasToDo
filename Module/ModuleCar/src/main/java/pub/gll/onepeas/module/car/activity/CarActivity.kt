package pub.gll.onepeas.module.car.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.paging.LoadState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import pub.gll.onepeas.module.car.databinding.ActivityCarBinding
import pub.gll.onepeas.module.car.adapter.CarBrandAdapter
import pub.gll.onepeas.module.car.adapter.FooterAdapter
import pub.gll.onepeas.module.car.viewmodel.CarBrandViewModel
import javax.inject.Inject


@AndroidEntryPoint
class CarActivity : AppCompatActivity() {
    private val mViewBinding : ActivityCarBinding by lazy {
        ActivityCarBinding.inflate(layoutInflater)
    }
    @Inject
    lateinit var mViewModel: CarBrandViewModel

    private val mCarBrandAdapter: CarBrandAdapter by lazy {
        CarBrandAdapter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mViewBinding.root)
        mViewBinding.mRecyclerView.adapter = mCarBrandAdapter.withLoadStateFooter(FooterAdapter(mCarBrandAdapter,this))
        mViewModel.data.observe(this){
            mCarBrandAdapter.submitData(lifecycle,it)
        }
        lifecycleScope.launchWhenCreated {
            mCarBrandAdapter.loadStateFlow.collectLatest {
                mViewBinding.mSwipeRefreshLayout.isRefreshing = it.refresh is LoadState.Loading
            }
        }
    }
}