package polukhin.apps.daggergrocery.di.purchase

import android.util.Log
import dagger.Module
import dagger.Provides
import polukhin.apps.daggergrocery.pojo.purchase.Purchase

@Module
class PurchaseModule {

    @PurchaseScope
    @Provides
    fun getGroceryPoints(): Purchase {
        // Get cashback points:
        Log.d("MYAPPDEBUG", "PurchaseModule.getGroceryPoints()")
        return Purchase(73.2f, 12)
    }

}