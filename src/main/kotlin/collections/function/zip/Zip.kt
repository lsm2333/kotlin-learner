package collections.function.zip

fun main() {

    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    //将两个list合并，同一index的合并成一个Pair，这里4会被忽略
    val resultPairs = A zip B
    //按自己的规则合并
    val resultReduce = A.zip(B) { a, b -> "$a$b" }
    println(resultPairs)
    println(resultReduce)
}
