package specialClasses.sealedClasses

//sealed class不允许在该文件外的地方被继承
sealed class Mammal(val name: String)

class Cat(catName: String) : Mammal(catName)
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    //when对于sealed class也是不需要else，因为sealed class也是有限的
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}