class Solution {
    public int minDeletionSize(String[] strs) {
        int l = strs[0].length();
        int a = strs.length;
        int c = 0;
        for(int i=0; i<l; i++)
            for(int j=1; j<a; j++)
                if(strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    c++; break;
                }
        return c;
    }
}
