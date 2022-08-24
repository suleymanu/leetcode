/* First trial. No need to sort descending. */
class Solution2 {
    public int largestPerimeter(int[] nums) {
        int r = 0;
        Arrays.sort(nums);
        for(int i=0; i<(nums.length/2); i++) {
            int t = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[i];
            nums[i] = t;
        }
        for(int i=0; i<nums.length-2; i++)
            if(nums[i] < (nums[i+1]+nums[i+2])) {
                r = nums[i]+nums[i+1]+nums[i+2];
                break;
            }
        return r;
    }
}
