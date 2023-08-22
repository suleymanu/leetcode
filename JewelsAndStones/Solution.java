/* O(n) time. O(1) space. */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int r=0;
        int[] j = new int[58];
        for(char c:jewels.toCharArray()) j[c-65]=1;
        for(char c:stones.toCharArray()) if(j[c-65]==1) r++;
        return r;
    }
}
