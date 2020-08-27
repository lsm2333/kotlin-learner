package productivityBoosters.destructuringDeclarations

data class User(val username: String, val email: String)

fun getUser() = User("Mary", "mary@somewhere.com")

/**
 * 结构实例
 *
 * @date 2020-08-17 20:05
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val user = getUser()
    val (email, username) = user //结构实例，变量按顺序对应了属性名
    println(username == user.component1())
    println(email == user.component1())

    val (_, emailAddress) = getUser() //使用_来指代没有用到的属性

}