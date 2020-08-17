package delegation.delegationPattern

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()

    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

/**
 * 代理属性，允许将属性的set/get方法代理给特定对象。代理对象应该有getValue方法，可修改属性还需要setValue方法。
 *
 * @date 2020-08-17 19:17
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val e = Example()
    println(e.p)
    e.p = "NEW"
}