package polukhin.apps.daggergrocery.pojo.downloadData

class Product(
    var name: String? = null,
    var value: Float? = null,
    var count: Int? = null
) {

    override fun toString(): String {
        return "Product(name=$name, value=$value, count=$count)"
    }
}
