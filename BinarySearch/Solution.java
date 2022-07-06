/* O(logn) time. O(1) space. Dont overthink. Just divide by 2. */
class Solution {
    public int search(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r) {
            int x = (l+r)/2;
            if(nums[x]==target)
                return x;
            else if(nums[x]>target)
                r = x-1;
            else
                l = x+1;
        }
        return -1;
    }
}
