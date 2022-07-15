/* O(n) time. O(n) space. Saves previous answers. */
class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int[] res = new int[n+1];
        res[1] = 1;
        res[2] = 2;
        for(int i=3; i<=n; i++)
            res[i] = res[i-1] + res[i-2];
        return res[n];
    }
}
