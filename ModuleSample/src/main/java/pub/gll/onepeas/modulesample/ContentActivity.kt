package pub.gll.onepeas.modulesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.activity.compose.setContent
import pub.gll.onepeas.modulesample.animation.finished.Home
import pub.gll.onepeas.modulesample.basic.Conversation
import pub.gll.onepeas.modulesample.basic.SampleData
import pub.gll.onepeas.modulesample.effects.*
import pub.gll.onepeas.modulesample.gesture.GestureSample
import pub.gll.onepeas.modulesample.layouts.*
import pub.gll.onepeas.modulesample.localprovider.CompositionSample1
import pub.gll.onepeas.modulesample.localprovider.CompositionSample2
import pub.gll.onepeas.modulesample.localprovider.CompositionSample3
import pub.gll.onepeas.modulesample.localprovider.CompositionSample4
import pub.gll.onepeas.modulesample.theme.ComposeStudyTheme

class ContentActivity: ComponentActivity() {
    companion object {
        const val ANIMATION_1_1 = "动画1-1"
        const val ANIMATION_1_2 = "动画1-2"
        const val ANIMATION_2_1 = "动画2-1"
        const val ANIMATION_2_2 = "动画2-2"

        const val BASIC = "Basic"

        const val EFFECTS_DERIVEDSTATEOFSAMPLE = "DerivedStateOfSample"
        const val EFFECTS_DISPOSABLEEFFECTSAMPLE = "DisposableEffectSample"
        const val EFFECTS_LAUNCHEDEFFECTSAMPLE = "LaunchedEffectSample"
        const val EFFECTS_PRODUCESTATESAMPLE = "ProduceStateSample"
        const val EFFECTS_SCAFFOLDSAMPLE = "ScaffoldSample"
        const val EFFECTS_REMEMBERUPDATEDSTATESAMPLE = "RememberUpdatedStateSample"
        const val EFFECTS_SIDEEFFECTSAMPLE = "SideEffectSample"
        const val EFFECTS_SNAPSHOTFLOWSAMPLE = "SnapshotFlowSample"

        const val GESTURE_SAMPLE = "GestureSample"

        const val LAYOUT_CONSTRAINTLAYOUTCONTENT = "ConstraintLayoutContent"
        const val LAYOUT_TEXTWITHPADDINGTOBASELINE = "TextWithPaddingToBaseline"
        const val LAYOUT_LAYOUTSTUDY = "LayoutStudy"
        const val LAYOUT_MYOWNCOLUMN = "MyOwnColumn"
        const val LAYOUT_PHOTOGRAPHERCARD = "PhotographerCard"
        const val LAYOUT_STAGGEREDGRID = "StaggeredGrid"
        const val LAYOUT_TWOTEXTS = "TwoTexts"

        const val LOCAL_PROVIDER_SAMPLE1 = "local_provider_sample1"
        const val LOCAL_PROVIDER_SAMPLE2 = "local_provider_sample2"
        const val LOCAL_PROVIDER_SAMPLE3 = "local_provider_sample3"
        const val LOCAL_PROVIDER_SAMPLE4 = "local_provider_sample4"


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudyTheme {
                val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher!!
                when(intent.getStringExtra("title")){
                    ANIMATION_1_1 ->{
                        pub.gll.onepeas.modulesample.animation.start.Home()
                    }
                    ANIMATION_1_2 ->{
                        Home()
                    }
                    ANIMATION_2_1 ->{
                        pub.gll.onepeas.modulesample.animation2.start.Home()
                    }
                    ANIMATION_2_2 ->{
                        pub.gll.onepeas.modulesample.animation2.finished.Home()
                    }
                    BASIC ->{
                        Conversation(SampleData.conversationSample)
                    }
                    EFFECTS_DERIVEDSTATEOFSAMPLE ->{
                        DerivedStateOfSample()
                    }
                    EFFECTS_DISPOSABLEEFFECTSAMPLE ->{
                        DisposableEffectSample(dispatcher)
                    }
                    EFFECTS_LAUNCHEDEFFECTSAMPLE ->{
                        LaunchedEffectSample()
                    }
                    EFFECTS_PRODUCESTATESAMPLE ->{
                        ProduceStateSample()
                    }
                    EFFECTS_SCAFFOLDSAMPLE ->{
                        ScaffoldSample()
                    }
                    EFFECTS_REMEMBERUPDATEDSTATESAMPLE ->{
                        RememberUpdatedStateSample()
                    }
                    EFFECTS_SIDEEFFECTSAMPLE ->{
                        SideEffectSample(dispatcher)
                    }
                    EFFECTS_SNAPSHOTFLOWSAMPLE ->{
                        SnapshotFlowSample()
                    }
                    GESTURE_SAMPLE ->{
                        GestureSample()
                    }
                    LAYOUT_CONSTRAINTLAYOUTCONTENT ->{
                        ConstraintLayoutContent()
                    }
                    LAYOUT_TEXTWITHPADDINGTOBASELINE ->{
                        TextWithPaddingToBaseline()
                    }
                    LAYOUT_LAYOUTSTUDY ->{
                        LayoutStudy()
                    }
                    LAYOUT_MYOWNCOLUMN ->{
                        MyOwnColumn()
                    }
                    LAYOUT_PHOTOGRAPHERCARD ->{
                        PhotographerCard()
                    }
                    LAYOUT_STAGGEREDGRID ->{
                        StaggeredGrid()
                    }
                    LAYOUT_TWOTEXTS ->{
                        TwoTexts()
                    }
                    LOCAL_PROVIDER_SAMPLE1 ->{
                        CompositionSample1()
                    }
                    LOCAL_PROVIDER_SAMPLE2 ->{
                        CompositionSample2()
                    }
                    LOCAL_PROVIDER_SAMPLE3 ->{
                        CompositionSample3()
                    }
                    LOCAL_PROVIDER_SAMPLE4 ->{
                        CompositionSample4()
                    }

                }
            }
        }
    }
}
