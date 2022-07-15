/* O(n) time. O(1) space. Two pointers. */
class Solution {
    public void moveZeroes(int[] nums) {
        int z=0, n=0;
        while(n<nums.length) {
            for(; z<nums.length && nums[z]!=0; z++);
            for(n=z+1; n<nums.length && nums[n]==0; n++);
            if(n>=nums.length)
                break;
            nums[z] = nums[n];
            nums[n] = 0;
        }
    }
}
