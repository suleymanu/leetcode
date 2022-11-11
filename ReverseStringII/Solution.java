/* Worked on first trial. */
class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int n = s.length();
        int l=0, r=k-1;
        int t = n/(2*k);
        for(int i=0; i<t; i++) {
            for(;l<r;l++,r--) {
                char ch = c[l];
                c[l] = c[r];
                c[r] = ch;
            }
            l = (i+1)*2*k;
            r = l+k-1;
        }
        l = t*2*k;
        r = Math.min(l+k-1,n-1);
        for(;l<r;l++,r--) {
            char ch = c[l];
            c[l] = c[r];
            c[r] = ch;
        }
        return new String(c);
    }
}
