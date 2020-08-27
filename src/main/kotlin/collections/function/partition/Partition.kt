package collections.function.partition

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    //符合条件的分一类，剩下的分一类，返回一个Pair类对象
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }
    println(evenOdd)
    println(positives)
    println(negatives)
}
