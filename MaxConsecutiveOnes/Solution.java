class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0, c=0;
        for(int i:nums) if(i==0) {m=Math.max(m,c); c=0;} else c++;
        return Math.max(m,c);
    }
}
