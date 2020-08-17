package productivityBoosters.namedArguments

fun format(userName: String, domain: String) = "$userName@$domain"

/**
 * named argument特性可以让方法调用更清晰，这是java不支持的。入参常常被混淆，尤其是入参的类型相同的时候。
 *
 * @date 2020-08-17 19:50
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    println(format("mario", "example.com"))
    println(format("domain.com", "username"))
    println(format(userName = "foo", domain = "bar.com"))
    println(format(domain = "frog.com", userName = "pepe"))
}