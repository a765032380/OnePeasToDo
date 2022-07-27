package pub.gll.onepeas.modulesample.theming.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val JetNewsShapes = Shapes(
    small = CutCornerShape(topStart = 8.dp),
    // small = RoundedCornerShape(topStart = 8.dp),
    medium = CutCornerShape(topStart = 24.dp),
    large = RoundedCornerShape(8.dp)
)