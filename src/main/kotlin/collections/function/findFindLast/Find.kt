package collections.function.findFindLast

fun main() {

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    //找出第一个满足条件的元素
    val first = words.find { it.startsWith("some") }
    //找出最后一个满足条件的元素
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }
    println(first)
    println(last)
    println(nothing)
}