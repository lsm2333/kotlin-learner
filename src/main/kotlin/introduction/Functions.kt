package introduction

fun multiple(x: Int, y: Int) = x * y

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun printWithPrefix(message: String, prefix: String = "info") {
    println("[$prefix] $message")
}

fun print(message: String): Unit {
    println(message)
}

fun main() {
    print("1")
    printWithPrefix("2")
    printWithPrefix("3", "positionedArguments")
    printWithPrefix(prefix = "namedArguments", message = "4")
    println(sum(1, 4))
    println(multiple(2, 3))
}