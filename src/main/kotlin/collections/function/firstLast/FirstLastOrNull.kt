package collections.function.firstLast

fun main() {

    val words = listOf("foo", "bar", "baz", "faz")
    val empty = emptyList<String>()

    //和first的区别是如果找不到会返回null而非抛出异常
    val first = empty.firstOrNull()
    val last = empty.lastOrNull()

    val firstF = words.firstOrNull { it.startsWith('f') }
    val firstZ = words.firstOrNull { it.startsWith('z') }
    val lastF = words.lastOrNull { it.endsWith('f') }
    val lastZ = words.lastOrNull { it.endsWith('z') }

    println(first)
    println(last)
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)
}