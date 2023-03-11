/* Dynamic bottom-up. O(mn) space. [O(n) possible] */
class Solution {
    public int maximalSquare(char[][] matrix) {
        int r=matrix.length, c=matrix[0].length;
        int[][] dp = new int[r+1][c+1];
        int max=0;
        for(int i=r-1; i>=0; i--)
            for(int j=c-1; j>=0; j--)
                if(matrix[i][j]=='1') {
                    dp[i][j] = Math.min(Math.min(dp[i+1][j],dp[i][j+1]),dp[i+1][j+1])+1;
                    max = Math.max(max,dp[i][j]);
                }
        return max*max;
    }
}
