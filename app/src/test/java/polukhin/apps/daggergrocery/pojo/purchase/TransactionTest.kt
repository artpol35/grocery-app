package polukhin.apps.daggergrocery.pojo.purchase

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TransactionTest {

    private lateinit var transaction: Transaction

    @Before
    fun setUp() {
       transaction = Transaction(121, "asa",21)
    }

    @Test
    fun name() {
        TODO("Not yet implemented")
    }
}