package introduction

/**
 * 可以将方法升级成为操作符，相当于替换操作符语义
 *
 * @date 2020-08-13 19:36
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    //times对应操作符是 *
    println(2.times(2))
    println(2 * 2)
    //重新定义times，将repeat语义赋予times也是*操作符
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Ha ")

    //get对应[]操作符
    var str = "This is Nanjing Yangtze River Bridge"
    println(str.get(14))
    println(str[14])
    operator fun String.get(range: IntRange) = substring(range)
    println(str[0..14])
}