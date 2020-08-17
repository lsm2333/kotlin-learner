package delegation.delegationPattern

class LazySample {
    init {
        println("created!")//此时lazyStr不被初始化
    }

    //如果要确保线程安全，使用blockingLazy()。它能确保值只在一个线程里被计算，并且其他线程看到的是相同的值。
    val lazyStr: String by lazy { //通过lazy关键字来让lazyStr懒加载
        println("computed!")
        "my lazy"//初始化值
    }
}

/**
 * kotlin还提供了很多有用的委托，比如lazy、observable等。其中lazy主要为懒加载使用
 *
 * @date 2020-08-17 19:24
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")//此时初始化lazyStr
    println(" = ${sample.lazyStr}")
}