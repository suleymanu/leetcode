/* O(n) time. O(n) space. Just count and then calculate once you see 1. */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int z = 1;
        int p = 0;
        for(int i : flowerbed) {
            if(i==0)
                z++;
            else {
                p += (z-1)/2;
                z = 0;
            }
        }
        p += z/2;
        return p>=n;
    }
}
