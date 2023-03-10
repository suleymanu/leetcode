/* Dynamic bottom-up. Space efficient. */
class Solution3 {
    Map<Integer,Integer> pts = new HashMap();
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int n:nums) {
            pts.put(n,pts.getOrDefault(n,0)+n);
            max = Math.max(max,n);
        }
        int m2 = 0;
        int m1 = pts.getOrDefault(1,0);
        for(int i=2; i<=max; i++) {
            int t = Math.max(m1,m2+pts.getOrDefault(i,0));
            m2=m1; m1=t;
        }
        return m1;
    }
}
