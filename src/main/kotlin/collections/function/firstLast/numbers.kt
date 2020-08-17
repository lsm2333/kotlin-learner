package collections.function.firstLast

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    //此时相当于findFirst
    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println(first)
    println(last)
    println(firstEven)
    println(lastOdd)

    try {
        //如果first找不到，会抛出异常
        numbers.first { it == 0 }
    } catch (e: NoSuchElementException) {
        e.printStackTrace()
    }

    println(setOf(4, 1, 3).first())
}