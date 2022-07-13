/* O(n) time. O(n) space. StringBuilder. Reverse indexed. */
class Solution2 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i1 = num1.length()-1;
        int i2 = num2.length()-1;
        int c = 0, sum, v1, v2;
        while(i1>=0 || i2>=0) {
            v1 = i1>=0 ? num1.charAt(i1)-'0' : 0;
            v2 = i2>=0 ? num2.charAt(i2)-'0' : 0;
            sum = v1+v2+c;
            sb.append(sum%10);
            c = sum/10;
            i1--; i2--;
        }
        if(c>0) sb.append(c);
        return sb.reverse().toString();
    }
}
