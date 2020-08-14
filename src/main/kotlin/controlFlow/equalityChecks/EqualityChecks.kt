package controlFlow.equalityChecks

/**
 * ==/===分别等同于equals，和引用判断
 *
 * a == b 被编译为 a == null ? b == null : a.equals(b)
 *
 * @date 2020-08-14 15:24
 * @author shengming.lin
 * @see
 **/
fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    //判断set是否相等，set实现了equals，忽略顺序
    println(authors == writers)
    //引用不同，则返回false
    println(authors === writers)
}