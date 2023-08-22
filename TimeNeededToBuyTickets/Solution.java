/* O(n) time. O(1) space. */
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int r=0;
        for(int i=0; i<=k; ++i) r+=Math.min(tickets[i],tickets[k]);
        for(int i=k+1; i<tickets.length; ++i) r+=Math.min(tickets[i],tickets[k]-1);
        return r;
    }
}
