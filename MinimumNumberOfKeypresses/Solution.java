class Solution {
    public int minimumKeypresses(String s) {
        int[] f=new int[26];
        int r=0;
        for(char c:s.toCharArray()) f[c-'a']++;
        Arrays.sort(f);
        for(int i=25;i>=17;i--) r+=f[i];
        for(int i=16;i>=8;i--)  r+=f[i]*2;
        for(int i=7;i>=0;i--)   r+=f[i]*3;
        return r;
    }
}
