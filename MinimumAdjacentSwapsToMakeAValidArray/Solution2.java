// Check max from right to left
class Solution {
    public int minimumSwaps(int[] nums) {
        int a=0, z=nums.length-1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<nums[a]) a=i;
            if(nums[nums.length-1-i]>nums[z]) z=nums.length-1-i;
        }
        return a+nums.length-z-1-(a>z?1:0);
    }
}
