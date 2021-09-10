package polukhin.apps.daggergrocery.di.downloadData

import android.util.Log
import dagger.Module
import dagger.Provides
import polukhin.apps.daggergrocery.pojo.downloadData.GroceryRecyclerAdapter
import polukhin.apps.daggergrocery.pojo.downloadData.Product

@Module
class DownloadDataUIModule {

    @DownloadDataScope
    @Provides
    fun providesRecyclerView(): GroceryRecyclerAdapter {
        Log.d("MYAPPDEBUG", "DownloadDataUIModule.providesRecyclerView()")
        return GroceryRecyclerAdapter()
    }
}