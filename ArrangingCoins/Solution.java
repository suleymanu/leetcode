/* O(logn). Binary search. */
class Solution {
    public int arrangeCoins(int n) {
        long l=0, r=(int)Math.pow(2,16);
        while(l<=r) {
            long m=l+(r-l)/2;
            if((m*(m+1))/2>n) r=m-1;
            else l=m+1;
        }
        return (int)r;
    }
}
