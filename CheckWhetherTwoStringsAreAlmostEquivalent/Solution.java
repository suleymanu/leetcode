class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] d = new int[27];
        for(int i=0; i<word1.length(); i++) {
            d[word1.charAt(i)-'a']++;
            d[word2.charAt(i)-'a']--;
        }
        for(int i=0; i<27; i++) if(Math.abs(d[i])>3) return false;
        return true;
    }
}
