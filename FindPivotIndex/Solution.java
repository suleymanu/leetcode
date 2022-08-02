/* First. Fast. */
class Solution {
    public int pivotIndex(int[] nums) {
        if(nums==null || nums.length==0) return -1;
        if(nums.length==1) return 0;
        int rsum=0, lsum=0;;
        for(int i=1; i<nums.length; i++) rsum+=nums[i];
        for(int i=1; i<nums.length; i++) {
            if(lsum==rsum) return i-1;
            lsum += nums[i-1];
            rsum -= nums[i];
        }
        if(lsum==rsum) return nums.length-1;
        return -1;
    }
}
