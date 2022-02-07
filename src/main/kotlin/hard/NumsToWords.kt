package hard

class NumsToWords {
    fun numberToWords(num: Int): String {
        return yieldIfNotEmpty(num.toString()).first()

    }

    private fun yieldIfNotEmpty(str: String): Sequence<String> {
        //  if (str != "") sequence { yield(str) }
        return sequence { yield(str) }
    }

    companion object {

        private val majors = arrayOf("", "Thousand", "Million", "Billion")

        private val tens =
            arrayOf("Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")

        private val minors = arrayOf(
            "",
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
    }

}