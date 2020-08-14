package specialClasses.objectKeyword

//这里object不是表达式，不会返回一个对象实例，有点像java中静态方法的概念需要直接访问它的成员方法/变量
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

fun main() {
    DoAuth.takeParams("foo", "qwerty")
}