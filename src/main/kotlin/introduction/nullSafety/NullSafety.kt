package introduction.nullSafety

/**
 * 为了清除空指针异常，kotlin中不允许变量被null赋值。如果允许空，则要在变量后利用？来申明
 *
 * @date 2020-08-14 10:36
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    var neverNull: String = "This can't be null"
    //neverNull = null 这行代码无法通过编译
    var nullable: String? = "You can keep a null here"
    println(nullable)
    nullable = null
    println(nullable)//null会被toString
    var inferredNonNull = "The compiler assume non-null"
    //inferredNonNull = null 这行代码无法通过编译，因为未指定类型的会被默认为非空

    /**
     * 非空入参
     *
     * @date 2020-08-14 10:49
     * @param
     * @return
     * @author shengming.lin
     * @see
     **/
    fun strLength(notNull: String) {
    }

    /*
     * 如果不定义该方法，则对于可空传参将无法通过编译
     *
     * @date 2020-08-14 10:48
     * @param nullable 可空的入参
     * @return
     * @author shengming.lin
     * @see
     **/
    fun strLength(nullable: String?) {
    }

    strLength(neverNull)
    strLength(nullable)
}

