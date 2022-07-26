/* Bit manipulation. */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n>1) {
            if((n&1)==1) return false;
            n = n>>1;
        }
        return true;
    }
}
