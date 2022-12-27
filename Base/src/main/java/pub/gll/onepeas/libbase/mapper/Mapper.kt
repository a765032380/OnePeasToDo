package pub.gll.onepeas.libbase.mapper

interface Mapper<I,O> {
    fun map(input:I):O
}