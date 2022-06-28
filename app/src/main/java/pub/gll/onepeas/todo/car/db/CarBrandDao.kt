package pub.gll.onepeas.todo.car.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CarBrandDao {
    @Query("DELETE FROM CarBrandEntity")
    suspend fun clearCarBrand()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCarBrand(carBrandList: List<CarBrandEntity>)

    @Query("SELECT * FROM CarBrandEntity")
    fun getCarBrand():PagingSource<Int,CarBrandEntity>
}