class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        List<Character> l = new ArrayList();
        List<Character> v = new ArrayList();
        char[] va = {'a','e','i','o','u','A','E','I','O','U'};
        for(char ch:va) v.add(ch);
        for(int i=0; i<c.length; i++)
            if(v.contains(c[i])) l.add(c[i]);
        int x = l.size()-1;
        for(int i=0; i<c.length; i++)
            if(v.contains(c[i])) {
                c[i] = l.get(x--);
            }
        return new String(c);
    }
}
