/* XOR. */
class Solution2 {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++)
            res ^= i^nums[i];
        return res;
    }
}
