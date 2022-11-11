class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int d=columnNumber-1;
        while(d>=0) {
            sb.append((char)('A'+d%26));
            d = d/26-1;
        }
        return sb.reverse().toString();
    }
}
