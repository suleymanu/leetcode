/* O(n) time. O(n) space. No need to increment or decrement like a stack. */
class Solution {
    public int countBinarySubstrings(String s) {
        int res=0, pre=0, cur=1; 
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i-1) != s.charAt(i)) {
                res += Math.min(pre,cur);
                pre = cur;
                cur = 1;
            } else {
                cur++;
            }
        }
        res += Math.min(pre,cur);
        return res;
    }
}
