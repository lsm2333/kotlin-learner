package introduction.generics

/**
 * 范型作为现代高级语言的标配，在kotlin也被完好地支持。它通过抽离通用逻辑（于类型无关）来提高代码复用性，例如List<T>和T是什么类型无关
 *
 * @date 2020-08-14 11:23
 * @author shengming.lin
 * @see
 **/
class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements == null && elements.isEmpty()

    fun size(): Int = elements.size

    override fun toString(): String {
        return "MutableStack(${elements.joinToString()})"
    }
}

fun main() {
    //可以忽略类型指定
    val mutableStack = MutableStack("first")
    mutableStack.push("second")
    println(mutableStack)
    println(mutableStack.peek())
    println(mutableStack)
    println(mutableStack.pop())
    println(mutableStack)
}