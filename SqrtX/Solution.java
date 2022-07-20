class Solution {
    public int mySqrt(int x) {
        int l=0, r=x;
        while(l<=r) {
            int i = l+(r-l)/2;
            long s = (long)i*i;
            if(x==s) return i;
            else if(s<x) l=i+1;
            else r=i-1;
        }
        return r;
    }
}
