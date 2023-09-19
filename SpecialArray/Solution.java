class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++)
            if(nums[i]>=n-i && (i<1 || nums[i-1]<n-i)) return n-i;
        return -1;
    }
}
