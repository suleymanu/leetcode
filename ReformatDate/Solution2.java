/* Faster array manipulation. */
class Solution2 {
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
        char[] res = new char[10];
        char[] year = dates[2].toCharArray();
        for(int i=0;i<4;i++)
            res[i] = year[i];
        res[4]='-';
        char[] month = months.get(dates[1]).toCharArray();
        for(int i=0;i<2;i++)
            res[5+i] = month[i];
        res[7]='-';
        char[] day = dates[0].toCharArray();
        if(dates[0].length()==3) {
            res[8] = '0';
            res[9] = day[0];
        }
        else {
            res[8] = day[0];
            res[9] = day[1];
        }
        return new String(res);
    }
}
