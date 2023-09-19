class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        boolean pe=false;
        int max=0, c=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]<=threshold) {
                if(nums[i]%2==0) {
                    if(!pe) c++;
                    else c=1;
                    pe=true;
                } else {
                    if(pe) c++;
                    else c=0;
                    pe=false;
                }
                max=Math.max(max,c);
            } else {
                pe=false;
                c=0;
            }
        }
        return max;
    }
}
