package collections.map

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)//用关键字to来表达映射
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { k, v -> //map的kv遍历，比较优雅
        println("ID $k: credit $v")
    }
}

/**
 * map和list一样也有可修改/不可修改之分，可以用mutableMapOf和mapOf分别来创建
 *
 * @date 2020-08-17 11:40
 * @param
 * @return
 * @author shengming.lin
 * @see
 **/
fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
    EZPassAccounts[1] = 100
    accountsReport()
}