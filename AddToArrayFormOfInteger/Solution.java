class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = k;
        for(int i=0; i<num.length; i++) {
            int sum = num[num.length-1-i]+carry;
            num[num.length-1-i] = sum%10;
            carry = sum/10;
            if(carry==0) break;
        }
        List<Integer> res = new ArrayList();
        while(carry!=0){
            res.add(carry%10);
            carry /= 10;
        }
        Collections.reverse(res);
        for(int i:num) res.add(i);
        return res;
    }
}
