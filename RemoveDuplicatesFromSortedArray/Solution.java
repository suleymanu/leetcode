/* O(n) time. O(1) place. One-pass. Min moves. */
class Solution {
    public int removeDuplicates(int[] nums) {
        int loc=0;
        for(int i=1; i<nums.length; i++)
            if(nums[i]!=nums[loc])
                nums[++loc]=nums[i];
        return loc+1;
    }
}
