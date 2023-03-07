/* Bottom-up dynamic. O(1) space. */
class Solution3 {
    public int minCostClimbingStairs(int[] cost) {
        int m1=0, m2=0, t=0;
        for(int i=2; i<=cost.length; i++) {
            t = Math.min(m2+cost[i-2],m1+cost[i-1]);
            m2=m1; m1=t;
        }
        return t;
    }
}
