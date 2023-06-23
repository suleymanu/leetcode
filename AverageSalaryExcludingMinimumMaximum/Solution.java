class Solution {
    public double average(int[] salary) {
        int min=salary[0], max=salary[0];
        int sum=0;
        for(int s : salary) {
            if(s>max) max=s;
            if(s<min) min=s;
            sum += s;
        }
        return (double) (sum-min-max) / (salary.length-2);
    }
}
