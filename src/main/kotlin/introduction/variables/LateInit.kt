package introduction.variables

class MyTest {
    //    var a: String 如果这样写无法通过编译
    lateinit var a: String
}

/*
 * @author simon.lin
 * @description init lazy
 * @date 2020/8/27 11:32 上午
 * @also <a href="https://www.kotlincn.net/docs/reference/properties.html#%E5%BB%B6%E8%BF%9F%E5%88%9D%E5%A7%8B%E5%8C%96%E5%B1%9E%E6%80%A7%E4%B8%8E%E5%8F%98%E9%87%8F">reference</a>
 **/
fun main() {
    MyTest()
}