package polukhin.apps.daggergrocery.di.downloadData

import dagger.Subcomponent
import polukhin.apps.daggergrocery.pojo.downloadData.Product
import polukhin.apps.daggergrocery.ui.promo.PromoActivity

@DownloadDataScope
@Subcomponent(modules = [DownloadDataUIModule::class, DataDecoderModule::class,
    GroceryApiModule::class])
interface DownloadDataComponent {

    fun injectDownloadDataUiModule(promoActivity: PromoActivity)

    fun getData(): List<Product>

}
