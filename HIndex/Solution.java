/* Counting sort. O(n) time. O(n) space. */
class Solution {
    public int hIndex(int[] citations) {
        int l = Math.min(1000,citations.length), r = 0;
        int[] c = new int[l+1];
        for(int i:citations) c[Math.min(i,l)]++;
        for(int i=l; i>=0; --i) if((r+=c[i])>=i) return i;
        return 0;
    }
}
