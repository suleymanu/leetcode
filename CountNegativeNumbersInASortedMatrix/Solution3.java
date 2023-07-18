/* O(n+m) time. */
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0, n=grid[0].length, j=n-1;
        for(int[] r:grid) {
            while(j>=0 && r[j]<0) j--;
            c += n-j-1;
        }
        return c;
    }
}
