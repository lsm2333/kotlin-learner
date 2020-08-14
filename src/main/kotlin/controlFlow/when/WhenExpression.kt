package controlFlow.`when`

fun main() {
    class MyClass

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

/**
 * 和whenStatement不同的就是这里利用when来赋值
 *
 * @date 2020-08-14 14:19
 * @param obj
 * @return 被when控制的返回
 * @author shengming.lin
 * @see
 **/
fun whenAssign(obj: Any): Any {
    return when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42// else是必须的，除非编译器认为其他分支能覆盖所有when的可能
    }
}

