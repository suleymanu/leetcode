class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] m = new int[101];
        int s = 0;
        for(int n:nums) s += m[n]++;
        return s;
    }
}
