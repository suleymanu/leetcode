/* O(n) time. O(n) space. Easy once you see the trick. */
class Solution {
    public int removePalindromeSub(String s) {
        for(int i=0; i<s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return 2;
        return 1;
    }
}
