class Solution {
    public long numberOfWays(String s) {
        long o=0, z=0, oz=0, zo=0, r=0;
        for(char c:s.toCharArray()) {
            if(c=='0') {
                z++; oz+=o; r+=zo;
            } else {
                o++; zo+=z; r+=oz;
            }
        }
        return r;
    }
}
