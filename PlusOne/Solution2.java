/* Stopping condition. */
class Solution2 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; --i) {
            if(digits[i]==9) digits[i]=0;
            else{ digits[i]++; return digits;}
        }
        int[] r = new int[digits.length+1];
        r[0] = 1;
        return r;
    }
}
