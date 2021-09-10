package polukhin.apps.daggergrocery.pojo.purchase

import android.util.Log

class Purchase(
    var summaryValue: Float,
    var cashback: Int
) {
    fun addPoints() {
        // Some logic:
        Log.d("MYAPPDEBUG", "Purchase.addPoints()")
    }

    fun writeOffPoints() {
        // Some logic:
        Log.d("MYAPPDEBUG", "Purchase.writeOffPoints()")
    }
}