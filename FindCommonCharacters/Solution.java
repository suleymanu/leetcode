class Solution {
    public List<String> commonChars(String[] words) {
        int[] min = new int[27];
        for(int i=0;i<27;i++) min[i]=Integer.MAX_VALUE;
        int[] wc = new int[27];
        for(String w:words) {
            for(int i=0;i<27;i++) wc[i]=0;
            for(int i=0; i<w.length(); i++) wc[w.charAt(i)-'a']++;
            for(int i=0; i<27; i++) min[i] = Math.min(min[i],wc[i]);
        }
        List<String> r = new ArrayList<>();
        char[] cs = new char[27];
        cs[0] = 'a';
        for(int i=0; i<27; i++) cs[i] = (char)(cs[0]+i);
        for(int i=0; i<27; i++)
            for(int j=0; j<min[i]; j++)
                r.add(String.valueOf(cs[i]));
        return r;
    }
}
