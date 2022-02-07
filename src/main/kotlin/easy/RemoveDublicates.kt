package easy

class RemoveDuplicates {

    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var index = 0
        for (j in 1 until nums.size) {
            print(nums[j]);
            if (nums[j] != nums[index]) {
                index++
                nums[index] = nums[j]
            }
        }
        return index + 1
    }
}