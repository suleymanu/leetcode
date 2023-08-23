/* Euclid-Euler theorem. */
class Solution {
    public boolean checkPerfectNumber(int num) {
        int[] p = {2,3,5,7,13};
        for(int i:p) if(Math.pow(2,i-1)*(Math.pow(2,i)-1)==num) return true;
        return false;
    }
}
