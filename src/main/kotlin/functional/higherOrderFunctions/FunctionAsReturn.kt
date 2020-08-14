package functional.higherOrderFunctions

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val func = operation()// 调用后返回的是一个函数
    println(func(2))
    println(operation()(2))
}