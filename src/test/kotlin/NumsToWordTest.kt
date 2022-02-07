import easy.RemoveDuplicates
import hard.NumsToWords
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumsToWordTest {
    @Test
    fun test1 () {
        //Assertions.assertEquals(NumsToWords().numberToWords(2),"2")
        Assertions.assertTrue(NumsToWords().numberToWords(2).equals("2"))
    }
}