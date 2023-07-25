class Solution {
    public int maximumDifference(int[] nums) {
        int x=0, msf=nums[0];
        for(int i=1;i<nums.length;++i) {
            if(nums[i]<msf) msf=nums[i];
            else if((nums[i]-msf)>x) x=nums[i]-msf;
        }
        return x==0?-1:x;
    }
}
