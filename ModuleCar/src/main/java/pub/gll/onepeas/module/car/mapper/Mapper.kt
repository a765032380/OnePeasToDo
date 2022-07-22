package pub.gll.onepeas.module.car.mapper

interface Mapper<I,O> {
    fun map(input:I):O
}