package easy

class MergeSortedArray {

    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        for (i in 0 until n) {
            nums1[m + i] = nums2[i]
            var indexNum = m + i
            while (indexNum > 0 && (nums1[indexNum - 1] >= nums1[indexNum])) {
                swap(nums1, indexNum - 1, indexNum)
                indexNum--
            }
        }
    }

    private fun swap(nums: IntArray, leftIndex: Int, rightIndex: Int) {
        val temp = nums[leftIndex]
        nums[leftIndex] = nums[rightIndex]
        nums[rightIndex] = temp
    }
}