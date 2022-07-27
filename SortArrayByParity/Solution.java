class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int o=0, e=nums.length-1;
        while(o<e) {
            while(o<nums.length-1 && nums[o]%2==0) o++;
            while(e>=0 && nums[e]%2==1) e--;
            if(o<e) {
                int temp = nums[o];
                nums[o] = nums[e];
                nums[e] = temp;
            }
        }
        return nums;
    }
}
