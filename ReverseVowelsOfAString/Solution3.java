/* O(n) lookup time. O(1) is possible. Check other solutions. */
class Solution3 {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String v = "aeiouAEIOU";
        for(int i=0, j=s.length()-1; i<j; ++i, --j) {
            for(; i<s.length() && v.indexOf(s.charAt(i))<0; ++i);
            for(; j>=0 && v.indexOf(s.charAt(j))<0; --j);
            if(i<j) {
                char t = c[i];
                c[i] = c[j];
                c[j] = t;
            }
        }
        return new String(c);
    }
}
