class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax=0;
        int pre=0;
        for(int i=0; i<brackets.length && income-pre>0; i++) {
            tax += (double)(Math.min(income,brackets[i][0])-pre)*brackets[i][1]/100;
            pre = brackets[i][0];
        }
        return tax;
    }
}
