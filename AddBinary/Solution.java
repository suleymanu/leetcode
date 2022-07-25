/* O(n) time. O(n) space. Fast coding. */
class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb = new StringBuilder();
        for(; i>=0 && j>=0; i--, j--) {
            int sum = a.charAt(i)-'0' + b.charAt(j)-'0' + c;
            sb.append(sum%2);
            c = sum/2;
        }
        for(; i>=0; i--) {
            int sum = a.charAt(i)-'0' + c;
            sb.append(sum%2);
            c = sum/2;
        }
        for(; j>=0; j--) {
            int sum = b.charAt(j)-'0' + c;
            sb.append(sum%2);
            c = sum/2;
        }
        if(c!=0)
            sb.append(1);
        return sb.reverse().toString();
    }
}
