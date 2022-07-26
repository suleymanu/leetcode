/* String manipulation. */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        String s = Integer.toBinaryString(n);
        int sum = 0;
        for(char c:s.toCharArray()) {
            if(c=='1') {
                if(sum==1) return false;
                else sum++;
            }
        }
        return sum==1;
    }
}
