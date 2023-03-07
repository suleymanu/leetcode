/* Bottom-up dynamic. O(1) space. */
class Solution {
    public int tribonacci(int n) {
        if(n<2) return n;
        int m3=0, m2=1, m1=1, t;
        for(int i=3; i<=n; i++) {
            t = m3+m2+m1;
            m3=m2; m2=m1; m1=t;
        }
        return m1;
    }
}
