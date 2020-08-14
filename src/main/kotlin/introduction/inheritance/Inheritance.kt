package introduction.inheritance

/**
 * class默认是final的，因此要用open关键字修饰表示该类可继承
 *
 * @date 2020-08-14 11:49
 * @author shengming.lin
 * @see
 **/
open class Dog {
    //方法同样默认是final的，因此也需要加open来让它可重载
    open fun sayHello() = println("wow wow!")
}

open class Husky : Dog() {
    //用:来表达继承，括号指代了父类的默认构造器
    override fun sayHello() {
        //override关键字表示重载方法
        println("awhooo awhooo!")
    }
}

class MyHusky : Husky() {
    override fun sayHello() {
        println("ha ha!")
    }
}

//class MyHuskyChild : MyHusky() MyHusky没有被open修饰，无法通过编译

fun main() {
    var dog = Dog()
    dog.sayHello()

    dog = Husky()
    dog.sayHello()

    dog = MyHusky()
    dog.sayHello()
}