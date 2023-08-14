class Solution {
    public int findClosestNumber(int[] nums) {
        int r=100001;
        for(int n:nums) if(Math.abs(n)<Math.abs(r) || n==Math.abs(r)) r=n;
        return r;
    }
}
