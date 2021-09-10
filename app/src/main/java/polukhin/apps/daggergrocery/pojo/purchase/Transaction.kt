package polukhin.apps.daggergrocery.pojo.purchase

import android.util.Log

class Transaction(
    var number: Long,
    var owner: String,
    var password: Int,
) {
    var cash: Long = 1000

    fun cashBalance(): Boolean {
        Log.d("MYAPPDEBUG", "Transaction.cashBalance()")
        return cash > 0
    }

    fun validation(): Boolean {
        //Some logic:
        Log.d("MYAPPDEBUG", "Transaction.validation()")
        return true
    }


    fun notification(): Boolean {
        //Some logic:
        Log.d("MYAPPDEBUG", "Transaction.notification()")
        return true
    }
}