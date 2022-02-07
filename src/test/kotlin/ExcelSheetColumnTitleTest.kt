import easy.ExcelSheetColumnTitle
import hard.NumsToWords
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ExcelSheetColumnTitleTest {
    @Test
    fun test1() {
        Assertions.assertEquals("A",ExcelSheetColumnTitle().convertToTitle(1))
    }

    @Test
    fun test2() {
        Assertions.assertTrue(ExcelSheetColumnTitle().convertToTitle(28).equals("AB"))
    }

    @Test
    fun test3() {
        Assertions.assertTrue(ExcelSheetColumnTitle().convertToTitle(701).equals("ZY"))
    }

    @Test
    fun test4() {
        Assertions.assertTrue(ExcelSheetColumnTitle().convertToTitle(2147483647).equals("FXSHRXW"))
    }

    @Test
    fun test5() {
        Assertions.assertTrue(ExcelSheetColumnTitle().convertToTitle(52).equals("AZ"))
    }
}
