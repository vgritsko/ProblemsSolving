
import easy.RemoveDuplicates
import easy.TwoSum
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class RemoveDublicatesTest {
    @Test
    fun test1() {
        Assertions.assertEquals(RemoveDuplicates().removeDuplicates(intArrayOf(1,1,2)),2)
    }

    @Test
    fun test2() {
        Assertions.assertEquals(RemoveDuplicates().removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3,3,4)),5)
    }

    @Test
    fun test3() {
        Assertions.assertEquals(RemoveDuplicates().removeDuplicates(intArrayOf(1,1,2)),2)
    }
}