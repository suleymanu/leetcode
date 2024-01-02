class Solution2 {
    public boolean isPalindrome(String s) {
        for(int i=0, j=s.length()-1; i<j; ++i, --j) {
            for(; i<s.length() && !Character.isLetterOrDigit(s.charAt(i)); ++i);
            for(; j>=0 && !Character.isLetterOrDigit(s.charAt(j)); --j);
            if(i<s.length()-1 && j>= 0) {
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            }
        }
        return true;
    }
}
