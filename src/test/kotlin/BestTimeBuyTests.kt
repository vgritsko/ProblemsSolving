import easy.BestTimeBuy
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BestTimeBuyTests {

    @Test
    fun test1() {
        Assertions.assertEquals(5,BestTimeBuy().maxProfit(intArrayOf(7,1,5,3,6,4)))
    }

    @Test
    fun test2() {
        Assertions.assertEquals(0,BestTimeBuy().maxProfit(intArrayOf(7,6,4,3,1)))
    }


    @Test
    fun test3() {
        Assertions.assertEquals(2,BestTimeBuy().maxProfit(intArrayOf(2,4,1)))
    }
}