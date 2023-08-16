/* XOR would be faster. */
class Solution {
    public char findTheDifference(String s, String t) {
        int[] n = new int[27];
        for(char c:s.toCharArray()) n[c-'a']++;
        for(char c:t.toCharArray()) {if(n[c-'a']==0) return c; n[c-'a']--;}
        return '1';
    }
}
