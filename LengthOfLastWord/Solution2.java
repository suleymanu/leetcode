/* Efficient approach. O(n) time. O(1) space. */
class Solution2 {
    public int lengthOfLastWord(String s) {
        int j, i=s.length()-1;
        while(i>=0 && s.charAt(i)==' ') --i;
        for(j=i; j>=0 && s.charAt(j)!=' '; --j);
        return i-j;
    }
}
