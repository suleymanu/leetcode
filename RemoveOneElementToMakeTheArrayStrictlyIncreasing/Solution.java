class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int c=0;
        for(int i=1; i<nums.length && c<2; ++i) {
            if(nums[i]<=nums[i-1]) {
                ++c;
                if(i>1 && nums[i]<=nums[i-2])
                    nums[i] = nums[i-1];
            }
        }
        return c<2;
    }
}
