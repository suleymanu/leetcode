// O(n) time. O(1) space. Chain of replacements.
class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k==0) return;
        for(int bgn=0, cnt=0; cnt<nums.length; bgn++) {
            int src=bgn, pre=nums[bgn];
            do {
                int dst=(src+k)%nums.length;
                int tmp=nums[dst];
                nums[dst]=pre;
                pre=tmp;
                src=dst;
                cnt++;
            } while(src!=bgn);
        }
    }
}
