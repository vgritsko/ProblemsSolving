package easy

class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        val map = nums.toSortedSet()
        return if (!map.add(target)){
            map.indexOf(target)
        } else {
            map.add(target)
            map.indexOf(target)
        }
    }
}