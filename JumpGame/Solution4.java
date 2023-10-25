// Greerdy. Whether a call has required jump capability.
class Solution {
    public boolean canJump(int[] nums) {
        int comp=1;
        for(int i=nums.length-2; i>=0; --i) {
            if(nums[i]<comp) comp++;
            else comp=1;
        }
        return comp==1;
    }
}
