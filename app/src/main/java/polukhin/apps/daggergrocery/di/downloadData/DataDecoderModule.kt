package polukhin.apps.daggergrocery.di.downloadData

import android.util.Log
import dagger.Module
import dagger.Provides
import org.json.JSONObject
import polukhin.apps.daggergrocery.EXTRAS
import polukhin.apps.daggergrocery.pojo.downloadData.DataDecoder
import polukhin.apps.daggergrocery.pojo.downloadData.Product

@Module
class DataDecoderModule {

    // Simulation of decoding JSON format:
    @DownloadDataScope
    @Provides
    fun decodeFromJsonToArray(jsonObject: JSONObject) : List<Product> {
        DataDecoder().decodeData()
        Log.d("MYAPPDEBUG", "DataDecoderModule.decodeFromJsonToArray()")
        return EXTRAS.ListOfProducts
    }
}