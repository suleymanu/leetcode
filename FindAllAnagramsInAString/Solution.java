/* There is a better solution without array comparison. */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> r = new ArrayList<>();
        int[] a = new int[26], b = new int[26];
        for(char c:p.toCharArray()) a[c-'a']++;
        for(int i=0; i<s.length(); ++i) {
            b[s.charAt(i)-'a']++;
            if(i>=p.length()-1) {
                if(Arrays.equals(a,b)) r.add(i-p.length()+1);
                b[s.charAt(i-p.length()+1)-'a']--;
            }
        }
        return r;
    }
}
