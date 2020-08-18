package introduction.functions

/**
 * 带可变入参的方法
 *
 * @date 2020-08-13 19:57
 * @author shengming.lin
 * @see
 **/
fun main() {
    fun printAll(vararg messages: String) {
        messages.forEach { m -> println(m) }
    }
    printAll("1", "2", "3")

    //因为有named parameters特性，可以指定prefix参数，这个是java做不到的
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        messages.forEach { m -> println(prefix + m) }
    }
    printAllWithPrefix("4", "5", "6", prefix = "p")

    fun log(vararg entries: String) {
        //需要用spread操作符*来修饰，因为vararg在运行时被当作是数组，因此printAll(entries)的话会被当作是数组，从而不匹配方法签名
        printAll(*entries)
    }
}