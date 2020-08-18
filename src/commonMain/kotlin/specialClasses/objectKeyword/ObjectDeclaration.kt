package specialClasses.objectKeyword

//这里object不是表达式，不会返回一个对象实例
//可以利用它来申明单例，它是线程安全的，并且在第一次访问时初始化
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

fun main() {
    DoAuth.takeParams("foo", "qwerty")
}