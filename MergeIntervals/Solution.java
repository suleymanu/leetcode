class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> l = new ArrayList();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int s=intervals[0][0], e=intervals[0][1];
        for(int i=1;i<intervals.length;i++) {
            if(intervals[i][0]<=e) e=Math.max(e,intervals[i][1]);
            else {
                l.add(new int[]{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        l.add(new int[]{s,e});
        int[][] r = new int[l.size()][2];
        for(int i=0;i<l.size();i++) {
            r[i][0]=l.get(i)[0];
            r[i][1]=l.get(i)[1];
        }
        return r;
    }
}
