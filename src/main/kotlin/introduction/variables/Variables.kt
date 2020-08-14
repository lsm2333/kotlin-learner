package introduction.variables

fun main() {
    //kotlin类型推断非常强大，可以显式地指定变量类型，也可以让编译器推断
    var a: String = "initial"
    println(a)
    //val定义不可变变量，相当于java中的final，var定义可变变量
    val b = 1
    //变量必须在读取前被初始化
    var c: String
    //println(c)这句话编译时无法通过
}