package collections.function.anyAllNone

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //都满足时返回true
    val allEven = numbers.all { it % 2 == 0 }

    val allLess6 = numbers.all { it < 6 }

    println(allEven)
    println(allLess6)
}