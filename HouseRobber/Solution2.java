/* Bottom-up dynamic. O(1) space. */
class Solution {public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int m2=nums[0], m1=Math.max(m2,nums[1]), t;
        for(int i=2; i<nums.length; i++) {
            t = Math.max(m1,m2+nums[i]);
            m2=m1; m1=t;
        }
        return m1;
    }
}
