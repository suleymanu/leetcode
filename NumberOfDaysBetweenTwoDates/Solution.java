class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1971(date1)-daysFrom1971(date2));
    }
    
    public int daysFrom1971(String date) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] a = date.split("-");
        int year = Integer.valueOf(a[0]);
        int month = Integer.valueOf(a[1]);
        int day = Integer.valueOf(a[2]);
        for(int i=1971; i<year; i++)
            day += isLeap(i) ? 366 : 365;
        for(int i=0; i<month-1; i++)
            day += days[i];
        if(month>2 && isLeap(year)) day++;
        return day;
    }
    
    public boolean isLeap(int year) {
        return ((year%4==0 && year%100!=0) || (year%400==0));
    }
}
