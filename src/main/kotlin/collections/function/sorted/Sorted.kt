package collections.function.sorted

fun main() {
    val shuffled = listOf(5, 4, 2, 1, 3)
    val natural = shuffled.sorted()//自然顺序，从小到大
    val inverted = shuffled.sortedBy { -it }//利用-it这种精简的写法逆序排列
    println(natural)
    println(inverted)
}
