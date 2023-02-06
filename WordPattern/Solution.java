class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String,Character> db = new HashMap();
        String[] d = new String[27];
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        for(int i=0; i<pattern.length(); i++) {
            if(d[pattern.charAt(i)-'a'] == null)
                d[pattern.charAt(i)-'a'] = words[i];
            else if(!d[pattern.charAt(i)-'a'].equals(words[i]))
                return false;
            if(!db.containsKey(words[i]))
                db.put(words[i],pattern.charAt(i));
            else if(db.get(words[i]) != pattern.charAt(i))
                return false;
        }
        return true;
    }
}
