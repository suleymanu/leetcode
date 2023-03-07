/* Top-down dynamic. */
class Solution2 {
    int[] c;
    int[] s;
    public int minCostClimbingStairs(int[] cost) {
        this.c = cost;
        this.s = new int[c.length+1];
        for(int i=0; i<s.length; i++) s[i]=-1;
        return dp(s.length-1);
    }
    public int dp(int n) {
        if(n==0 || n==1) return 0;
        if(s[n]==-1) s[n]=Math.min(dp(n-2)+c[n-2],dp(n-1)+c[n-1]);
        return s[n];
    }
}
