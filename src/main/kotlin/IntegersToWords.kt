import com.sun.xml.internal.fastinfoset.util.StringArray
import java.lang.Math.abs
import java.lang.Math.log10

/*
class Solution {

    val wordsOfFirstOrder = arrayOf(
        "Zero",
        "One",
        "Two",
        "Thee",
        "Four",
        "Five",
        "Six",
        "Seven",
        "Eight",
        "Nine",
        "Ten",
        "Eleven",
        "Twelve",
        "Thirteen",
        "Fourteen",
        "Fifteen",
        "Sixteen",
        "Seventeen",
        "Eighteen",
        "Mineteen"
    )
    val wordsOfSecondOrder =
        arrayOf("Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
    val hundredWord = "Hundred"
    val thousandWord = "Thousand"
    val millionWord = "Million"
    val billionWord = "Billion"


    fun numberToWords(num: Int): String {
        if (num.length() == 1) return wordsOfFirstOrder[num]
        if (num.length() == 2) return secondOrderToWords(num)
        if (num.length() == 3) return thirdOrderToWords(num)
        if (num.length() in 4..6) return fourOrderToWords(num)
        if (num.length() in 7..9) return fiveOrderToWords(num)
        if (num.length() in 10..12) return sixOrderToWords(num)
        return "No result"
    }

    fun secondOrderToWords(num: Int): String {
        val nums = num.toArray()
        if (nums[0] == 0) {
            return ""
        }
        if (nums[0] == 1) {
            return wordsOfFirstOrder[num]
        }
        if (nums[1] == 0) {
            return wordsOfSecondOrder[nums[0]]
        }
        return wordsOfSecondOrder[nums[0]] + " " + wordsOfFirstOrder[nums[1]]
    }

    fun thirdOrderToWords(num: Int): String {
        val nums = num.toArray()
        var res = wordsOfFirstOrder[nums[0]] + " " + hundredWord
        res = res + " " + secondOrderToWords(num - nums[0] * 100)
        return res
    }

    fun fourOrderToWords(num: Int): String {
        val secondGroup = num.toString().substring(num.length() - GROUP_LENGTH, num.length()).toInt()
        val firstGroup = num.toString().removeRange(num.length() - GROUP_LENGTH, num.length()).toInt()
        val res = numberToWords(firstGroup) + " " + groupDigitsToString(2) + " " + numberToWords(secondGroup)
        return res
    }

    fun fiveOrderToWords(num: Int): String {
        val thirdGroup = num.toString().substring(num.length() - GROUP_LENGTH, num.length()).toInt()
        val secondGroup = num.toString().substring(num.length() - 2 * GROUP_LENGTH, num.length() - GROUP_LENGTH).toInt()
        val firstGroup = num.toString().substring(0, num.length() - 2 * GROUP_LENGTH).toInt()
        val res =
            numberToWords(firstGroup) + " " + groupDigitsToString(3) +
                    " " + numberToWords(secondGroup) + " " + groupDigitsToString(2) +
                    " " + numberToWords(thirdGroup)
        return res
    }


    fun sixOrderToWords(num: Int): String {
        val fourthGroup = num.toString().substring(num.length() - GROUP_LENGTH, num.length()).toInt()
        val thirdGroup = num.toString().substring(num.length() - 2 * GROUP_LENGTH, num.length() - GROUP_LENGTH).toInt()
        val secondGroup =
            num.toString().substring(num.length() - 3 * GROUP_LENGTH, num.length() - 2 * GROUP_LENGTH).toInt()
        val firstGroup = num.toString().substring(0, num.length() - 3 * GROUP_LENGTH).toInt()
        val res =
            numberToWords(firstGroup) + " " + groupDigitsToString(4) +
                    " " + numberToWords(secondGroup) + " " + groupDigitsToString(3) +
                    " " + numberToWords(thirdGroup) + " " + groupDigitsToString(2)+
        " " + numberToWords(fourthGroup)
        return res
    }


    private fun countGroupNum(num: Int): Int {
        val groupCount = num.length() / GROUP_LENGTH
        var res = 0

        if (groupCount in 0..1)
            res = 1

        if (groupCount in 1..2)
            res = 2
        if (groupCount in 2..3)
            res = 3
        if (groupCount in 3..4)
            res = 4
        if (groupCount in 4..5)
            res = 5

        return res
    }

    fun groupDigitsToString(groupNum: Int): String {
        var res: String = ""
        when (groupNum) {
            1 -> res = hundredWord
            2 -> res = thousandWord
            3 -> res = millionWord
            4 -> res = billionWord
        }
        return res
    }

    companion object {
        const val GROUP_LENGTH = 3
    }
}


fun Int.length() = when (this) {
    0 -> 1
    else -> log10(abs(toDouble())).toInt() + 1
}

fun Int.toArray(): IntArray {
    return this.toString().toCharArray().map { it.toString().toInt() }.toIntArray()
}*/