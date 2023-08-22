/* O(n) time. O(1) space. */
class Solution {
    public int longestPalindrome(String s) {
        int o=0;
        int[] a = new int[58];
        for(char c:s.toCharArray()) a[c-65]++;
        for(int i=0; i<58; ++i) if(a[i]%2==1) o++;
        return s.length()-o+(o==0?0:1);
    }
}
