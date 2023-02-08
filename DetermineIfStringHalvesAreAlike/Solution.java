class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt = 0;
        for(int i=0; i<s.length()/2; i++)
            if(isVowel(s.charAt(i))) cnt++;
        for(int i=s.length()/2; i<s.length(); i++)
            if(isVowel(s.charAt(i))) cnt--;
        return cnt==0;
    }

    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
               c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}
