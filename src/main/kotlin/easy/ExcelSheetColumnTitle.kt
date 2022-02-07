package easy

import kotlin.math.log
import kotlin.math.roundToInt


class ExcelSheetColumnTitle {

    val chars = arrayOf(
        'Z',
        'A',
        'B',
        'C',
        'D',
        'E',
        'F',
        'G',
        'H',
        'I',
        'J',
        'K',
        'L',
        'M',
        'N',
        'O',
        'P',
        'Q',
        'R',
        'S',
        'T',
        'U',
        'V',
        'W',
        'X',
        'Y'
    )
    val result: StringBuilder = java.lang.StringBuilder()

    fun convertToTitle(columnNumber: Int): String {
        var n = columnNumber

        while (n > 0) {
            result.append(chars[n % DIVIDER])
            n = (n - 1) / DIVIDER
        }
        return result.toString().reversed()
    }

    companion object {
        const val DIVIDER = 26
    }
}