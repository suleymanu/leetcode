/* Regular sort. O(nlogn) time. O(1) space. */
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i=0; i<citations.length; ++i) 
            if(citations[citations.length-1-i]<=i)
                return i;
        return citations.length;
    }
}
