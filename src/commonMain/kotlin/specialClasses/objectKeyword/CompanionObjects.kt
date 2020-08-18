package specialClasses.objectKeyword

fun getBongs(nTimes: Int) {
    for (i in 1..nTimes) {
        print("BONG ")
    }
}

/**
 * 伴生对象，和java中的静态方法很类似。如果尝试使用，考虑用包级别（package-level）的方法替代
 *
 * 对象表达式和对象声明之间的语义差异
 * 对象表达式和对象声明之间有一个重要的语义差别：
 * - 对象表达式是在使用他们的地方立即执行（及初始化）的；
 * - 对象声明是在第一次被访问到时延迟初始化的；
 * - 伴生对象的初始化是在相应的类被加载（解析）时，与 Java 静态初始化器的语义相匹配。
 *
 * @date 2020-08-14 16:53
 * @author shengming.lin
 * @see <a href="https://kotlinlang.org/docs/reference/object-declarations.html">object-declarations</a>
 **/
class BigBen {
    //伴生对象名-Bonger可忽略
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)
}