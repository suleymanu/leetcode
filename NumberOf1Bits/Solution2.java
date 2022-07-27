/* Bit manipulation. */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum=0, l=32;
        for(int i=0; i<l; i++) {
            sum += (n&1);
            n >>= 1;
        }
        return sum;
    }
}
