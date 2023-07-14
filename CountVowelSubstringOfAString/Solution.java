class Solution {
    public int countVowelSubstrings(String word) {
        int r=0, vow=0;
        int[] m = new int[123];
        String v = new String("aeiou");
        char[] w = word.toCharArray();
        for(int i=0, j=0, k=0; i<w.length; i++) {
            if(v.indexOf(w[i])!=-1) {
                vow += (++m[w[i]]==1?1:0);
                for(;vow==5;++k) vow -= (--m[w[k]]==0?1:0);
                r += k-j;
            } else {
                k=j=i+1; vow=0;
                for(char ch:v.toCharArray()) m[ch]=0;
            }
        }
        return r;
    }
}
