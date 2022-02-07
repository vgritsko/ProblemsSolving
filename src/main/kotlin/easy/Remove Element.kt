package easy

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        var endIndex = nums.lastIndex
        var startIndex = 0
        while (endIndex > startIndex) {
            if (nums[startIndex] == `val`) {
                nums[startIndex] = nums[endIndex]
                endIndex = -1
            } else {
                startIndex = +1
            }
        }
        return endIndex
    }
}