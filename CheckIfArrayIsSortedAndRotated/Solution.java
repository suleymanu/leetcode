class Solution {
    public boolean check(int[] nums) {
        boolean found = false;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                if(!found) found = true;
                else return false;
            }
            if(found && nums[i] > nums[0]) return false;
        }
        return true;
    }
}
