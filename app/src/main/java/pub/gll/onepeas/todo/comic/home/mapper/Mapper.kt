package pub.gll.onepeas.todo.comic.home.mapper

interface Mapper<I,O> {
    fun map(input:I):O
}