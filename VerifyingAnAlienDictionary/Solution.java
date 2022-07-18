/* O(n) time. n: number of total characters. O(1) space. */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];
        for(int i=0; i<26; i++)
            map[order.charAt(i)-'a'] = i;
        String pre = words[0];
        for(int i=1; i<words.length; i++) {
            for(int j=0; ; j++) {
                if(j==pre.length())
                    break;
                else if(j==words[i].length())
                    return false;
                else if(map[pre.charAt(j)-'a'] > map[words[i].charAt(j)-'a'])
                    return false;
                else if(map[pre.charAt(j)-'a'] < map[words[i].charAt(j)-'a'])
                    break;
            }
            pre = words[i];
        }
        return true;
    }
}
