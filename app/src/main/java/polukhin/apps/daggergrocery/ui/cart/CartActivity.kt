package polukhin.apps.daggergrocery.ui.cart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cart.*
import polukhin.apps.daggergrocery.App
import polukhin.apps.daggergrocery.R
import polukhin.apps.daggergrocery.di.purchase.PurchaseComponent
import polukhin.apps.daggergrocery.pojo.downloadData.Product
import polukhin.apps.daggergrocery.pojo.purchase.Purchase
import polukhin.apps.daggergrocery.pojo.purchase.Transaction
import polukhin.apps.daggergrocery.ui.promo.PromoActivity
import javax.inject.Inject

class CartActivity : AppCompatActivity() {

    @Inject lateinit var purchaseComponent: PurchaseComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        purchaseComponent = (application as App).appComponent.purchaseComponent()

        val data: List<Product> = purchaseComponent.getData()
        val transaction: Transaction = purchaseComponent.getTransaction()
        val purchase: Purchase = purchaseComponent.getPurchase()

        buttonWriteOff.setOnClickListener {
            Log.d("MYAPPDEBUG", "CartActivity.buttonWriteOff")
            purchase.writeOffPoints()
        }

        buttonCollect.setOnClickListener {
            Log.d("MYAPPDEBUG", "CartActivity.buttonCollect")
            purchase.addPoints()
        }

        buttonPay.setOnClickListener {
            if (transaction.validation() && transaction.cashBalance() && transaction.notification()) {
                Toast.makeText(this, "Transaction complete!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Transaction go wrong!", Toast.LENGTH_SHORT).show()
            }
        }

        buttonPrevious.setOnClickListener {
            val intent: Intent = Intent(this, PromoActivity::class.java)
            startActivity(intent)
            finish()
        }

        textViewCart.text = "Summary: ${getTotalValue(data)}"
    }

    private fun getTotalValue(data: List<Product>): Float {
        var summary: Float = 0f
        for (i in data) {
            // TODO: need checkout for input:
            summary += i.count!! * i.value!!
        }
        return summary
    }
}