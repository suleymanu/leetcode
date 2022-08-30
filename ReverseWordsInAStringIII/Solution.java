class Solution {
    public String reverseWords(String s) {
        
        int i=0, l=s.length();
        char[] c = s.toCharArray();
        
        while(i<l) {
            while(i<l && c[i]==' ') i++;
            int b = i;
            while(i<l && c[i]!=' ') i++;
            int e = i-1;
            while(b<e) {
                char t = c[b];
                c[b] = c[e];
                c[e] = t;
                b++;
                e--;
            }
        }
        
        return new String(c);
    }
}
