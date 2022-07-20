/* Bad approach. No need to start with the smallest. Start with the greatest.
I guess I was dealing with binary search for too long. */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0, r=nums.length-1;
        while(l<=r) {
            int i = l+(r-l)/2;
            if(nums[i]<0)
                l=i+1;
            else
                r=i-1;
        }
        int[] result = new int[nums.length];
        int i=0;
        while(r>=0 && l<nums.length) {
            if(Math.abs(nums[r])<Math.abs(nums[l]))
                result[i++] = (int) Math.pow(nums[r--],2);
            else
                result[i++] = (int) Math.pow(nums[l++],2);
        }
        while(r>=0)
            result[i++] = (int) Math.pow(nums[r--],2);
        while(l<nums.length)
            result[i++] = (int) Math.pow(nums[l++],2);
        return result;
    }
}
