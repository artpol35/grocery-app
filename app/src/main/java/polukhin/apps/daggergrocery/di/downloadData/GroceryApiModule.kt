package polukhin.apps.daggergrocery.di.downloadData

import android.util.Log
import dagger.Module
import dagger.Provides
import org.json.JSONObject
import polukhin.apps.daggergrocery.pojo.downloadData.GroceryApi

@Module
class GroceryApiModule {

    //Simulation of http request to server:
    @DownloadDataScope
    @Provides
    fun getDataFromAPI(): JSONObject {
        GroceryApi().getData()
        Log.d("MYAPPDEBUG", "GroceryApiModule.getDataFromAPI()")
        return JSONObject()
    }
}