class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        for(int i=0; i<s.length(); ++i)
            cnt += countPals(s,i,i) + countPals(s,i,i+1);
        return cnt;
    }

    protected int countPals(String s, int l, int r) {
        int cnt = 0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            cnt++; l--; r++;
        }
        return cnt;
    }
}
