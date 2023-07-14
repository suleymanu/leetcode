class Solution {
    public int numberOfDays(int year, int month) {
        int[] d = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        return month==2 && (year%400==0 || (year%100!=0 && year%4==0)) ? 29 : d[month];
    }
}
