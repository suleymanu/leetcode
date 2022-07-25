/* Guzel cozdum he. Hizli da yazdim. <5dk. */
class Solution {
    public int minStartValue(int[] nums) {
        int sum=0, min=0;
        for(int n:nums)
            if((sum += n) < min) min=sum;
        return min>=0?1:(-min+1);
    }
}
