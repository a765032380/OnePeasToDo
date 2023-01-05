package pub.gll.onepeas.todo.gradle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pub.gll.onepeas.todo.R
import pub.gll.onepeas.todo.gradle.annotation.CostTime

class MainActivity : AppCompatActivity() {

    @CostTime
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}