/* O(n) time. O(1) space. */
class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int pre = 1;
        int res = 2;
        for(int i=3; i<=n; i++) {
            res = pre + res;
            pre = res - pre;
        }
        return res;
    }
}
