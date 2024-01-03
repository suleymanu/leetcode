class Solution {
    public List<String> letterCombinations(String digits) {
        String[] m = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> r = new ArrayList<>();
        if(digits != null && digits.length()>0) r.add("");
        for(char c:digits.toCharArray()) {
            List<String> tr = new ArrayList<>();
            for(int i=0; i<m[c-'0'].length(); i++)
                for(int j=0; j<r.size(); j++)
                    tr.add(r.get(j)+m[c-'0'].charAt(i));
            r = tr;
        }
        return r;
    }
}
