package polukhin.apps.daggergrocery.di.purchase

import dagger.Subcomponent
import polukhin.apps.daggergrocery.pojo.downloadData.Product
import polukhin.apps.daggergrocery.pojo.purchase.Purchase
import polukhin.apps.daggergrocery.pojo.purchase.Transaction

@PurchaseScope
@Subcomponent(modules = [PurchaseModule::class, TransactionModule::class, CartUIModule::class])
interface PurchaseComponent {

    fun getTransaction(): Transaction

    fun getPurchase(): Purchase

    fun getData(): List<Product>
}
