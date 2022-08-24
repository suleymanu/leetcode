/* Faster and cleaner. */
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-3; i>=0; i--)
            if(nums[i+2] < (nums[i+1]+nums[i]))
                return nums[i]+nums[i+1]+nums[i+2];
        return 0;
    }
}
