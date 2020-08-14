package specialClasses.objectKeyword

open class Rate(
    val standardDays: Int,
    val festivityDays: Int,
    val specialDays: Int
) {
    open fun calculate() {}
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {

    // 类似这样的使用，没有必要专门定义一个类，因为这个对象只会在这一方法使用
    // 在java中对应了匿名对象实例的概念
    // 这里object是表达式，返回一个实例
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")

}

fun main() {
    rentPrice(10, 2, 1)

    //有时候，我们需要创建一个对某个类做了轻微改动的类的对象，而不用为之显式声明新的子类。
    val monthRates = object : Rate(10, 2, 1) {
        override fun calculate() {
            val result = 30 * this.standardDays + 50 * festivityDays + 100 * specialDays
            println("Total price: $$result")
        }
    }
    monthRates.calculate()
}