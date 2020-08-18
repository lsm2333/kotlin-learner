package productivityBoosters.smartCasts

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

/**
 * kotlin支持自动类型转换，可以根据实际情况自动转换类型。比如把可空对象转为非空对象，或把supertype转为subtype
 *
 * @date 2020-08-18 14:14
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    val date: ChronoLocalDate? = LocalDate.now() //定义一个可空的变量，LocalDate实现了ChronoLocalDate

    if (date != null) {
        println(date.isLeapYear) //转换成非空对象
    }

    if (date != null && date.isLeapYear) { //转换成非空对象，因为date不等于null
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) { //转换成非空对象，因为date不等于null
        println("There's no Feb 29 this year...")
    }

    //date.monthValue这里是没有该属性，因为还是ChronoLocalDate
    if (date is LocalDate) {
        val month = date.monthValue //ChronoLocalDate转换成LocalDate
        println(month)
    }
}