/* O(n) time. O(n) space. Uses Arrays.sort(). */
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1],a[1]));
        int res = 0, i = 0;
        while(truckSize>0 && i<boxTypes.length) {
            res += Math.min(truckSize,boxTypes[i][0]) * boxTypes[i][1];
            truckSize -= boxTypes[i][0];
            i++;
        }
        return res;
    }
}
