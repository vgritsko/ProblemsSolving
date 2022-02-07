package easy

import kotlin.math.max

class BestTimeBuy {
    fun maxProfit(prices: IntArray): Int {
        var maxValue = 0
        var prevValue = 0

        for (i in prices.lastIndex downTo 1) {
            if (prices[i]>prevValue) {
                prevValue = prices[i]
                for (j in i - 1 downTo 0) {
                    var tempValue = prices[i] - prices[j]
                    if (tempValue > maxValue)
                        maxValue = tempValue
                }
            }
        }
        return maxValue

    }
}