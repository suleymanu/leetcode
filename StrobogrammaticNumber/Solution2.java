/* Array instead of map. */
class Solution {
    //0:0 1:1 6:9 8:8 9:6
    public boolean isStrobogrammatic(String num) {
        char[] m = new char[]{'0','1','\0','\0','\0','\0','9','\0','8','6'};
        for(int i=0; i<num.length(); i++)
            if(m[num.charAt(i)-'0']!=num.charAt(num.length()-1-i))
                return false;
        return true;
    }
}
