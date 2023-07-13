class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, c=0, j=nums.length-1;
        while(i<=j) {
            while(i<nums.length && nums[i]!=val) i++;
            while(j>=0 && nums[j]==val) {c++; j--;}
            if(j>i) {nums[i]=nums[j]; c++; i++; j--;}
        }
        return nums.length-c;
    }
}
