class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String,Integer> ms = new HashMap<>();
        Map<Character,Integer> mc = new HashMap<>();
        int max = 0;
        for(int i=0; i<s.length(); ++i) {
            mc.merge(s.charAt(i), 1, Integer::sum);
            if(i>=minSize-1 && mc.size()<=maxLetters)
                ms.merge(s.substring(i-minSize+1, i+1), 1, Integer::sum);
            if(i>=minSize-1 && mc.merge(s.charAt(i-minSize+1), -1, Integer::sum)==0)
                mc.remove(s.charAt(i-minSize+1));
        }
        for(Map.Entry<String,Integer> e:ms.entrySet())
            max = Math.max(max, e.getValue());
        return max;
    }
}
