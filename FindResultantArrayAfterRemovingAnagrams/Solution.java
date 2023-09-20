class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> r = new ArrayList();
        String p = "";
        for(String w:words) {
            char[] a = w.toCharArray();
            Arrays.sort(a);
            String sa = new String(a);
            if(!sa.equals(p)) {r.add(w); p=sa;}
        }
        return r;
    }
}
