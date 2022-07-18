/* O(n) time. O(n) space. Uses hash map and String methods. */
class Solution {
    public String reformatDate(String date) {
        Map<String,String> months = new HashMap();
        months.put("Jan","01");
        months.put("Feb","02");
        months.put("Mar","03");
        months.put("Apr","04");
        months.put("May","05");
        months.put("Jun","06");
        months.put("Jul","07");
        months.put("Aug","08");
        months.put("Sep","09");
        months.put("Oct","10");
        months.put("Nov","11");
        months.put("Dec","12");
        String[] dates = date.split(" ");
        String year = dates[2];
        String month = months.get(dates[1]);
        String day = dates[0].substring(0,dates[0].length()-2);
        day = (day.length()==1?"0":"")+day;
        return year+"-"+month+"-"+day;
    }
}
