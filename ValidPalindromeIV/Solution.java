class Solution {
    public boolean makePalindrome(String s) {
        int c=0, l=s.length();
        for(int i=0; i<l/2; i++)
            if(s.charAt(i)!=s.charAt(l-1-i))
                if(++c==3) return false;
        return true;
    }
}
