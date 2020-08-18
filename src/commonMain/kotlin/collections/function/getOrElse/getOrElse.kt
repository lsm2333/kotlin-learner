package collections.function.getOrElse

fun main() {
    val list = listOf(0, 10, 20)
    //按index获取不到则返回默认值
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })
}
