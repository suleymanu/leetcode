class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean l=false,u=false,d=false,s=false,a=true;
        char p='|'; //unused char
        String e = "!@#$%^&*()-+";
        for(char c:password.toCharArray()) {
            if(c>='0' && c<='9') d=true;
            if(c>='a' && c<='z') l=true;
            if(c>='A' && c<='Z') u=true;
            if(e.indexOf(c)>=0) s=true;
            if(c==p) a=false;
            p=c;
        }
        return password.length()>=8 && l && u && d && s && a;
    }
}
