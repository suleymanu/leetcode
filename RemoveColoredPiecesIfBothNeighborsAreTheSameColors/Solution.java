class Solution {
    public boolean winnerOfGame(String colors) {
        char[] c = colors.toCharArray();
        int r=0;
        for(int i=1; i<c.length-1; ++i) {
            if(c[i-1]=='A' && c[i]=='A' && c[i+1]=='A') r++;
            else if(c[i-1]=='B' && c[i]=='B' && c[i+1]=='B') r--;
        }
        return r>0;
    }
}
