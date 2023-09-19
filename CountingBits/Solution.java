/* O(n) time. O(n) memory. No additional. */
class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n+1];
        a[0] = 0;
        int k = 1;
        for(int i=1, j=0; i<=n; i++, j++) {
            if(i==k) {k*=2; j=0;}
            a[i] = a[j]+1;
        }
        return a;
    }
}
    
