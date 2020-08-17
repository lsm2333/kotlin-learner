package collections.function.flatMap

fun main() {

    val numbers = listOf(1, 2, 3)

    //flatMap将每个元素都转换成一个可遍历的对象，并且将转换结果构建成一个list。转换过程是用户可定义的。
    //返回一个list，包含了各出现3次的1、2、3
    //循环每个元素，对每个元素都作listOf
    val tripled = numbers.flatMap { listOf(it, it, it) }
    println(tripled)
}
