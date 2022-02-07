package easy

internal class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        return nums.groupBy { it }
            .filterValues { it.size == 1 }
            .keys.elementAt(0)
    }
}