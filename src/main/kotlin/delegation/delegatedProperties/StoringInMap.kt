package delegation.delegatedProperties

class User(map: Map<String, Any?>) {
    //根据属性名从map中找到key获取value
    val name: String by map
    val age: Int     by map
}

/**
 * 可以利用map来存属性，很适合处理json
 *
 * @date 2020-08-17 19:42
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val user = User(
        mapOf(
            "name" to "John Doe",
            "age" to 25
        )
    )

    println("name = ${user.name}, age = ${user.age}")
}