class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.",
                              "....","..",".---","-.-",".-..","--","-.",
                              "---",".--.","--.-",".-.","...","-","..-",
                              "...-",".--","-..-","-.--","--.."};
        Set<String> uniqueSet = new HashSet();
        int uniqueCount = 0;
        for(String word : words) {
            StringBuilder morse = new StringBuilder();
            for(char c : word.toCharArray())
                morse.append(morseCode[c-'a']);
            if(!uniqueSet.contains(morse.toString())) {
                uniqueSet.add(morse.toString());
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
