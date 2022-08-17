class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] map1 = new char[128];
        char[] map2 = new char[128];
        for(int i=0; i<s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(map1[sc]=='\0') map1[sc] = tc;
            else if(map1[sc]!=tc) return false;
            if(map2[tc]=='\0') map2[tc] = sc;
            else if(map2[tc]!=sc) return false;
        }
        return true;
    }
}
