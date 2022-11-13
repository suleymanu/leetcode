class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] m = new int[101];
        int s = 0;
        for(int n:nums) m[n]++;
        for(int i=0;i<101;i++) if(m[i]>1) s += m[i]*(m[i]-1)/2;
        return s;
    }
}
