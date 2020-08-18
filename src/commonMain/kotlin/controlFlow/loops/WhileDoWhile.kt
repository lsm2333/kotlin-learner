package controlFlow.loops

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

/**
 * while / do-while语法和意义和java中相符
 *
 * @date 2020-08-14 14:31
 * @author shengming.lin
 * @see
 **/
fun main() {
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    //做一次后判断循环条件
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}