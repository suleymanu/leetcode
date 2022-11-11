/* Shorter version. */
class Solution2 {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for(int b=0; b<c.length; b+=2*k) {
            int l=b, r=Math.min(l+k-1,c.length-1);
            while(l<r) {
                char ch = c[l];
                c[l++] = c[r];
                c[r--] = ch;
            }
        }
        return new String(c);
    }
}
