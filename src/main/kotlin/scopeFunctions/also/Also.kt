package scopeFunctions.also

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")
}

fun main() {
    //also和apply相似，执行给定的代码块并返回对象本身。代码块中使用it来引用，所以可以用它来传值。这一方法用在想要做一些嵌套动作时的场景。比如链式调用里记录日志：
    val jake = Person("Jake", 30, "Android developer")
        .also {
            writeCreationLog(it)
        }
}