package polukhin.apps.daggergrocery.di.purchase

import dagger.Module
import dagger.Provides
import polukhin.apps.daggergrocery.EXTRAS
import polukhin.apps.daggergrocery.pojo.downloadData.Product

@Module
class CartUIModule {

    @Provides
    fun getData(): List<Product> {
        return EXTRAS.ListOfProducts
    }
}