/* Prefix Sum / Sweeping. */
class Solution2 {
    public int maximumPopulation(int[][] logs) {
        int first=1950, last=2050, maxP=0, maxY=0, cnt=0;
        int[] y = new int[last-first+1];
        for(int[] log : logs) {
            ++y[log[0]-first];
            --y[log[1]-first];
        }
        for(int i=0; i<last-first+1; i++) {
            cnt += y[i];
            if(cnt > maxP) {
                maxP = cnt;
                maxY = i+first;
            }
        }
        return maxY;
    }
}
