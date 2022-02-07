package challengemarch

/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
Input: nums = [1,2,2,4]
Output: [2,3]

Input: nums = [1,1]
Output: [1,2]
 */

class Solution {
    fun findErrorNums(nums: IntArray): IntArray {

        val duplicate = nums.toList().groupingBy { it }.eachCount().keys.toIntArray()[0]
        val sumArray = nums.sum()
        val sum = sum(nums.size)
        val diff = sumArray - sum
        return intArrayOf(duplicate, duplicate - diff)
    }

    private fun sum(maxValue: Int): Int {
        var sum = 0
        for (i in 1..maxValue) {
            sum += i
        }
        return sum
    }

    private fun findMissedValue(
        duplicate: Int,
        nums: IntArray

    ): IntArray {
        var missedValue = duplicate
        if (nums.contains(duplicate.plus(1))) {
            missedValue--
        } else {
            missedValue++
        }
        return intArrayOf(duplicate, missedValue)

    }

    private fun findMissedValueShortArray(
        duplicate: Int,
        nums: IntArray

    ): IntArray {
        var missedValue = duplicate
        if ((duplicate < nums.max()!! && duplicate > nums.min()!!) || (duplicate == MIN_VALUE)) {
            missedValue++
        } else {
            missedValue--
        }
        return intArrayOf(duplicate, missedValue)
    }

    companion object {
        const val MIN_VALUE = 1
        const val MAX_VALUE = 10_000
    }
}