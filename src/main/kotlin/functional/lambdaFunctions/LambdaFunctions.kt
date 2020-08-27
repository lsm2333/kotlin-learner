package functional.lambdaFunctions

fun main() {

    val upperCase1: (String) -> String =
        { str: String -> str.toUpperCase() }// 花括号内的为lambda函数，这里被赋值给一个类型为(String) -> String 的变量

    val upperCase2: (String) -> String = { str -> str.toUpperCase() }// lambda函数的类型由被赋值变量的类型推断

    val upperCase3 = { str: String -> str.toUpperCase() }// 变量的类型由lambda函数推断

    // val upperCase4 = { str -> str.toUpperCase() } 这种不支持，编译器无法知道具体类型

    val upperCase5: (String) -> String = { it.toUpperCase() }// 如果只有单个参数，则可以用it来指代

    val upperCase6: (String) -> String = String::toUpperCase// 如果lambda只包含了一个函数，则可以用::来指代

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))
}
