class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        int sum = 0;
        for(char c : chars.toCharArray())
            freq[c-'a']++;
        for(String w : words) {
            int[] wFreq = new int[26];
            boolean cantWrite = false;
            for(char c : w.toCharArray())
                if((++wFreq[c-'a'])>freq[c-'a']) {
                    cantWrite = true;
                    break;
                }
            if(!cantWrite)
                sum += w.length();
        }
        return sum;
    }
}
