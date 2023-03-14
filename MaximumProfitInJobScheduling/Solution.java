/* Dynamic top-down.
Arrays.binarySearch() is unpredictable when multiple entries present. */
class Solution {
    int n;
    int[] st;
    int[][] jobs;
    Map<Integer,Integer> m = new HashMap();
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        st = startTime;
        n = st.length;
        jobs = new int[n][3];
        for(int i=0; i<n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs, (a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0; i<n; i++) st[i] = jobs[i][0];
        return dp(0);
    }
    public int dp(int i) {
        if(i==n) return 0;
        if(!m.containsKey(i)) {
            int next = Arrays.binarySearch(st,jobs[i][1]);
            if(next<0) next=-next-1;
            else while(st[next-1]==jobs[i][1]) --next;
            m.put(i,Math.max(dp(i+1),jobs[i][2]+dp(next)));
        }
        return m.get(i);
    }
}
