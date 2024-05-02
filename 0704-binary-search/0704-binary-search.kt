class Solution {
    fun search(nums: IntArray, target: Int): Int {
        for(i in 0 .. nums.size-1)
        {
            if(nums[i] == target) return i
        }
        return -1
    }
}