/* The same thing. Almost. */
class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int one=-1, two=-1, min=wordsDict.length;
        for(int i=0; i<wordsDict.length; i++) {
            if(wordsDict[i].equals(word1))
                one = i;
            else if(wordsDict[i].equals(word2))
                two = i;
            if(one!=-1 && two!=-1)
                min = Math.min(min,Math.abs(two-one));
        }
        return min;
    }
}
