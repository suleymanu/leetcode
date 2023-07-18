/* O(nlogn) time. Improved binary search. */
class Solution2 {
    public int countNegatives(int[][] grid) {
        int c=0, n=grid[0].length;
        for(int[] a:grid) {
            int l=0, r=n-1;
            while(l<=r) {
                int m=(r+l)/2;
                if(a[m]<0) r=m-1;
                else l=m+1;
            }
            c+=a.length-l;
            n=l; //new line search restricted
        }
        return c;
    }
}
