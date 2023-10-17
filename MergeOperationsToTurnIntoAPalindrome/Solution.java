class Solution {
    public int minimumOperations(int[] nums) {
        int i=0, j=nums.length-1, o=0;
        while(i<j) {
            if(nums[i]==nums[j]) {i++; j--;}
            else if(nums[i]<nums[j]) {nums[i+1]+=nums[i]; i++; o++;}
            else {nums[j-1]+=nums[j]; j--; o++;}
        }
        return o;
    }
}
