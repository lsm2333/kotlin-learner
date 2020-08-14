package specialClasses.objectKeyword

fun getBongs(nTimes: Int) {
    for (i in 1..nTimes) {
        print("BONG ")
    }
}

/**
 * 伴生对象，和java中的静态方法很类似。如果尝试使用，考虑用包级别（package-level）的方法替代
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