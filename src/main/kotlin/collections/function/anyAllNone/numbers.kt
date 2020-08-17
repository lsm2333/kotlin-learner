package collections.function.anyAllNone

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //any判断是否有满足条件的情况，并根据条件返回true/false
    val anyNegative = numbers.any { it < 0 }

    val anyGT6 = numbers.any { it > 6 }

    println(anyNegative)
    println(anyGT6)
}