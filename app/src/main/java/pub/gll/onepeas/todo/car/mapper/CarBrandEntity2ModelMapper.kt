package pub.gll.onepeas.todo.car.mapper

import pub.gll.onepeas.todo.car.db.CarBrandEntity
import pub.gll.onepeas.todo.car.model.CarBrandItemModel

class CarBrandEntity2ModelMapper:Mapper<CarBrandEntity,CarBrandItemModel> {
    override fun map(carBrandEntity: CarBrandEntity): CarBrandItemModel {
        return CarBrandItemModel(
            id = carBrandEntity.id,
            name = carBrandEntity.name,
            icon = carBrandEntity.icon
        )
    }
}