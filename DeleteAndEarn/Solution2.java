/* Dynamic bottom-up. */
class Solution2 {
    Map<Integer,Integer> pts = new HashMap();
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for(int n:nums) {
            pts.put(n,pts.getOrDefault(n,0)+n);
            max = Math.max(max,n);
        }
        int[] r = new int[max+1];
        r[1] = pts.getOrDefault(1,0);
        for(int i=2; i<=max; i++)
            r[i] = Math.max(r[i-1],r[i-2]+pts.getOrDefault(i,0));
        return r[max];
    }
}
