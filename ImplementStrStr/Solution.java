/* First trial. Worked. */
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int n=0;
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            boolean eq = true;
            for(int j=0; j<needle.length(); j++)
                if(haystack.charAt(i+j)!=needle.charAt(j)) {
                    eq = false;
                    break;
                }
            if(eq) return i;
        }
        return -1;
    }
}
