package introduction.generics

/**
 * 范型方法
 *
 * @date 2020-08-14 11:36
 * @param element 可变参数
 * @return
 * @author shengming.lin
 * @see
 **/
fun <E> newMutableStack(vararg element: E) = MutableStack(*element)

fun <E> selfIntroduce(vararg student: E) {
    for (s in student) {
        print("$s ")
    }
}

fun main() {
    val newMutableStack = newMutableStack(1, 2, 3, 4, 5)
    println(newMutableStack)

    selfIntroduce(1, 2, 3, "4", newMutableStack)
}