package controlFlow.`when`

fun cases(obj: Any) {
    //所有条件被按顺序匹配，第一个满足的分支会被执行
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")// else表达默认情况，可以省略
    }
}


fun main() {
    cases("Hello")
    cases(1)
    cases(1L)
    cases(MyClass())
    cases("hello")
}

class MyClass