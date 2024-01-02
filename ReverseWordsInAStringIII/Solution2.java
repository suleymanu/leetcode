class Solution2 {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        for(int i=0, j=0; i<c.length && j<c.length;) {
            while(j<c.length && c[j]!=' ') ++j;
            int k=j-1;
            while(i<k) {
                char t = c[i];
                c[i] = c[k];
                c[k] = t;
                ++i; --k;
            }
            i = j = j+1;
        }
        return new String(c);
    }
}
