class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int diff = 0;
        List<Integer> diffList = new ArrayList();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=goal.charAt(i)) {
                diff++;
                if(diff>2) return false;
                diffList.add(i);
            }
        }
        if(diff==1 || diff>2) return false;
        if(diff==0) {
            int[] cnt = new int[26];
            for(int i=0; i<s.length(); i++) {
                cnt[s.charAt(i)-'a']++;
                if(cnt[s.charAt(i)-'a']==2)
                    return true;
            }
            return false;
        }
        int i = diffList.get(0);
        int j = diffList.get(1);
        return (s.charAt(i)==goal.charAt(j) && s.charAt(j)==goal.charAt(i));
    }
}
