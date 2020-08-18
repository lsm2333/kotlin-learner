package controlFlow.loops

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
    //自定义了循环器操作符，从而能对Zoo类循环
    operator fun iterator(): Iterator<Animal> {
        return Iterator(animals)
    }

    class Iterator<Animal>(private val animals: List<Animal>) : kotlin.collections.Iterator<Animal> {
        private var index: Int = 0

        override fun hasNext(): Boolean {
            return index < animals.size
        }

        override fun next(): Animal {
            val animal = animals[index]
            index += 1
            return animal
        }

    }
}

fun main() {
    val zoo = Zoo(listOf(Animal("tiger"), Animal("lion")))
    for (animal in zoo) {
        println("Be careful, there is a ${animal.name}")
    }
}