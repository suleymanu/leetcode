/* A little bit shorter. */
class Solution2 {
    public int[][] merge(int[][] intervals) {
        List<int[]> l = new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int s=intervals[0][0], e=intervals[0][1];
        for(int i=1; i<intervals.length; ++i) {
            if(intervals[i][0]>e) {
                l.add(new int[]{s,e});
                s=intervals[i][0];
            }
            e=Math.max(e,intervals[i][1]);
        }
        l.add(new int[]{s,e});
        int[][] r = new int[l.size()][2];
        for(int i=0; i<l.size(); ++i) r[i] = l.get(i);
        return r;
    }
}
