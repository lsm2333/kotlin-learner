package scopeFunctions.let

/**
 * Kotlin 标准库包含几个函数，它们的唯一目的是在对象的上下文中执行代码块。当对一个对象调用这样的函数并提供一个 lambda 表达式时，它会形成一个临时作用域。在此作用域中，可以访问该对象而无需其名称。这些函数称为作用域函数。
 *
 * @date 2020-08-17 16:48
 * @param
 * @return
 * @author shengming.lin
 * @see <a href="https://www.kotlincn.net/docs/reference/scope-functions.html#let">let</a>
 **/
fun main() {
    //let执行代码块中的方法，并返回最后一个表达式的结果
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        //?作为空判断，只有非空时才会执行
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }
    printNonNull(null)
    printNonNull("my string")
}

fun customPrint(s: String) {
    print(s.toUpperCase())
}