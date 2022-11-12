class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] m = new int[26];
        int s = 0;
        for(char c:sentence.toCharArray()) {
            if(m[c-'a']==0) {
                m[c-'a'] = 1;
                s++;
                if(s==26) return true;
            }
        }
        return false;
    }
}
