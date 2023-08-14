class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean in=false, de=false;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]>nums[i-1]) in=true;
            else if(nums[i]<nums[i-1]) de=true;
            if(in && de) return false;
        }
        return true;
    }
}
