class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] t = new boolean[n+1];
        int[] s = new int[n+1];
        for(int[] a : trust) {
            t[a[0]] = true;
            s[a[1]] += a[0];
        }
        int sum = n * (n+1) / 2;
        for(int i=1; i<=n; i++)
            if(!t[i] && s[i]==sum-i) return i;
        return -1;
    }
}
