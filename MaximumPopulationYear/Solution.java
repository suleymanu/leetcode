/* Not the best approach. Use Prefix Sum / Sweeping. */
class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPop=0, maxYear=0;
        for(int i=1950; i<=2050; i++) {
            int count = 0;
            for(int[] log : logs)
                if(log[0]<=i && i<log[1])
                    count++;
            if(count > maxPop) {
                maxPop = count;
                maxYear = i;
            }
        }
        return maxYear;
    }
}
