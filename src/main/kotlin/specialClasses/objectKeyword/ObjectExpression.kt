package specialClasses.objectKeyword

// kotlin中也有类和对象的概念，类是模板、而对象是类的实例
// 同样地，在kotlin中也可以创建"单例"对象，所要做的就是使用object关键字，被它修饰的实例会在使用时被懒加载
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {

    // 有时候，我们需要创建一个对某个类做了轻微改动的类的对象，而不用为之显式声明新的子类
    // 类似这样的使用，没有必要专门定义一个类，因为这个对象只会在这一方法使用
    // 在java中对应了匿名对象实例的概念
    // 这里object是表达式，返回一个实例
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

}

fun main() {
    rentPrice(10, 2, 1)
}