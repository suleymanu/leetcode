/* O(n) time. O(1) space. */
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i = 0;
        int p = 1;
        while(p<=n/2) {
            res[i++] = p;
            res[i++] = -1*p;
            p++;
        }
        if(n%2==1)
            res[i] = 0;
        return res;
    }
}
