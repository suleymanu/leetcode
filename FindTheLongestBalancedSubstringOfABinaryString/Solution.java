class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int m=0, o=0, z=0;
        char[] c=s.toCharArray();
        for(int i=0; i<c.length; ++i) {
            if(c[i]=='0') {
                if(i>0 && c[i-1]=='1') {m=Math.max(m,Math.min(z,o)); z=1; o=0;}
                else ++z;
            } else ++o;
        }
        m=Math.max(m,Math.min(z,o));
        return m*2;
    }
}
