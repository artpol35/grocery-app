package polukhin.apps.daggergrocery

import polukhin.apps.daggergrocery.pojo.downloadData.Product
import polukhin.apps.daggergrocery.pojo.purchase.Transaction

object EXTRAS {

    val ListOfProducts: List<Product> = mutableListOf<Product>(
        Product("Kefit",50f,1),
        Product("Moloko",60f,2),
        Product("Hleb",12.5f,1),
        Product("Sahar",40f,1),
        Product("Iabloki",33.3f,3))

    val transaction: Transaction = Transaction(555L, "Ivan",111)
}