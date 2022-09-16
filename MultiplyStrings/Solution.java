class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int l = num1.length() + num2.length();
        char[] result = new char[l];
        for(int i=0; i<l; i++)
            result[i] = '0';
        for(int i=num1.length()-1; i>=0; i--) {
            int elde = 0;
            for(int j=num2.length()-1; j>=0; j--) {
                int sum = (num1.charAt(i)-'0')*(num2.charAt(j)-'0')+elde+(result[i+j+1]-'0');
                result[i+j+1] = (char)((sum%10)+'0');
                elde = sum/10;
            }
            result[i] = (char)(elde+'0');
        }
        String res;
        if(result[0]=='0') res = new String(result,1,result.length-1);
        else res = new String(result);
        return res;
    }
}
