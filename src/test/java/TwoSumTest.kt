import easy.TwoSum
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test



class TwoSumTest {
    @Test
    fun test1() {
         assertArrayEquals(TwoSum().twoSum(intArrayOf(2,7,11,15),9), intArrayOf(0,1))
    }

    @Test
    fun test2() {
        assertArrayEquals(TwoSum().twoSum(intArrayOf(3,2,4),6), intArrayOf(1,2))
    }

    @Test
    fun test3() {
        assertArrayEquals(TwoSum().twoSum(intArrayOf(3,3),6), intArrayOf(0,1))
    }
}