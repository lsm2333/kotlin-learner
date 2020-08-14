package introduction.classes

class Customer

class Contact(val id: Int, var email: String)

/**
 * 类的申明包括了：
 * - 类名
 * - 类头 class header 可选，包括了类型参数、主构造器
 * - 类体 class body，可选，用花括号包裹（若body为空，则可忽略）
 *
 * @date 2020-08-14 11:14
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {

    val customer = Customer()//不需要new关键字

    val contact = Contact(1, "fake@fake.com")
    println(contact.email)

    //直接通过.来访问成员变量并更新
    contact.email = "foo@foo.com"
    println(contact.email)
}