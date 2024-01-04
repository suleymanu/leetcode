class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0, m1 = 0, m2 = 0;
        for(int i=0; i<s.length()-1; ++i) {
            for(int j=i; j<=i+1; ++j) {
                int len = 0, l=i, r=j;
                for(;l>=0 && r<s.length() && s.charAt(l)==s.charAt(r);--l,++r) len+=l==r?1:2;
                if(len>maxLen) {
                    maxLen = len;
                    m1 = l+1;
                    m2 = r-1;
                }
            }
        }
        return s.substring(m1,m2+1);
    }
}
