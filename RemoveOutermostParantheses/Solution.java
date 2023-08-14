class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int b=0, q=0;
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(c==')') {
                --q;
                if(q==0) {
                    sb.append(s.substring(b+1,i));
                    b=i+1;
                }
            }
            else ++q;
        }
        return sb.toString();
    }
}
