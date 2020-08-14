package specialClasses.enumClasses

//定义有限、唯一的数据
enum class State {
    IDLE, RUNNING, FINISHED
}

/**
 * 还可定义带参数的枚举
 *
 * @date 2020-08-14 16:09
 * @author shengming.lin
 * @see
 **/
enum class Color(private val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    //与操作符，按位与计算
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val state = State.RUNNING
    //when遇到枚举时，可以不用else，因为可以穷举
    val str = when (state) {
        State.IDLE -> "Idle"
        State.RUNNING -> "Running"
        State.FINISHED -> "Finished"
    }
    println(str)

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}