import java.lang.Math.abs
import java.lang.Math.log10

class Solution {

    fun numberToWords(num: Int): String {
        val numGroups = divideNumToGroups(num)
        var words = arrayListOf<String>()
        numGroups.forEachIndexed() { index, element -> words.add(groupNumToStr(element, index)) }

        return clean(words)
    }

    fun clean(words: List<String>): String {
        var result = words.reversed().joinToString(" ")
        if (!result.equals(wordsOfNumFirstOrder[0])) {
            result = result.replace(wordsOfNumFirstOrder[0], "").replace("\\s+".toRegex(), " ").trimEnd()
        }
        return result
    }

    private fun groupNumToStr(num: Int, groupNum: Int): String {
        var numStr: String = ""
        when (num.length()) {
            1 -> numStr = wordsOfNumFirstOrder[num]
            2 -> numStr = numSecondOrderToWords(num)
            3 -> numStr = numThirdOrderToWords(num)
        }
        return if (!numStr.equals(wordsOfNumFirstOrder[0])) {
            val rankName = groupRankToString(groupNum)
            if (groupNum == 0) numStr
            else "$numStr $rankName"
        } else {
            numStr
        }

    }

    private fun numSecondOrderToWords(num: Int): String {
        val nums = num.toArray()
        if (nums[0] == 0) {
            return ""
        }
        if (nums[0] == 1) {
            return wordsOfNumFirstOrder[num]
        }
        if (nums[1] == 0) {
            return wordsOfNumSecondOrder[nums[0]]
        }
        return wordsOfNumSecondOrder[nums[0]] + " " + wordsOfNumFirstOrder[nums[1]]
    }


    private fun numThirdOrderToWords(num: Int): String {
        if (num == 0) return ""
        val nums = num.toArray()
        var res = wordsOfNumFirstOrder[nums[0]] + " $hundredWord"
        if (num - nums[0] * 100 == 0) return res
        return if (num - nums[0] * 100 > wordsOfNumFirstOrder.size - 1) {
            res + " " + numSecondOrderToWords(num - nums[0] * 100)
        } else {
            res + " " + wordsOfNumFirstOrder[num - nums[0] * 100]
        }
    }

    private fun divideNumToGroups(num: Int): List<Int> {
        val reversedNumStr = num.toString().reversed()
        var numGroups = reversedNumStr.chunked(GROUP_LENGTH).map { it.reversed() }.map { it.toInt() }
        numGroups.forEach { println(it) }
        return numGroups
    }

    fun groupRankToString(groupNum: Int): String =
        when (groupNum) {
            1 -> thousandWord
            2 -> millionWord
            3 -> billionWord
            else -> ""
        }

    companion object {
        private const val GROUP_LENGTH = 3
        private val wordsOfNumFirstOrder = arrayOf(
            "Zero",
            "One",
            "Two",
            "Three",
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
            "Nineteen"
        )
        private val wordsOfNumSecondOrder =
            arrayOf("Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
        private val hundredWord = "Hundred"
        private val thousandWord = "Thousand"
        private val millionWord = "Million"
        private val billionWord = "Billion"
    }
}


fun Int.length() = when (this) {
    0 -> 1
    else -> log10(abs(toDouble())).toInt() + 1
}

fun Int.toArray(): IntArray {
    return this.toString().toCharArray().map { it.toString().toInt() }.toIntArray()
}