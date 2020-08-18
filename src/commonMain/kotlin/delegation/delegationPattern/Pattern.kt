package delegation.delegationPattern

interface LolPlayer {
    fun voiceComms()
}

class ADCPlayer(val n: String) : LolPlayer {
    override fun voiceComms() {
        println("$n no flash, Go go go!!!")
    }
}

class JunglePlayer(val n: String) : LolPlayer {
    override fun voiceComms() = println("I'll gank bottom line at level $n ")
}

class Uzi(n: String) : LolPlayer by ADCPlayer(n) //这里用了by来将实现委托给了ADCPlayer

class Clearlove(n: String) : LolPlayer by JunglePlayer(n)

/**
 * 委托模式是一种设计模式，指的是B类将方法委托给A类来执行。它已经证明是实现继承的一个很好的替代方式，而Kotlin可以零样板代码地原生支持它。
 *
 * @date 2020-08-17 17:28
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val uzi = Uzi("AD")
    uzi.voiceComms()
    val clearlove = Clearlove("2")
    clearlove.voiceComms()
}