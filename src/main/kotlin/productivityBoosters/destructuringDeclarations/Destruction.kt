package productivityBoosters.destructuringDeclarations

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(50, 100)
}

/**
 * 解构声明语法也是一个方便之处，能够节省代码行数
 *
 * @date 2020-08-17 19:56
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    //xyz对应了数组中不同index上的元素
    val (x, y, z) = arrayOf(5, 10, 15)

    val map = mapOf("Alice" to 21, "Bob" to 25)
    //name,age来命名key/value
    for ((name, age) in map) {
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))
    println("$min, $max")
}