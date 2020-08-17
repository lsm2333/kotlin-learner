package scopeFunctions.apply

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")//不写的话则必须在初始化时传入属性
}

fun main() {
    val jake = Person()
    //apply用来初始化很方便，比如下面就用了apply初始化属性，name等同于this.name。结果返回对象本身。
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)
}