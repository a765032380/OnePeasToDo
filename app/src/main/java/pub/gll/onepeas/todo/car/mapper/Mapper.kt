package pub.gll.onepeas.todo.car.mapper

interface Mapper<I,O> {
    fun map(input:I):O
}