import easy.RemoveElement
import medium.SubstringWithoutRepeating
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SubstringWithoutRepeatingTest {

    @Test
    fun test1() {
        Assertions.assertEquals(SubstringWithoutRepeating().lengthOfLongestSubstring("abcabcbb"),3)
    }

    @Test
    fun test2() {
        Assertions.assertEquals(SubstringWithoutRepeating().lengthOfLongestSubstring("bbbbb"),1)
    }

    @Test
    fun test3() {
        Assertions.assertEquals(SubstringWithoutRepeating().lengthOfLongestSubstring(" "),1)
    }

    @Test
    fun test4() {
        Assertions.assertEquals(SubstringWithoutRepeating().lengthOfLongestSubstring("au"),2)
    }

    @Test
    fun test5() {
        Assertions.assertEquals(SubstringWithoutRepeating().lengthOfLongestSubstring("dvdf"),3)
    }

}