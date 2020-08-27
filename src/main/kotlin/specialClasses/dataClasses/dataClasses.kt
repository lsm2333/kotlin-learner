package specialClasses.dataClasses

/**
 * data class专门用来定义数据存储，这一特殊类在toString、equals、copy时能自动生成
 *
 * @date 2020-08-14 15:34
 * @author shengming.lin
 * @see
 **/
data class User(val name: String, val id: Int)

class NormalUser

fun main() {
    val user = User("Alex", 1)
    //会被更好地展示，User(name=Alex, id=1)
    println(user)

    val normalUser = NormalUser()
    //会打印出specialClasses.dataClasses.NormalUser@3cd1a2f1
    println(normalUser)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)
    //equals被自动生成，并根据定义的类属性来判断是否相等
    println("secondUser == user: ${secondUser == user}")
    println("thirdUser == user: ${thirdUser == user}")

    //相同的data class 会有相同的hashcode
    println("hashcode for user: ${user.hashCode()}")
    println("hashcode for secondUser: ${secondUser.hashCode()}")
    println("hashcode for thirdUser: ${thirdUser.hashCode()}")

    // copy()函数被自动生成，方便copy
    println(user.copy())
    println(user.copy("Max"))//copy和构造函数的参数顺序一致
    println(user.copy(id = 2))

    // componentN函数被自动生成，方便获取对象的属性，顺序和构造函数保持一致
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}