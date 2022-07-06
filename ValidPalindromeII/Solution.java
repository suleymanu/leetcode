/* O(n) time. O(n) space. Modular parametric code. Supports multiple deletions. */
class Solution {
    public boolean validPalindrome(String s, int delete) {
        int h = 0, t = s.length() -1;
        while(h<s.length()/2 && t>=s.length()/2) {
            if(s.charAt(h) == s.charAt(t)) {
                h++;
                t--;
            } else {
                if(delete==0)
                    return false;
                else
                    return validPalindrome(s.substring(h,t),delete-1) || 
                        validPalindrome(s.substring(h+1,t+1),delete-1);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int delete = 1;
        return validPalindrome(s,delete);
    }
}
