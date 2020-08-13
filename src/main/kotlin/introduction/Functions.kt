package introduction

/**
 * <B>Description:</B> 简略写法 <br>
 * <B>Create on:</B> 2020-08-13 17:18 <br>
 *
 * @param
 * @return
 * @author shengming.lin
 */
fun multiple(x: Int, y: Int) = x * y

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

/**
 * <B>Description:</B> 可选参数写法 <br>
 * <B>Create on:</B> 2020-08-13 17:16 <br>
 *
 * @param
 * @return
 * @author shengming.lin
 */
fun printWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun print(message: String): Unit {//Unit实际上可以省略
    println(message)
}

fun main() {
    print("1")
    printWithPrefix("2")
    printWithPrefix("3", "positionedArguments")//按位置传参数，positioned parameters
    printWithPrefix(prefix = "namedArguments", message = "4")//按参数名传参，named parameters
    println(sum(1, 4))
    println(multiple(2, 3))
}