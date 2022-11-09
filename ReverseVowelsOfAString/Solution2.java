/* Inline switch. Array check. */
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        char[] va = {'a','e','i','o','u','A','E','I','O','U'};
        int[] ia = new int[128];
        for(char ch:va) ia[(int)ch] = 1;
        int l=0, r=c.length-1;
        while(l<r) {
            while(l<r && ia[(int)c[l]]!=1) l++;
            while(l<r && ia[(int)c[r]]!=1) r--;
            if(l<r) {
                char t = c[l];
                c[l++] = c[r];
                c[r--] = t;
            }
        }
        return new String(c);
    }
}
