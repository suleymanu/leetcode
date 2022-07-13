class Solution {
    public boolean isPalindrome(String s) {
        char[] a = new char[s.length()];
        char diff = 'a' - 'A';
        int x = 0;
        for(int i=0; i<s.length(); i++) {
            if('a'<=s.charAt(i) && s.charAt(i)<='z' || 
               '0'<=s.charAt(i) && s.charAt(i)<='9') {
                a[x] = s.charAt(i);
                x++;
            }
            else if('A'<=s.charAt(i) && s.charAt(i)<='Z') {
                a[x] = (char)(s.charAt(i) + diff);
                x++;
            }
        }
        for(int i=0; i<x/2; i++)
            if(a[i] != a[x-1-i])
                return false;
        return true;
    }
}
