/* Dynamic bottom-up. */
class Solution2 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] r=text1.toCharArray(), s=text2.toCharArray();
        int p=r.length, q=s.length;
        int[][] m = new int[p+1][q+1];
        for(int i=p-1; i>=0; i--)
            for(int j=q-1; j>=0; j--)
                if(r[i]==s[j]) m[i][j] = m[i+1][j+1]+1;
                else m[i][j] = Math.max(m[i+1][j],m[i][j+1]);
        return m[0][0];
    }
}
