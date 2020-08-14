package functional.extensionFunctions

/**
 * Kotlin 能够扩展一个类的新功能而无需继承该类或者使用像装饰者这样的设计模式。这通过叫做扩展的特殊声明完成。
 * 例如，你可以为一个你不能修改的、来自第三方库中的类编写一个新的函数。
 * 这个新增的函数就像那个原始类本来就有的函数一样，可用普通的方法调用。这种机制称为扩展函数。
 * 此外，也有扩展属性，允许你为一个已经存在的类添加新的属性。
 *
 * @date 2020-08-14 19:04
 * @author shengming.lin
 * @see
 **/
data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

// 给Order类添加maxPricedItemValue这个拓展方法
fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F
// 给Order类添加maxPricedItemName这个拓展方法
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"
// 给Order类添加commaDelimitedItemNames这个拓展属性
val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

}