package polukhin.apps.daggergrocery.di.app

import dagger.Component
import polukhin.apps.daggergrocery.di.downloadData.DownloadDataComponent
import polukhin.apps.daggergrocery.di.downloadData.DownloadDataUIModule
import polukhin.apps.daggergrocery.di.purchase.PurchaseComponent

@AppScope
@Component
interface AppComponent {

    fun downloadDataComponent(): DownloadDataComponent
    fun purchaseComponent(): PurchaseComponent
}