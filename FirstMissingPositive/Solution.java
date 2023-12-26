/* Change negatives and zeros to n+1 in first iteration. */
class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; ++i)
            if(nums[i]<=0 || nums[i]>nums.length)
                nums[i] = nums.length+1;
        for(int i=0; i<nums.length; ++i) {
                int n = Math.abs(nums[i])-1;
                if(n<nums.length && nums[n]>0) nums[n] *= -1;
        }
        for(int i=0; i<nums.length; ++i)
            if(nums[i]>=0) return i+1;
        return nums.length+1;
    }
}
