/* O(n) time. O(1) space. XOR. */
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n : nums)
            res ^= n;
        return res;
    }
}
