package productivityBoosters.destructuringDeclarations

class Pair<K, V>(private val first: K, private val second: V) {  //定义一个有component1/2的Pair类
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (num, name) = Pair(1, "one")             //这里就像自带Pair类一样来解构

    println("num = $num, name = $name")
}