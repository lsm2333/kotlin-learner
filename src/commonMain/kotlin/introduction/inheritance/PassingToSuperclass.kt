package introduction.inheritance

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

/**
 * name被定义来传给父类
 *
 * @date 2020-08-14 12:01
 * @author shengming.lin
 * @see
 **/
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}