/* Separate function approach. Neat. */
class Solution2 {
    
    int[] map = new int[26];
    
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0; i<26; i++)
            map[order.charAt(i)-'a'] = i;
        for(int i=1; i<words.length; i++)
            if(!compareStrings(words[i-1],words[i]))
                return false;
        return true;
    }
    
    public boolean compareStrings(String a, String b) {
        for(int i=0; i<a.length() && i<b.length(); i++)
            if(a.charAt(i) != b.charAt(i))
                return map[a.charAt(i)-'a'] < map[b.charAt(i)-'a'];
        return a.length() <= b.length();
    }
}
