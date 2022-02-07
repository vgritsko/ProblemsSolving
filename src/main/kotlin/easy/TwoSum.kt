package easy

import java.lang.IllegalArgumentException

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (index in nums.indices) {
            val complement = target - nums[index]
            if (map.containsKey(complement)){
                return intArrayOf(map.get(complement)!!,index)
            }
            map[nums[index]] = index
        }
        throw IllegalArgumentException("no params for solution")
    }
}