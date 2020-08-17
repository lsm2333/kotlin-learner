package productivityBoosters.stringTemplates

/**
 * 字符串模板允许把变量或表达式注入到字符串中。
 *
 * @date 2020-08-17 19:53
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val greeting = "Kotliner"

    println("Hello $greeting")
    println("Hello ${greeting.toUpperCase()}")
}