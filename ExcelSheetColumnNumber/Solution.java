/* Right to left. */
class Solution {
    public int titleToNumber(String columnTitle) {
        int colNo = 0;
        for(int i=columnTitle.length()-1; i>=0; i--)
            colNo += (columnTitle.charAt(i)-'A'+1) * 
            Math.pow(26,columnTitle.length()-1-i);
        return colNo;
    }
}
