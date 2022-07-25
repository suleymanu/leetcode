/* Shorter code. */
class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1, j=b.length()-1, c=0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0) {
            if(i>=0) {c += a.charAt(i)-'0'; i--;}
            if(j>=0) {c += b.charAt(j)-'0'; j--;}
            sb.append(c%2);
            c /= 2;
        }
        if(c!=0) sb.append(1);
        return sb.reverse().toString();
    }
}
