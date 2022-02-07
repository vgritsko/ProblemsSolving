import easy.MergeSortedArray
import hard.NumsToWords
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MergeSortedArrayTests {

    @Test
    fun test1() {
        MergeSortedArray().merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)
    }

    @Test
    fun test2() {
        MergeSortedArray().merge(intArrayOf(0), 0, intArrayOf(1), 1)
    }

    @Test
    fun test3() {
        MergeSortedArray().merge(intArrayOf(2,0), 1, intArrayOf(1), 1)
    }
}