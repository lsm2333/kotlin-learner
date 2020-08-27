package functional.higherOrderFunctions

/**
 * 将函数作为函数入参
 *
 * @date 2020-08-14 17:36
 * @param operation 一个函数，接受两个Int返回Int
 * @return
 * @author shengming.lin
 * @see
 **/
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(4, 5, ::sum)// ::跟上方法名用来引用一个方法
    val mulResult = calculate(4, 5) { a, b -> a * b }//使用lambda方法定义传入参数，若只有一个函数如餐，则lambda方法可以放在圆括号内，也可以放在外面
    println("sumResult $sumResult, mulResult $mulResult")
}