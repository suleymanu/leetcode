/* Gauss. */
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int l = nums.length;
        for(int n : nums)
            sum += n;
        return l*(l+1)/2-sum;
    }
}
