package scopeFunctions.run

fun main() {
    //run和let功能基本相似，只是在方法块中是用this来访问的，从而可以简化方法调用
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        //run方法块里的方法可以忽略被调用的名字
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length//返回length
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}