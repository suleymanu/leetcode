/* String conversion. */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0;
        for(char c:Integer.toBinaryString(n).toCharArray())
            if(c=='1') sum++;
        return sum;
    }
}
