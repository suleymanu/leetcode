class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] r = new int[nums.length];
        Arrays.fill(r,1);
        int p=1;
        for(int i=0; i<r.length-1; ++i) {
            p*=nums[i];
            r[i+1]=p;
        }
        p=1;
        for(int i=r.length-1; i>0; --i) {
            p*=nums[i];
            r[i-1]*=p;
        }
        return r;
    }
}
