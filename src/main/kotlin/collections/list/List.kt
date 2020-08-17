package collections.list

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers //systemUsers被强转成List并被赋值给sudoers

fun addSudoer(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

/**
 * list可以是可修改的(MutableList)，也可以是只读的(List)。用listOf()来创建只读的list，用mutableListOf()创建可修改的list。为了防止不必要的修改，可以将可修改的list强转为List类型来获得只读的view。
 *
 * @date 2020-08-17 11:08
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    addSudoer(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach { i ->
        println("Some useful info on user $i")
    }
    //getSysSudoers().add(5) List无add方法

    println(systemUsers == sudoers) //true
    println(systemUsers === sudoers) //true
}