/* O(n^2) time. There is O(n) solution using rolling hash or KMP. */
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)) return true;
        s = s.concat(s);
        return s.contains(goal);
    }
}
