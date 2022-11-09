/* O(logn) time. Binary search. */
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0, r = (int) Math.pow(2,16);
        while(l<=r) {
            int m = (l+r)/2;
            double s = Math.pow(m,2);
            if(s == num) return true;
            else {
                if(s < num) l = m+1;
                else r = m-1;
            }
        }
        return false;
    }
}
