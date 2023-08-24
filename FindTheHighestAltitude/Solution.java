class Solution {
    public int largestAltitude(int[] gain) {
        int a=0, m=0;
        for(int i:gain) m=(a+=i)>m?a:m;
        return m;
    }
}
