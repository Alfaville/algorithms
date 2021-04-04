package algorithms.leetcode

/**
 * https://leetcode.com/problems/two-sum/
 */

//Brute Force - O(n2)
fun twoSumBruteForce(nums: IntArray, target: Int): IntArray? {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] == target - nums[i]) {
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No two sum solution")
}

//two-pass Hash Table - O(n)
fun onePassSumHashTable(nums: IntArray, target: Int): IntArray? {
    val map: MutableMap<Int, Int> = HashMap()
    for (i in nums.indices) {
        var complement: Int = target - nums[i]
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[nums[i]] = i
    }
    throw IllegalArgumentException("No two sum solution")
}
