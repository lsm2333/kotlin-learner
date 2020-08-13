package introduction

/**
 * 中缀表达式
 *
 * - 它们必须是成员函数或扩展函数；
 * - 它们必须只有一个参数；
 * - 其参数不得接受可变数量的参数且不能有默认值。
 *
 * @date 2020-08-13 17:25
 * @author shengming.lin
 * @see <a href="https://kotlinlang.org/docs/reference/functions.html#infix-notation">infix-notation</a>
 **/
fun main() {

    //如此定义后，可以当作类似 + 操作符使用
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Simon" to "Lin"//等价于"Simon".to("Lin")
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "Simon" onto "Lin"
    println(myPair)

    val simon = Person("Simon")
    val ironMan = Person("Iron Man")
    val superMan = Person("Super Man")
    simon likes ironMan
    simon likes superMan
    simon.selfIntroduce()

    infix fun Person.dislike(other: Person) = println("$this dislikes $other")
    val huiTaiLang = Person("huiTaiLang")
    simon dislike huiTaiLang
}

class Person(private val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {//此时第一参数为Person类
        likedPeople.add(other)
    }

    override fun toString(): String {
        return name
    }

    fun selfIntroduce() {
        println("My name is $name and I like $likedPeople")
    }
}