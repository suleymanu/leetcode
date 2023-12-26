/* char[] as stack. */
class Solution2 {
    public boolean isValid(String s) {
        char[] t = new char[10000];
        char[] a = s.toCharArray();
        int l=-1;
        for(char c:a) {
            if(c=='(' || c=='[' || c=='{') t[++l]=c;
            else {
                if(c==')' && l>=0 && t[l]=='(' ||
                    c==']' && l>=0 && t[l]=='[' ||
                    c=='}' && l>=0 && t[l]=='{') --l;
                else return false;
            }
        }
        return l==-1;
    }
}
