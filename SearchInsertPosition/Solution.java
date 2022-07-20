class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r) {
            int i = l+(r-l)/2;
            if(nums[i]==target)
                return i;
            else if(nums[i]<target)
                l=i+1;
            else
                r=i-1;
        }
        return l;
    }
}
