/* Dyanmic top-down. */
class Solution {
    Map<Integer,Integer> pts = new HashMap();
    Map<Integer,Integer> mem = new HashMap();
    public int dp(int n) {
        if(n==0) return 0;
        if(n==1) return pts.getOrDefault(1,0);
        if(!mem.containsKey(n))
            mem.put(n,Math.max(dp(n-1),dp(n-2)+pts.getOrDefault(n,0)));
        return mem.get(n);
    }
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int n:nums) {
            pts.put(n,pts.getOrDefault(n,0)+n);
            max = Math.max(max,n);
        }
        return dp(max);
    }
}
