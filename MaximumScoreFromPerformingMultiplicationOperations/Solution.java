/* Dynamic top-down. */
class Solution {
    int[] nu, mu;
    int n, m;
    int[][] mem;
    public int maximumScore(int[] nums, int[] multipliers) {
        nu = nums; mu = multipliers;
        n = nu.length; m = mu.length;
        mem = new int[m][m];
        for(int i=0;i<m;i++) for(int j=0;j<m;j++) mem[i][j]=-1;
        return dp(0,0);
    }
    public int dp(int i, int l) {
        if(i==m) return 0;
        if(mem[i][l]==-1)
            mem[i][l] = Math.max(mu[i]*nu[l]+dp(i+1,l+1),mu[i]*nu[n-1-i+l]+dp(i+1,l));
        return mem[i][l];
    }
}
