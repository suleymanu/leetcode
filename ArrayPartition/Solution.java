/* Classical sorting. O(nlogn). */
class Solution {
    public int arrayPairSum(int[] nums) {
        int r=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2) r+=nums[i];
        return r;
    }
}
