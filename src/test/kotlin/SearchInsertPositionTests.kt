import easy.ExcelSheetColumnTitle
import easy.SearchInsertPosition
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SearchInsertPositionTests {
    @Test
    fun test1() {
        Assertions.assertEquals(2, SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 5))
    }

    @Test
    fun test2() {
        Assertions.assertEquals(1, SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 2))
    }

    @Test
    fun test3() {
        Assertions.assertEquals(0, SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 0))
    }

    @Test
    fun test4() {
        Assertions.assertEquals(0, SearchInsertPosition().searchInsert(intArrayOf(1), 0))
    }

    @Test
    fun test5() {
        Assertions.assertEquals(4, SearchInsertPosition().searchInsert(intArrayOf(1, 3, 5, 6), 7))
    }

}