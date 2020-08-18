package controlFlow.range

/**
 * range很方便，能快速定义范围如Int数组等
 *
 * @date 2020-08-14 15:15
 * @author shengming.lin
 * @see
 **/
fun main() {
    //0到3包括
    for (i in 0..3) {
        print(i)
    }

    print("\r\n")
    //step来设置间隔
    for (i in 0..6 step 2) {
        print(i)
    }

    print("\r\n")
    //downTo来降序
    for (i in 6 downTo 0 step 2) {
        print(i)
    }

    print("\r\n")
    //char的range也可以
    for (i in 'a'..'d') {
        print(i)
    }

    print("\r\n")
    //char的range也可以
    for (i in 'H' downTo 'A' step 2) {
        print(i)
    }

    //还可以用在if判断里
    print("\r\n")
    val x = 2
    if (x in 0..2) {
        println("$x is in 0~2 range")
    }

    if (x !in 3..4) {
        println("$x is not in 3~4 range")
    }
}