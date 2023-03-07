/* Top-down dynamic. Uses array. */
class Solution {
    int[] s;
    int[] n;
    
    public int rob(int[] nums) {
        n = nums;
        s = new int[n.length];
        for(int i=0; i<n.length; i++) s[i]=-1;
        return dp(n.length-1);
    }
    
    public int dp(int k) {
        if(k==0) return n[0];
        else if(k==1) return Math.max(n[0],n[1]);
        else if(s[k]==-1) s[k] = Math.max(dp(k-2)+n[k],dp(k-1));
        return s[k];
    }
}
