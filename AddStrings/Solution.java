/* O(n) time. O(n) space. Uses char array. 0-indexed. */
class Solution {
    public String addStrings(String num1, String num2) {
        int lim = Math.max(num1.length(),num2.length());
        int d1=0, d2=0, sum=0, d=0, e=0;
        char[] res = new char[lim+1];
        for(int i=0; i<lim; i++) {
            if(i<num1.length())
                d1 = num1.charAt(num1.length()-1-i) - '0';
            else
                d1 = 0;
            if(i<num2.length())
                d2 = num2.charAt(num2.length()-1-i) - '0';
            else
                d2 = 0;
            sum = d1+d2+e;
            d = sum%10;
            e = sum/10;
            res[res.length-1-i] = (char)('0' + d);
        }
        res[0] = (char)('0'+e);
        int offset = res[0]!='0' ? 0 : 1;
        return new String(res,offset,res.length-offset);
    }
}
