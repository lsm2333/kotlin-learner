package collections.function.anyAllNone

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //none在集合中所有元素都不满足时返回true，否则返回false
    val allEven = numbers.none { it % 2 == 1 }

    val allLess6 = numbers.none { it > 6 }

    println(allEven)
    println(allLess6)
}