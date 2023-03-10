/* Dynamic top-down. First trial. Goes back. */
class Solution {
    int[][] m;
    char[] a,b;
    public int longestCommonSubsequence(String text1, String text2) {
        int p=text1.length(), q=text2.length();
        m = new int[p][q];
        for(int i=0;i<p;i++) for(int j=0;j<q;j++) m[i][j]=-1;
        a=text1.toCharArray(); b=text2.toCharArray();
        return dp(p-1,q-1);
    }
    public int dp(int i, int j) {
        if(i<0||j<0) return 0;
        return m[i][j]=m[i][j]!=-1?m[i][j]:a[i]==b[j]?dp(i-1,j-1)+1:Math.max(dp(i-1,j),dp(i,j-1));
    }
}
