package pub.gll.onepeas.libbase.activity

import androidx.annotation.ContentView
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment {

    constructor() : super()

    @ContentView
    constructor(@LayoutRes contentLayoutId: Int) : super(contentLayoutId)


}