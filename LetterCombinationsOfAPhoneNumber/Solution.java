class Solution {
    public List<String> letterCombinations(String digits) {
        
        if(digits==null || digits.length()==0) return new ArrayList<String>();
        
        // creating the mapping
        int[] cnt = new int[10];
        for(int i=2; i<=6; ++i) cnt[i]=3;
        cnt[7]=4; cnt[8]=3; cnt[9]=4;
        char[][] m = new char[10][];
        for(int i=2; i<=9; ++i) m[i] = new char[cnt[i]];
        int a = 'a';
        for(int i=2; i<=9; ++i) for(int j=0; j<cnt[i]; j++) m[i][j] = (char)a++;
        
        // creating the stacks
        List<String> res = new ArrayList<>();
        List<Stack<String>> s = new ArrayList<>(2);
        s.add(new Stack<>()); s.add(new Stack<>());
        s.get(0).push("");
        int i=0;
        
        // popping and pushing interchangeably
        for(char d : digits.toCharArray()) {
            while(!s.get(i).isEmpty()) {
                String cur = s.get(i).pop();
                for(char c:m[d-'0']) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cur).append(c);
                    s.get(i^1).push(sb.toString());
                }
            }
            i ^= 1;
        }
        
        while(!s.get(i).isEmpty()) res.add(s.get(i).pop());
        return res;
    }
}
