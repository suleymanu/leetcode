class Solution {
    public int jump(int[] nums) {
        int j=0, end=0, far=0;
        for(int i=0; i<nums.length-1; ++i) {
            far = Math.max(far, i+nums[i]);
            if(i==end) {
                j++;
                end = far;
            }
        }
        return j;
    }
}
