/* There is a more optimized version. No need to be O(n). Could be close to logn. */
class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1) return 1;
        if(x==-1) return n%2==0?1:-1;
        double res;
        if(n>0) {
            res = x;
            for(int i=1; i<n; i++)
                res *= x;
        } else {
            x = 1/x;
            res = x;
            for(int i=-1; i>n; i--) {
                if(res==0) return 0;
                res *= x;
            }
        }
        return res;
    }
}
