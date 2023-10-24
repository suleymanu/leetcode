// Regular approach but there is a shorter version. Just compare nums[i] vs nums[i-2].
class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        boolean f=false;
        for(int i=1; i<nums.length; i++) {
            if(nums[j]!=nums[i]) {
                nums[++j]=nums[i];
                f=false;
            } else if(!f) {
                nums[++j]=nums[i];
                f=true;
            }
        }
        return j+1;
    }
}
