package pub.gll.onepeas.module.car.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CarBrandEntity")
data class CarBrandEntity(
    @PrimaryKey
    val id:String,
    val name:String,
    val icon:String,
    val page:Int=0,
)