package collections.function.associateByGroupBy

/**
 * 两者区别，主要是遇到同一key时的表现不同：
 * - associateBy会选到最后一个匹配的元素作为value
 * - groupBy会将同一key的元素都作为value，按list的形式存入
 *
 * @date 2020-08-17 14:25
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {

    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
    )

    //传入keySelector，默认valueSelector为完整的Person类对象
    val phoneBook = people.associateBy { it.phone }
    //valueSelector为city
    val cityBook = people.associateBy(Person::phone, Person::city)
    //Saint-Petersburg=Vasilisa此时匹配最后一个找到的元素返回
    val cityName = people.associateBy(Person::city, Person::name)
    //同一key时的处理按照city聚合，而不是简单的拆开
    val peopleCities = people.groupBy(Person::city, Person::name)
    println(phoneBook)
    println(cityBook)
    println(cityName)
    println(peopleCities)
}
