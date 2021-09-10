package polukhin.apps.daggergrocery.di.purchase

import android.util.Log
import dagger.Module
import dagger.Provides
import polukhin.apps.daggergrocery.EXTRAS
import polukhin.apps.daggergrocery.pojo.purchase.Transaction

@Module
class TransactionModule {

    @Provides
    fun provideTransactionConnection(): Transaction {
        Log.d("MYAPPDEBUG", "TransactionModule.provideTransactionConnection()")
        return EXTRAS.transaction
    }
}