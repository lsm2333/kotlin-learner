package controlFlow.conditionalExpression

/**
 * 利用if来替代java中的三目运算符
 *
 * @date 2020-08-14 15:28
 * @author shengming.lin
 * @see
 **/
fun main() {
    //这里if是表达式，会返回一个值
    fun max(a: Int, b: Int) = if (a > b) a else b
    println(max(1, 2))
}