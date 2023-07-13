/* No need to append. */
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length(), l2=word2.length();
        char[] r = new char[l1+l2];
        int s = Math.min(l1, l2);
        for(int i=0; i<s; i++) {
            r[i*2] = word1.charAt(i);
            r[i*2+1] = word2.charAt(i);
        }
        String b = l1>l2 ? word1 : word2;
        for(int i=s; i<b.length(); i++) r[s+i]=b.charAt(i);
        return new String(r);
    }
}
