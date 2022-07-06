/* O(n) time. O(1) space. Is it readable? */
class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        int a=0, w=0;
        while(w<word.length() && a<abbr.length()) {
            if(abbr.charAt(a)==word.charAt(w)) {
                w++;
                a++;
            }
            else if(abbr.charAt(a)>'0' && abbr.charAt(a)<='9') {
                int num = 0;
                while(a < abbr.length() && 
                      abbr.charAt(a)>='0' && 
                      abbr.charAt(a)<='9') {
                    num *= 10;
                    num += abbr.charAt(a++) - '0';
                }
                w += num;
            }
            else
                return false;
        }
        return a==abbr.length() && w==word.length();
    }
}
