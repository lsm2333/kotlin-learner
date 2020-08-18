package introduction.inheritance

/**
 * 带参数的可继承类
 *
 * @date 2020-08-14 11:57
 * @author shengming.lin
 * @see
 **/
open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

//在继承时调用构造函数
class DongBeiTiger : Tiger("DongBei")

fun main() {
    val dongBeiTiger = DongBeiTiger()
    dongBeiTiger.sayHello()
}