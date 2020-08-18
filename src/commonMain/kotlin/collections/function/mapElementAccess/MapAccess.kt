package collections.function.mapElementAccess

fun main() {
    val map = mapOf("key" to 42)

    //找不到则返回null
    val value1 = map["key"]
    val value2 = map["key2"]
    println(value1)
    println(value2)

    //找不到会抛异常
    val value3: Int = map.getValue("key")
    println(value3)

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault["key2"]
    println(value4)

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
}