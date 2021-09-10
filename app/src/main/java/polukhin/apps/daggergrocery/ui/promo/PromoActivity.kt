package polukhin.apps.daggergrocery.ui.promo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_promo.*
import polukhin.apps.daggergrocery.App
import polukhin.apps.daggergrocery.EXTRAS
import polukhin.apps.daggergrocery.R
import polukhin.apps.daggergrocery.di.downloadData.DownloadDataComponent
import polukhin.apps.daggergrocery.pojo.downloadData.GroceryRecyclerAdapter
import polukhin.apps.daggergrocery.pojo.downloadData.Product
import polukhin.apps.daggergrocery.ui.cart.CartActivity
import javax.inject.Inject

class PromoActivity : AppCompatActivity() {

    @Inject
    lateinit var recyclerAdapter: GroceryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promo)

        val downloadDataComponent: DownloadDataComponent = (application as App).appComponent
            .downloadDataComponent()

        downloadDataComponent.injectDownloadDataUiModule(this)

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = recyclerAdapter
        recyclerAdapter.setData(EXTRAS.ListOfProducts)

//        val data: List<Product> = downloadDataComponent.getData()

        buttonNext.setOnClickListener {
            val intent: Intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}