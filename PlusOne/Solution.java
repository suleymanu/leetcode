/* First trial. Could be improved by stopping once you see digit less than 9. */
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; --i) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        if(carry==1) {
            int[] r = new int[digits.length+1];
            r[0] = 1;
            return r;
        }
        return digits;
    }
}
